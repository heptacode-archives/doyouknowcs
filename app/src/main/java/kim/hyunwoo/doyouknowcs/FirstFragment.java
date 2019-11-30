package kim.hyunwoo.doyouknowcs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FirstFragment extends Fragment {
    TextView textView;
    ArrayList<MealModel> data;

    public FirstFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        textView = view.findViewById(R.id.todayMeal);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        final String date = sdf.format(now);

        RetrofitHelper.getInstance().getMonthlyMeal().enqueue(new Callback<Meal>() {
            @Override
            public void onResponse(Call<Meal> call, Response<Meal> response) {
                Log.e("asdf", response.body().getData().get(0).getMeal());
                data = response.body().getData();
                for(MealModel item:data){
                    if(date.equals(item.getDate()))
                    {
                        textView.setText(item.getMeal());

                    }
                    Log.e(item.getDate(), item.getMeal());
                }
            }

            @Override
            public void onFailure(Call<Meal> call, Throwable t) {

            }
        });

        return view;
    }

}
