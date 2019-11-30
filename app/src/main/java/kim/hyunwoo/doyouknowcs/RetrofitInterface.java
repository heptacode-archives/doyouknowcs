package kim.hyunwoo.doyouknowcs;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("/J")
    Call<Meal> getTodayMeal();

//    @GET("/Jmonthly")
//    Call<Meal> getMonthlyMeal();

//    @GET("/Jmonthly/{month}")
//    Call<Meal> getAnotherMonthMeal(@Path("month") String month);

    @GET("/Jmonthly/2019-11")
    Call<Meal> getAnotherMonthMeal();
}