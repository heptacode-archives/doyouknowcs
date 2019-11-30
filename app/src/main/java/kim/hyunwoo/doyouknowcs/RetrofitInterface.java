package kim.hyunwoo.doyouknowcs;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("/meal/Jmonthly")
    Call<Meal> getMonthlyMeal();

    @GET("/meal/Jmonthly/{year}-{month}")
    Call<Meal> getAnotherMonthMeal(@Path("year") String year, @Path("month") String month);
}