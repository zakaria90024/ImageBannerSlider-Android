package com.copypaseit.quiz.play.moeidheidaribannerslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.moeidbannerlibrary.banner.BannerLayout;
import com.example.moeidbannerlibrary.banner.BaseBannerAdapter;



import com.potyvideo.slider.library.Animations.DescriptionAnimation;
import com.potyvideo.slider.library.Indicators.PagerIndicator;
import com.potyvideo.slider.library.SliderLayout;
import com.potyvideo.slider.library.SliderTypes.BaseSliderView;
import com.potyvideo.slider.library.SliderTypes.TextSliderViewCurve;
import com.potyvideo.slider.library.Tricks.ViewPagerEx;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ir.apend.slider.model.Slide;
import ir.apend.slider.ui.Slider;

public class MainActivity extends AppCompatActivity  {
    private SliderLayout mDemoSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BannerLayout banner=(BannerLayout) findViewById(R.id.Banner);

        List<String> urls = new ArrayList<>();
        urls.add("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/mian-slide.jpg");
        urls.add("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/caina0.jpg");
        urls.add("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/fast1.jpg");
        urls.add("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/website.jpg");
        urls.add("https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/website.jpg");


        BaseBannerAdapter webBannerAdapter=new BaseBannerAdapter(this,urls);
        webBannerAdapter.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position)
            {
                Toast.makeText(MainActivity.this, "clicked "+position, Toast.LENGTH_SHORT).show();

            }
        });
        banner.setAdapter(webBannerAdapter);



        //slider two

        Slider slider = findViewById(R.id.slider);



//create list of slides
        List<Slide> slideList = new ArrayList<>();
        slideList.add(new Slide(0,"https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/mian-slide.jpg" , getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide(1,"https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/caina0.jpg" , getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide(2,"https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/fast1.jpg" , getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide(3,"https://urbaneraltd.com/frontend_assets/upload_assets/images/product/slider/website.jpg" , getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));

//handle slider click listener
        slider.setItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "clicked 2 = "+i, Toast.LENGTH_SHORT).show();
            }
        });

//add slides to slider
        slider.addSlides(slideList);




    }


}