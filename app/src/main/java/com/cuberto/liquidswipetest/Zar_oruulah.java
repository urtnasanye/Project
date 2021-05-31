package com.cuberto.liquidswipetest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TimePicker;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Zar_oruulah extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zar_oruulah);

        tabLayout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.view_pager);

        adapter=new MainAdapter(getSupportFragmentManager());

        adapter.AddFragment(new One(), "1");
        adapter.AddFragment(new Two(), "2");
        adapter.AddFragment(new Three(), "3");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

//        TimePicker picker=(TimePicker)findViewById(R.id.datePicker1);
//        picker.setIs24HourView(true);
    }

    private class MainAdapter extends FragmentPagerAdapter {
        ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
        ArrayList<String> stringArrayList=new ArrayList<>();

        public void AddFragment(Fragment fragment, String s){
             fragmentArrayList.add(fragment);
             stringArrayList.add(s);

        }

        public MainAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentArrayList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentArrayList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return stringArrayList.get(position);
        }
    }
}