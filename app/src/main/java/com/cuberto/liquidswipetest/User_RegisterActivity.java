package com.cuberto.liquidswipetest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class User_RegisterActivity extends AppCompatActivity {
    TextView company_registerBtn;
    Switch simpleSwitch1;
    ImageView user_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        company_registerBtn=findViewById(R.id.company_registerBtn);
        company_registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(User_RegisterActivity.this, Company_Register.class);
                startActivity(intent);
            }
        });

        //switch ni check hiih uyd Rule huudsiig duudah
        simpleSwitch1 = (Switch) findViewById(R.id.switch1);
        simpleSwitch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(User_RegisterActivity.this, Rule_user.class );
                startActivity(intent);
            }
        });

        ImageView backBtn=findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(User_RegisterActivity.this, Menu_userPage.class);
                startActivity(intent);
            }
        });

//        user_back_img=findViewById(R.id.user_back_img);
//        user_back_img.animate().translationY(-2400).setDuration(1000).setStartDelay(100);

        Button login_userBtn=findViewById(R.id.login_userBtn);
        login_userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(User_RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}