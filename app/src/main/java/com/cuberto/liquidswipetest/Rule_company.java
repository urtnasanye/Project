package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Rule_company extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);


        Button yesBtn =findViewById(R.id.RuleYesBtn);
        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean on = ((Switch) view).isChecked();
                if(on)
                {
                    Intent intent=new Intent(Rule_company.this, Company_Register.class);
                    startActivity(intent);
                }
            }
        });

        Button noBtn =findViewById(R.id.RuleNoBtn);
        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Rule_company.this, Menu_userPage.class);
                startActivity(intent);
            }
        });
    }
}