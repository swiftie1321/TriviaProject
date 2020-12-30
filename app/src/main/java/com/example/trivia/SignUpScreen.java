package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import org.w3c.dom.Text;

public class SignUpScreen extends AppCompatActivity implements View.OnClickListener {

    private Context main_activity_context;
    private Text text_onscreen;

    public void setText_onscreen(Text text_onscreen) {
        this.text_onscreen = text_onscreen;
    }

    public SignUpScreen(Context main_activity_context) {
        this.main_activity_context = main_activity_context;
    }

    @Override
    public void onClick(View clicked_button){

        MainActivity main_activity_access = (MainActivity)main_activity_context;

        if (clicked_button == main_activity_access.getSign_up())
        {
            text_onscreen.setData("You are now on Sign Up screen!");
        }
    }
}