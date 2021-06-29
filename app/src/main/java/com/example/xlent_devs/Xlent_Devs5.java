package com.example.xlent_devs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Xlent_Devs5 extends AppCompatActivity {

    AppCompatButton selectphotofromgallary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xlent__devs5);
        selectphotofromgallary=findViewById(R.id.selectphotofromgallary);

        selectphotofromgallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next2 =new Intent(Xlent_Devs5.this,Xlent_Devs6.class);
                startActivity(next2);

            }
        });
    }
}