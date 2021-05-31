package com.cuberto.liquidswipetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.airbnb.lottie.LottieAnimationView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    LottieAnimationView lottieAnimationView;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    int images[] ={

//            R.drawable.img1,
//            R.drawable.img2,
//            R.drawable.img3
            R.raw.search_security,
            R.raw.working_process,
            R.raw.social_media_marketing
    };
    int headings[] ={

            R.string.Easy,
            R.string.Fast,
            R.string.All_in_one,
    };
    int description[] ={

            R.string.firstPage_description,
            R.string.secondPage_description,
            R.string.thirdPage_description,
    };


    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(ConstraintLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slides_layout,container,false);

        //Hooks
        lottieAnimationView=view.findViewById(R.id.lottie);
        //ImageView imageView=view.findViewById(R.id.slider_image);
        TextView heading=view.findViewById(R.id.slider_heading);
        TextView desc=view.findViewById(R.id.slider_desc);

        lottieAnimationView.setAnimation(images[position]);
        heading.setText(headings[position]);
        desc.setText(description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
