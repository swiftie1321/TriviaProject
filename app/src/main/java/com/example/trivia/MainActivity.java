package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Initiate the Sign Up button
    private Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initiate a Switch
        Switch dark_mode_switch = (Switch) findViewById(R.id.dark_mode);

        //Displayed text on switch button
        dark_mode_switch.setTextOn("yes");
        dark_mode_switch.setTextOff("no");

        //Sign Up Button
        sign_up = findViewById(R.id.sign_up_buttom);
        SignUpScreen sign_up_object = new SignUpScreen();

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUpScreen.class));
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}