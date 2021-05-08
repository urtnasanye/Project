package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Company_Register extends AppCompatActivity {
TextView lastname;
    Context context = getApplicationContext();
    CharSequence text = "Анхаар:Байгууллагын нэр бичихгүй";
    int duration = Toast.LENGTH_SHORT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company__register);

        lastname=findViewById(R.id.lastName);
        lastname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}