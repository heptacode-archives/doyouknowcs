package kim.hyunwoo.doyouknowcs;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondFragment extends Fragment {
    ArrayList<MealModel> data;
    CalendarView calendar;

    public SecondFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        calendar = view.findViewById(R.id.calendar);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String year = String.valueOf(i);
                String month= String.valueOf(i1+1);

                if(month.length()==1){
                    month="0"+month;
                }

                Log.e("asdf", (year+"-"+month));

                RetrofitHelper.getInstance().getAnotherMonthMeal().enqueue(new Callback<Meal>() {
                    @Override
                    public void onResponse(Call<Meal> call, Response<Meal> response) {
                        data = response.body().getData();
                        for(MealModel item:data){
                            Log.e(item.getDate(), item.getMeal());
                        }
                    }

                    @Override
                    public void onFailure(Call<Meal> call, Throwable t) {
                        Log.e("asdf", t.getMessage());
                        Log.e("asdf", t.toString());
                    }
                });
            }
        });
        return view;
    }

}
