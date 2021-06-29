package com.example.xlent_devs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Xlent_Devs4 extends AppCompatActivity {

    AppCompatButton next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xlent__devs4);
        next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next1 =new Intent(Xlent_Devs4.this,Xlent_Devs5.class);
                startActivity(next1);
            }

        });
    }
}