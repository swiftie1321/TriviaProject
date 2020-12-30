package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class logged_In_Screen extends AppCompatActivity implements View.OnClickListener {

    private Context Sign_Up_Context;
    private Button start_new_game_button;
    private Button statistics_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged__in__screen);
    }

    @Override
    public void onClick(View v) {

    }
}