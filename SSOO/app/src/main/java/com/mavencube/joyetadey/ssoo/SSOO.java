package com.mavencube.joyetadey.ssoo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SSOO extends AppCompatActivity {
    public static int SPLASH_TIME=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssoo);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {

                                              Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                                              startActivity(intent);

                                          finish();
                                      }
                                  },SPLASH_TIME
        );
    }
}
