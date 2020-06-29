package com.ride.proyectomovilesridetransporte.providers;

import com.ride.proyectomovilesridetransporte.models.FCMBody;
import com.ride.proyectomovilesridetransporte.models.FCMResponse;
import com.ride.proyectomovilesridetransporte.retrofit.IFCMApi;
import com.ride.proyectomovilesridetransporte.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
