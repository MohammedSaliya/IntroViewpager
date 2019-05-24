package com.example.introviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void replay(View view) {
        PreferenceManager preferenceManager = new PreferenceManager(getApplicationContext());
        preferenceManager.setFirstTimeLaunch(true);
        startActivity(new Intent(MainActivity.this, MainScreen.class));
        finish();
    }
}
