package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView SaveBtn=findViewById(R.id.SaveBtn);
        SaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, Zar_oruulah.class);
                startActivity(intent);
            }
        });

//        TextView homeBtn=findViewById(R.id.homeBtn);
//        homeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(HomeActivity.this, HomeActivity.class);
//                startActivity(intent);
//                Toast.makeText(HomeActivity.this, "You clicked me.", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//
        TextView userBtn=findViewById(R.id.UserBtn);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, Menu_userPage.class);
                startActivity(intent);
            }
        });
//
//        notifBtn=findViewById(R.id.NotifBtn);
//        notifBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(HomeActivity.this, Company_Register.class);
//                startActivity(intent);
//            }
//        });
//


    }
}