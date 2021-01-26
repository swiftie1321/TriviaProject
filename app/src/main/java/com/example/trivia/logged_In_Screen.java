package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class logged_In_Screen extends AppCompatActivity implements View.OnClickListener {

    private Context Sign_Up_Context;
    private TextView username_display;
    private Button start_new_game_button;
    private Button statistics_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged__in__screen);

        //Connect button usernameDisplay, newGame and Statistics from XML to JAVA code
        start_new_game_button = findViewById(R.id.start_new_game);
        statistics_button = findViewById(R.id.statistics);
        username_display = findViewById(R.id.usernameDisplay);

        Intent intent = getIntent();
        String username = intent.getExtras().getString("username");
        String password = intent.getExtras().getString("password");

        username_display.setText("Hello " + username);

    }

    @Override
    public void onClick(View v) {

    }
}