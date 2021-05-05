package com.example.trivia;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class logged_In_Screen extends AppCompatActivity implements View.OnClickListener {

    private Context Sign_Up_Context;
    private TextView username_display;
    private Button start_new_game_button;

    private Button statistics_button;
    private PopupWindow statisticsPopupWindow;
    private LayoutInflater statisticsLayout;
    private RelativeLayout relativeLayout;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged__in__screen);

        start_new_game_button = findViewById(R.id.start_new_game);
        username_display = findViewById(R.id.usernameDisplay);

        statistics_button = findViewById(R.id.statistics);
        relativeLayout = (RelativeLayout) findViewById(R.id.relative);

        statistics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statisticsLayout = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) statisticsLayout.inflate(R.layout.statistics, null);

                statisticsPopupWindow = new PopupWindow(container, 400, 400, true);
                statisticsPopupWindow.showAtLocation(relativeLayout, Gravity.NO_GRAVITY, 500, 500);

                container.setOnTouchListener(new View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent){
                        statisticsPopupWindow.dismiss();
                        return true;
                    }
                });
            }
        });
     }


    @Override
    public void onClick(View v) {

    }
}