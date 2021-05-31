package com.cuberto.liquidswipetest;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val pager = findViewById<LiquidPager>(R.id.pager)
//        pager.adapter = Adapter(supportFragmentManager)
//
//
//    }
//}


