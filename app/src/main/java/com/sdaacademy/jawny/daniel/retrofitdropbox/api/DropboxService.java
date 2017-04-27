package com.sdaacademy.jawny.daniel.retrofitdropbox.api;

import com.sdaacademy.jawny.daniel.retrofitdropbox.model.DropboxCurrentAccountResponse;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DropboxService {

    @Headers({
            "User-Agent: api-explorer-client",
            "Content-Type: application/json"
    })
    @POST("2/users/get_current_account")
    Call<DropboxCurrentAccountResponse> getCurrentAccount(@Header("Authorization") String authorization);
}