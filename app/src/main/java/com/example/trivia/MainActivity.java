package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sign_up;
    private TextView output_text;

    public Button getSign_up() {
        return sign_up;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_up = findViewById(R.id.sign_up_buttom);

        SignUpScreen sing_up_object = new SignUpScreen(this);
        sign_up.setOnClickListener(sing_up_object);
    }


}