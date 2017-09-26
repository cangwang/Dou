package com.smartsky.dou;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.joor.Reflect;

/**
 * Created by cangwang on 2017/9/26.
 */

public class DouMusicFragment extends Fragment{
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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dou_music_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        homeBtn= (TextView) view.findViewById(R.id.main_home);
        discoveryBtn = (TextView) view.findViewById(R.id.main_dicovery);
        plusBtn = (TextView) view.findViewById(R.id.main_plus);
        messageBtn = (TextView) view.findViewById(R.id.main_message);
        meBtn = (TextView) view.findViewById(R.id.main_me);

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
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(id,fm);
        transaction.commitAllowingStateLoss();
    }
}
