package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sign_up;
    private Button log_in;
    private EditText username;
    private EditText password;
    private Switch dark_mode_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dark mode button
        dark_mode_switch = (Switch) findViewById(R.id.dark_mode);

        //Sign Up and Log In Buttons
        sign_up = findViewById(R.id.sign_up_button);
        log_in = findViewById(R.id.log_in_button);

        username = findViewById(R.id.username_login);
        password = findViewById(R.id.password_login);

        SignUpScreen sign_up_object = new SignUpScreen();

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == sign_up) {
                    startActivity(new Intent(MainActivity.this, SignUpScreen.class));
                }

                if (v == log_in){
                    Intent intent_main_activity = new Intent(MainActivity.this, logged_In_Screen.class);
                    intent_main_activity.putExtra("username", username.getText().toString());
                    intent_main_activity.putExtra("password", password.getText().toString());

                    startActivity(intent_main_activity);
                }
                //Note
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}