package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView musicTv;
    private ImageView videoTv;
    private ViewPager viewPager;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        musicTv = findViewById(R.id.main_music_tv);
        videoTv = findViewById(R.id.main_video_tv);
        viewPager = findViewById(R.id.main_vp);
        musicTv.setOnClickListener(this);
        videoTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.main_music_tv:
                viewPager.setBackgroundResource(R.drawable.back);
                musicTv.setImageDrawable(getResources().getDrawable(R.drawable.music2));
                videoTv.setImageDrawable(getResources().getDrawable(R.drawable.video));
                Log.d(TAG, "已切换到音乐列表！");
                break;
            case R.id.main_video_tv:
                viewPager.setBackgroundResource(R.drawable.back2);
                musicTv.setImageDrawable(getResources().getDrawable(R.drawable.music));
                videoTv.setImageDrawable(getResources().getDrawable(R.drawable.video2));
                Log.d(TAG, "已切换到视频列表！");
                break;
        }
    }
}
