package com.example.signapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class activity_profile extends AppCompatActivity {

    TextView firstNameTextView;
    TextView lastNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        String message;
        Intent intent = getIntent();
        message = intent.getStringExtra("firstName");
        Log.i("Profile", message);
        firstNameTextView = findViewById(R.id.firstNameTextView);
        firstNameTextView.setText(message);
        lastNameTextView = findViewById(R.id.lastNameTextView);
        message = intent.getStringExtra("lastName");
        lastNameTextView.setText(message);
    }
}
