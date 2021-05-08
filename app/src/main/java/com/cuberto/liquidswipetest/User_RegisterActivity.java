package com.cuberto.liquidswipetest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class User_RegisterActivity extends AppCompatActivity {
    Button company_registerBtn;
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

    }
}