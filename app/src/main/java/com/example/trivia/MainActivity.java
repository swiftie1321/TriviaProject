package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button log_in, sign_up;
    private TextView welcome_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.welcome_text);
        log_in = findViewById(R.id.log_in_buttom);
        sign_up = findViewById(R.id.sign_up_buttom);

        log_in.setOnClickListener(this);
        sign_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View clicked_buttom){
        if (clicked_buttom == log_in)
        {

        }

        if (clicked_buttom == sign_up)
        {

        }
    }

}