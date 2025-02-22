package com.example.scooter2.server;

import org.json.JSONObject;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Multipart
    @POST("/test/")
    Call<ResponseBody> requestPhoto(
            @Part  MultipartBody.Part photo);

    @POST("/signup1/")
    Call<ResponseBody> regist(
            @Body RequestBody requestBody
            );
    @POST("/signin1/")
    Call<ResponseBody> login(
            @Body RequestBody requestBody
    );
}
