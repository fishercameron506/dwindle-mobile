package com.example.cameron.dwindle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread splashThread = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(3000);
                    Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(mainIntent);
                    finish();
                }catch(InterruptedException ex)
                {
                    ex.printStackTrace();
                }


            }
        };

        splashThread.start();
    }

}
