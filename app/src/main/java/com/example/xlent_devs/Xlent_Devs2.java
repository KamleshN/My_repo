package com.example.xlent_devs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Xlent_Devs2 extends AppCompatActivity {

    AppCompatButton login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xlent__devs2);

        login_btn = findViewById(R.id.login_btn_xlent);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Xlent_Devs2.this , Xlent_Devs3.class);
                startActivity(intent);
            }
        });
    }
}