package com.example.spotifyfromaliexpress;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);


        bottomNavigationView.setItemIconTintList(null);
//        !!!!
    }

    frag1 frag1 = new frag1();
    frag2 frag2 = new frag2();
    frag3 frag3 = new frag3();
    frag4 frag4 = new frag4();
    frag5 frag5 = new frag5();
    frag6 frag6 = new frag6();
    frag7 frag7 = new frag7();
    frag8 frag8 = new frag8();
    frag9 frag9 = new frag9();
    frag10 frag10 = new frag10();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment1, frag1).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment2, frag2).commit();
            return true;
        } else if (item.getItemId() == R.id.search) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment1, frag3).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment2, frag4).commit();
            return true;
        } else if (item.getItemId() == R.id.player) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment1, frag5).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment2, frag6).commit();
            return true;
        } else if (item.getItemId() == R.id.library) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment1, frag7).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment2, frag8).commit();
            return true;
        } else if (item.getItemId() == R.id.profile) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment1, frag9).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment2, frag10).commit();
            return true;
        }
        return false;

    }

}