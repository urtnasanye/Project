package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Rule_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule_user);

        Button yesBtn =findViewById(R.id.RuleYesBtn);
        yesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean on = ((Switch) view).isChecked();
                if(on)
                {
                   Intent intent=new Intent(Rule_user.this, User_RegisterActivity.class );
                   startActivity(intent);
                }


            }
        });

        Button noBtn =findViewById(R.id.RuleNoBtn);
        noBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Rule_user.this, Menu_userPage.class);
                startActivity(intent);
            }
        });

//        Switch onOffSwitch = (Switch)  findViewById(R.id.switch1);
//        onOffSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                Log.v("Switch State=", ""+isChecked);
//
//
//
//            }
//
//        });


    }
}