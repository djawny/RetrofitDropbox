package com.sdaacademy.jawny.daniel.retrofitdropbox.api;

import com.sdaacademy.jawny.daniel.retrofitdropbox.model.DropboxCurrentAccountResponse;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface DropboxService {

    String API_URL = "https://api.dropboxapi.com";

    @POST("2/users/get_current_account")
    Observable<DropboxCurrentAccountResponse> getCurrentAccount(@Header("Authorization") String authorization);

    static DropboxService makeDropboxService() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(API_URL)
                .build();
        return retrofit.create(DropboxService.class);
    }
}
