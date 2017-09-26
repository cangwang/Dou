package com.smartsky.dou;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.joor.Reflect;

public class DouMusicActivity extends AppCompatActivity {
    private TextView home;
    private TextView discovery;
    private TextView plus;
    private TextView message;
    private TextView me;
    private Fragment homeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dou_music);
        initView();
    }

    private void initView(){
        home = (TextView) findViewById(R.id.main_home);
        discovery = (TextView) findViewById(R.id.main_dicovery);
        plus = (TextView) findViewById(R.id.main_plus);
        message = (TextView) findViewById(R.id.main_message);
        me = (TextView) findViewById(R.id.main_me);

//        homeFragment = Reflect.on()

    }
}
