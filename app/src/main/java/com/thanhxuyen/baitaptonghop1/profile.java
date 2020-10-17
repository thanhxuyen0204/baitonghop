package com.thanhxuyen.baitaptonghop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        textView = (TextView) findViewById(R.id.tv_title) ;
        setDataByExtras();
    }
    public void move(View view){
        Intent intent =new Intent(profile.this, list.class);
        startActivity(intent);
    }


    public void setDataByExtras(){
        //nhập dữ liệu từ a
        Intent intent = getIntent();
        String title=intent.getStringExtra(login.SNAME);
        textView.setText(title);
    }
}