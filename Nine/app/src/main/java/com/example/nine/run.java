package com.example.nine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.nine.util.Utils;

public class run extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{

    private TextView bbs;
    private TextView control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);

        control = findViewById(R.id.control);
        control.setOnClickListener(this);
        control.setOnLongClickListener(this);
        bbs = findViewById(R.id.bbs);
        bbs.setOnClickListener(this);
        bbs.setOnLongClickListener(this);
        bbs.setMovementMethod(new ScrollingMovementMethod());
    }

    private String[] str = {"你好啊","你是谁","你吃了吗","你在干什么","我太难了"};
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.control || v.getId() == R.id.bbs){
            int random = (int)(Math.random() * 10) % 5;
            String newStr = String.format("%s\n%s %s",bbs.getText().toString(), Utils.getNowTime(), str[random]);
            bbs.setText(newStr);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId() == R.id.control || v.getId() == R.id.bbs){
            bbs.setText("");
        }
        return false;
    }
}