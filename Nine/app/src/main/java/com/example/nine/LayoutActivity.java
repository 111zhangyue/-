package com.example.nine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LayoutActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mar;
    private boolean isPaused = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        mar = findViewById(R.id.mar);
        mar.setOnClickListener(this);
        mar.requestFocus();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.mar){
            isPaused = !isPaused;
            if(isPaused){
                mar.setFocusable(false);
                mar.setFocusableInTouchMode(false);
            }else{
                mar.setFocusable(true);
                mar.setFocusableInTouchMode(true);
                mar.requestFocus();
            }
        }
    }
}