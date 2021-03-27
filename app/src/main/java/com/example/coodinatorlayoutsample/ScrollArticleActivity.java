package com.example.coodinatorlayoutsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;

public class ScrollArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_article);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle(R.string.toolbar_title);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setSubtitle(R.string.toolbar_subtitle);
        toolbar.setSubtitleTextColor(Color.LTGRAY);
        // アクションバーにツールバーを設定
        setSupportActionBar(toolbar);
    }
}