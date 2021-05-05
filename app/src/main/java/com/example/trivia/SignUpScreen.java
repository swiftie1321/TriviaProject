package com.example.trivia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpScreen extends AppCompatActivity implements View.OnClickListener {

    private Context main_activity_context;
    private Button signed_up_go_to_next_activity;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        //Connect Signed Up button, username and password from XML to JAVA code
        signed_up_go_to_next_activity = findViewById(R.id.signed_up_button);
        username = findViewById(R.id.editTextPersonName);
        password = findViewById(R.id.editTextNumberPassword);

        signed_up_go_to_next_activity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        if(v == signed_up_go_to_next_activity){
            Intent intent_sign_up = new Intent(this, logged_In_Screen.class);
            startActivity(intent_sign_up);
        }
    }

}