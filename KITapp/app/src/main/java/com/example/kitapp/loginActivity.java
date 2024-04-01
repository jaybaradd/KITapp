package com.example.kitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class loginActivity extends AppCompatActivity implements View.OnClickListener {

    Button nextBtn = findViewById(R.id.Nextbtn);
    EditText email = findViewById(R.id.emailInput);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), loginPasswordActivity.class);
        startActivity(intent);
    }
}