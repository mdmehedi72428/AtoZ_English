package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class a_favourite_teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_favourite_teacher);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("A Favourite Teacher");


    }
}