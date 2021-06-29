package com.example.xlent_devs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Xlent_Devs6 extends AppCompatActivity {

    AppCompatButton skip_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xlent__devs6);
        skip_button=findViewById(R.id.skip_button);

        skip_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next3 =new Intent(Xlent_Devs6.this,Xlent_Devs7.class);
                startActivity(next3);
            }
        });
    }
}