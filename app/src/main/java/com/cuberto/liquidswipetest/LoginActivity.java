package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class LoginActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    ImageView login_purple_back,login_white_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        ImageView backBtn=findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, Menu_userPage.class);
                startActivity(intent);
            }
        });

        Button registerBtn=findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, User_RegisterActivity.class);
                startActivity(intent);
            }
        });

        lottieAnimationView=findViewById(R.id.lottie);


//        login_purple_back=findViewById(R.id.login_back_img);
//        login_purple_back.animate().translationY(-2400).setDuration(1000).setStartDelay(100);
//
//        login_white_back=findViewById(R.id.login_back_img);
//        login_white_back.animate().translationY(-2400).setDuration(1000).setStartDelay(100);
    }
}