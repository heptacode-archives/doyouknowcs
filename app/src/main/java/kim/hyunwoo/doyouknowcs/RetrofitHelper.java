package kim.hyunwoo.doyouknowcs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {
    final static String url = "https://circlesapp.kr/";
    private static Retrofit retrofit;
    public static Gson gson=new GsonBuilder().setLenient().create();
    public static RetrofitInterface getInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

        }
        return retrofit.create(RetrofitInterface.class);
    }
}