package com.cuberto.liquidswipetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    ImageView logo,  splashImg;
    TextView appName;
    LottieAnimationView lottieAnimationView;
    //    private static final int NUM_PAGES=3;
    private ViewPager viewPager;
    Handler handler;
    //    private ScreenSlidePagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //logo=findViewById(R.id.logo);
       // appName=findViewById(R.id.app_name);
        splashImg=findViewById(R.id.img);
        lottieAnimationView=findViewById(R.id.lottie);

//        viewPager.findViewById(R.id.pager);
//        pagerAdapter=new ScreenSlidePagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(pagerAdapter);


        splashImg.animate().translationY(-2400).setDuration(1000).setStartDelay(4000);
       // logo.animate().translationY(2000).setDuration(1000).setStartDelay(5000);
       // appName.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(2000).setDuration(1000).setStartDelay(4000);


        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
              //  Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                Intent intent = new Intent(SplashScreen.this, OnBoarding.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

    }

//    public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{
//
//        public ScreenSlidePagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//
////        @Override
////        public Fragment getItem(int position) {
////            switch (position){
////                case 0:
////                    OnBoardingFragment1 tab1=new OnBoardingFragment1();
////                    return tab1;
////                case 1:
////                    OnBoardingFragment2 tab2=new OnBoardingFragment2();
////                    return tab2;
////                case 2:
////                    OnBoardingFragment3 tab3=new OnBoardingFragment3();
////                    return tab3;
////
////            }
////           return null;
////        }
//
//        @Override
//        public int getCount() {
//            return NUM_PAGES;
//        }
//    }
}