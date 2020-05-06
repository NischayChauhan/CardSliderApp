package com.example.nischay.cardapp;

import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    PagerAdapter adapter;
    List<MainActivity_Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((ConstraintLayout) findViewById(R.id.main_page)).setBackground(ResourcesCompat.getDrawable(getResources(),R.mipmap.main,null));

        models = new ArrayList<>();

        models.add(new MainActivity_Model(R.mipmap.ellipse5, "5. Lorem", "5 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new MainActivity_Model(R.mipmap.ellipse6, "6. Lorem", "6 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        // 1

        models.add(new MainActivity_Model(R.mipmap.ellipse1, "1. Lorem", "1 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new MainActivity_Model(R.mipmap.ellipse2, "2. Lorem", "2 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new MainActivity_Model(R.mipmap.ellipse7, "3. Lorem", "3 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new MainActivity_Model(R.mipmap.ellipse4, "4. Lorem", "4 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new MainActivity_Model(R.mipmap.ellipse5, "5. Lorem", "5 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new MainActivity_Model(R.mipmap.ellipse6, "6. Lorem", "6 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));

        // 6
        models.add(new MainActivity_Model(R.mipmap.ellipse1, "1. Lorem", "1 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new MainActivity_Model(R.mipmap.ellipse2, "2. Lorem", "2 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));


        adapter = new MainActivity_Adapter(models, this);

        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setCurrentItem(2);
        viewPager.setPadding(130, 0, 130, 0);

//        Integer[] colors_temp = {
//                getResources().getColor(R.color.color1),
//                getResources().getColor(R.color.color2),
//                getResources().getColor(R.color.color3),
//                getResources().getColor(R.color.color4)
//        };

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                if (position < (adapter.getCount() -1) && position < (colors.length - 1)) {
//                    viewPager.setBackgroundColor(
//                            (Integer) argbEvaluator.evaluate(
//                                    positionOffset,
//                                    colors[position],
//                                    colors[position + 1]
//                            )
//                    );
//                }
//                else {
//                    viewPager.setBackgroundColor(colors[colors.length - 1]);
//                }

//                if(position==adapter.getCount()-1 || position==0){
//
//                    Toast.makeText(getApplicationContext(), String.format("%d %s %d", position, positionOffset, positionOffsetPixels),Toast.LENGTH_SHORT).show();
//                }


            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (state ==ViewPager.SCROLL_STATE_IDLE) {
                    int index = viewPager.getCurrentItem();
                    if ( index == 1 )
                        viewPager.setCurrentItem( adapter.getCount() - 3, false );
                    else if ( index == adapter.getCount() - 2 )
                        viewPager.setCurrentItem( 2 , false);
                }
            }
        });

    }
}
