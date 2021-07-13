package com.example.aplikasiandroidberbasisgisandroid.api;

import com.example.aplikasiandroidberbasisgisandroid.model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}
