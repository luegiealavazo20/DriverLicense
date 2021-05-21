package com.example.mygroup1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NoData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_data);
    }

    public void back(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}