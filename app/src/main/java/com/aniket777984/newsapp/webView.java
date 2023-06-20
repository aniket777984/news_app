package com.aniket777984.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends AppCompatActivity {

    Toolbar toolbar;
    WebView webView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        toolbar=findViewById(R.id.toolbar);
        webView=findViewById(R.id.webView);
        setSupportActionBar(toolbar);

        Intent intent=getIntent();
        String url = intent.getStringExtra("url");

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);

    }
}