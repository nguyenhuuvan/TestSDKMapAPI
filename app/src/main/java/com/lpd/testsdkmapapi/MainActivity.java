package com.lpd.testsdkmapapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lpd.sdk.MapsActivity;
import com.lpd.sdk.TinhThanhPhoActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openCity(View view) {
        startActivity(new Intent(this, TinhThanhPhoActivity.class));
    }

    public void openMap(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }
}
