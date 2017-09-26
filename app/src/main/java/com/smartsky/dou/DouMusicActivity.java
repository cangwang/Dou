package com.smartsky.dou;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.joor.Reflect;

public class DouMusicActivity extends AppCompatActivity {
    private TextView homeBtn;
    private TextView discoveryBtn;
    private TextView plusBtn;
    private TextView messageBtn;
    private TextView meBtn;
    private Fragment homeFragment;
    private Fragment discoveryFragment;
    private Fragment plusFragment;
    private Fragment messageFragment;
    private Fragment meFragment;

    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dou_music);
        initView();
    }

    private void initView(){
        homeBtn= (TextView) findViewById(R.id.main_home);
        discoveryBtn = (TextView) findViewById(R.id.main_dicovery);
        plusBtn = (TextView) findViewById(R.id.main_plus);
        messageBtn = (TextView) findViewById(R.id.main_message);
        meBtn = (TextView) findViewById(R.id.main_me);

        homeFragment = Reflect.on(PageConfig.HomeFragment).create().get();
        discoveryFragment =  Reflect.on(PageConfig.DicoveryFragment).create().get();
        plusFragment = Reflect.on(PageConfig.PlusFragment).create().get();
        messageFragment = Reflect.on(PageConfig.MessageFragment).create().get();
        meFragment = Reflect.on(PageConfig.MeFragment).create().get();

        replaceFragment(R.id.main_tab,homeFragment);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(R.id.main_tab,homeFragment);
            }
        });
        discoveryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(R.id.main_tab,discoveryFragment);
            }
        });
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(R.id.main_tab,plusFragment);
            }
        });
        messageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(R.id.main_tab,messageFragment);
            }
        });
        meBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(R.id.main_tab,meFragment);
            }
        });
    }

    private void replaceFragment(@IdRes int id, Fragment fm){
        if (id < 0 || fm ==null) return;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(id,fm);
        transaction.commitAllowingStateLoss();
    }
}
