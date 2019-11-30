package kim.hyunwoo.doyouknowcs;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FirstFragment extends Fragment {
    View view;
    TextView textView;
    ArrayList<MealModel> data;

    public FirstFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main, container, false);
        textView = view.findViewById(R.id.todayMeal);

        RetrofitHelper.getInstance().getMonthlyMeal().enqueue(new Callback<Meal>() {
            @Override
            public void onResponse(Call<Meal> call, Response<Meal> response) {
                Log.e("asdf", response.body().getData().get(0).getMeal());
                data = response.body().getData();
                for(MealModel item:data){
                    Log.e(item.getDate(), item.getMeal());
                }
            }

            @Override
            public void onFailure(Call<Meal> call, Throwable t) {

            }
        });

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

}
