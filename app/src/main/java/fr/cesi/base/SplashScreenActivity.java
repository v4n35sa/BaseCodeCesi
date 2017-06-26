package fr.cesi.base;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.cesi.basecode.R;

public class SplashScreenActivity extends AppCompatActivity {

    private Handler _handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        _handler = new Handler();

        _handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startNextActivity();
            }
        }, 3000);
    }

    private void startNextActivity() {
        //Intent intent = new Intent(TimerActivity.class);

        finish();
    }
}
