package com.example.registration_form;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView btn = findViewById(R.id.alreadyhaveanaccout);
        btn.setOnClickListener(view -> startActivity(new Intent(Register_Activity.this, Login_Activity.class)));
    }
}