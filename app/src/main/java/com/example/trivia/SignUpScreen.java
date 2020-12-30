package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class SignUpScreen extends AppCompatActivity implements View.OnClickListener {

    private Context main_activity_context;
    private Button signed_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        signed_up = findViewById(R.id.signed_up_button);
        logged_In_Screen logged_in_object = new logged_In_Screen();

        signed_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpScreen.this, logged_In_Screen.class));
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}