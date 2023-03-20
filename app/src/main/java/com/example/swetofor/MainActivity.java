package com.example.swetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
 View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @SuppressLint("ResourceAsColor")
    public void GreenButton(View view)
    {
        this.view.setBackgroundColor(R.color.green);
    }
    @SuppressLint("ResourceAsColor")
    public void YellowButton(View view)
    {
        this.view.setBackgroundColor(R.color.yellow);
    }
    @SuppressLint("ResourceAsColor")
    public void RedButton(View view)
    {
        this.view.setBackgroundColor(R.color.red);

    }

}