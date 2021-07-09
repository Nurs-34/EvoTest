package com.example.evo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evo.ui.login.LoginActivity;

public class FirstAuth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_auth);
    }

    public void enter_by_email(View view) {
        Intent intent = new Intent(FirstAuth.this, MainActivity.class);
        startActivity(intent);
    }

    public void sign_up_from_first_auth(View view) {
        Intent intent = new Intent(FirstAuth.this, LoginActivity.class);
        startActivity(intent);
    }
}