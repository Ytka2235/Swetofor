package com.example.swetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @SuppressLint("ResourceAsColor")
    public void GreenButton(View view)
    {
        ConstraintLayout main =  findViewById(R.id.main_activity);
        main.setBackgroundColor(getColor(R.color.green));
    }
    @SuppressLint("ResourceAsColor")
    public void YellowButton(View view)
    {
        ConstraintLayout main =  findViewById(R.id.main_activity);
        main.setBackgroundColor(getColor(R.color.yellow));
    }
    @SuppressLint("ResourceAsColor")
    public void RedButton(View view)
    {
        ConstraintLayout main =  findViewById(R.id.main_activity);
        main.setBackgroundColor(getColor(R.color.red));
    }

}