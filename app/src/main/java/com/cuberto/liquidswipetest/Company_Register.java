package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Company_Register extends AppCompatActivity {
TextView lastname,registerUser;
ImageView company_back_img;
//    Context context = getApplicationContext();
//    CharSequence text = "Анхаар:Байгууллагын нэр бичихгүй";
//    int duration = Toast.LENGTH_SHORT;
    Switch simpleSwitch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company__register);

        lastname=findViewById(R.id.lastName);
        lastname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();
            }
        });

        //switch ni check hiih uyd Rule huudsiig duudah
        simpleSwitch1 = (Switch) findViewById(R.id.switch1);
        simpleSwitch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Company_Register.this, Rule_company.class );
                startActivity(intent);
            }
        });

        registerUser=findViewById(R.id.RegisterUserBtn);
        registerUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Company_Register.this, User_RegisterActivity.class );
                startActivity(intent);

            }
        });

        ImageView backBtn=findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Company_Register.this, Menu_userPage.class);
                startActivity(intent);
            }
        });

//        company_back_img=findViewById(R.id.back_img);
//        company_back_img.animate().translationY(-2400).setDuration(1000).setStartDelay(100);
        Button company_login=findViewById(R.id.company_login);
        company_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Company_Register.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}