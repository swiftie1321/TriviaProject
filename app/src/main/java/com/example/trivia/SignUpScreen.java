package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignUpScreen extends AppCompatActivity implements View.OnClickListener {

    private Context main_activity_context;
    private Button signed_up_go_to_next_activity;
    private NumberPicker entered_user_age;
    private EditText age;
    private EditText username;
    private EditText password;
    private SharedPreferences users_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        //Connect Signed Up button, username and password from XML to JAVA code
        signed_up_go_to_next_activity = findViewById(R.id.signed_up_button);
        username = findViewById(R.id.editTextPersonName);
        password = findViewById(R.id.editTextNumberPassword);
        entered_user_age = findViewById(R.id.userAge);

        entered_user_age.setMinValue(1990);
        entered_user_age.setMaxValue(2020);

        signed_up_go_to_next_activity.setOnClickListener(this);
        users_list = getSharedPreferences("usersList", 0);

        entered_user_age.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                age.setText(newVal);
            }
        });
    }

    @Override
    public void onClick(View v){

        if(v == signed_up_go_to_next_activity){
            Intent intent_sign_up = new Intent(this, logged_In_Screen.class);
            intent_sign_up.putExtra("username", username.getText().toString());
            intent_sign_up.putExtra("password", password.getText().toString());
            intent_sign_up.putExtra("age", age.getText().toString());

            SharedPreferences.Editor edit = users_list.edit();
            edit.putString("username", username.getText().toString());
            edit.putString("password", password.getText().toString());
            edit.putString("age", age.getText().toString());
            edit.commit();
            Toast.makeText(this,"User Created!", Toast.LENGTH_SHORT).show();

            startActivity(intent_sign_up);
        }
    }

}