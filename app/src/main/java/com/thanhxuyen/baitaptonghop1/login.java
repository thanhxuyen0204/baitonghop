package com.thanhxuyen.baitaptonghop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private EditText editname;
    private Button button;
    public static final String SNAME = "SNAME";

    public login(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editname = (EditText) findViewById(R.id.editname);
        button = (Button) findViewById(R.id.bt_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editname.getText().toString();
                byExtras(name);
            }
        });
    }
    public  void byExtras(String name){
        Intent intent = new Intent(login.this, profile.class);
        intent.putExtra(SNAME,name );
        startActivity(intent);
    }
    public void click(View view){
        Intent intent = new Intent(login.this, signin.class);
        startActivity(intent);
    }


}