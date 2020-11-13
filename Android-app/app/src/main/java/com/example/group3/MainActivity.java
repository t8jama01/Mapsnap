package com.example.group3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //jos löytyy tallennettu user nii menee suoraa loginnin ohi
        if(SaveSharedPreference.getUserName(MainActivity.this).length() == 0)
        {
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
        }
        else
        {
            Intent mapsIntent = new Intent(this, MapsActivity.class);
            startActivity(mapsIntent);
        }
        
        //Map open intent
        //Intent mapsIntent = new Intent(this, MapsActivity.class);
        //startActivity(mapsIntent);

        //ProfileActivity
        //Intent profileIntent = new Intent(this, ProfileActivity.class);
        //startActivity(profileIntent);

        //Camera
        //Intent cameraIntent = new Intent(this, cameraActivity.class);
        //startActivity(cameraIntent);
    }
}