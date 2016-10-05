package com.snackbox.snackboxkeeper_client.retrofit;

import com.snackbox.snackboxkeeper_client.api.SBKApis;
import com.snackbox.snackboxkeeper_client.constants.SBKConstants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dalejulian on 10/5/16.
 */

public class SBKRetrofitGenerator {
    private static OkHttpClient.Builder httpClient;
    private SBKApis api;
    private static SBKRetrofitGenerator instance;

    private SBKRetrofitGenerator() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        httpClient = new OkHttpClient.Builder().addInterceptor(interceptor);

        Retrofit builder = new Retrofit.Builder()
                .baseUrl(SBKConstants.DESTINATION_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        api = builder.create(SBKApis.class);
    }

    public static SBKRetrofitGenerator getInstance() {
        if (instance == null) {
            instance = new SBKRetrofitGenerator();
        }
        return instance;
    }

    public SBKApis getApis() {
        return api;
    }
}
