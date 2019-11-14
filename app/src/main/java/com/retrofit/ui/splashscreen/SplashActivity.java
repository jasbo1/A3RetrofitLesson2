package com.retrofit.ui.splashscreen;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


import com.retrofit.App;
import com.retrofit.R;
import com.retrofit.ui.main.MainActivity;
import com.retrofit.ui.onboard.OnBoardActivity;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        activitySelectorWithTimer ();
    }


    private void activitySelectorWithTimer() {
        int DELAY = 1000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                selectActivity();

            }
        }, DELAY); // handler для  на секунду посмотреть на сплеш скрин при входе
    }


    private void selectActivity(){

        if (App.getPreference().getFirstLaunch()){
            App.getPreference().setFirstLaunch();
            OnBoardActivity.start(this);

        }else {
           // OnBoardActivity.start(this);

           MainActivity.start(this);
        }

       /* overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
        finish();*/
    }

}


