package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu_userPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_user);

        TextView loginPage=findViewById(R.id.LoginPage);
        loginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu_userPage.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        TextView registerPage=findViewById(R.id.RegisterPage);
        registerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu_userPage.this, User_RegisterActivity.class);
                startActivity(intent);
            }
        });

        TextView Security=findViewById(R.id.Security);
        Security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu_userPage.this, Security.class);
                startActivity(intent);
            }
        });

        TextView Contact=findViewById(R.id.Contact);
        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Menu_userPage.this, Contact.class);
                startActivity(intent);
            }
        });
    }
}