package com.example.objectanimatordemo;

import retrofit2.Retrofit;

public class RetrofitInstanceDe {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.myjson.com/";

    /**
     * Create an instance of Retrofit object
     * */
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .build();
        }
        return retrofit;
    }
}