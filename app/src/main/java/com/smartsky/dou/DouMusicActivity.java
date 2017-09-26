package com.smartsky.dou;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.joor.Reflect;

import java.util.ArrayList;
import java.util.List;

public class DouMusicActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private DouFragmentPagerAdapter adapter;
    private List<Fragment> pageFagments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dou_music);
        initView();
    }

    private void initView(){
        viewPager = (ViewPager) findViewById(R.id.dou_viewpager);

        for (String name:PageConfig.fragmentNames){
            Fragment fm = Reflect.on(name).create().get();
            pageFagments.add(fm);
        }
        adapter = new DouFragmentPagerAdapter(getSupportFragmentManager(),pageFagments);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);
    }
}
