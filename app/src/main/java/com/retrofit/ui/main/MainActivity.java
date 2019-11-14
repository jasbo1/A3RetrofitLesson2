package com.retrofit.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.retrofit.R;
import com.retrofit.data.entity.weather.CurrentWeatherEntity;
import com.retrofit.data.network.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.retrofit.BuildConfig.WEATHER_KEY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitBuilder.getInstance().getCurrentWeather("Bishkek", WEATHER_KEY,"metric").enqueue(new Callback<CurrentWeatherEntity>() {
            @Override
            public void onResponse(Call<CurrentWeatherEntity> call, Response<CurrentWeatherEntity> response) {
                Log.d("asasdsd", "bbbbb");

            }

            @Override
            public void onFailure(Call<CurrentWeatherEntity> call, Throwable t) {
                Log.d("asasdsd", "bbbbb");

            }
        });

    }
    public static void start(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

}

