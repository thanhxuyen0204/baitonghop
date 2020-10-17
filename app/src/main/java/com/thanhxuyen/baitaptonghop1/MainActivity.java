package com.thanhxuyen.baitaptonghop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
    }
    public void next(View view){
        Intent intent = new Intent(MainActivity.this, signin.class);
        startActivity(intent);
    }


}