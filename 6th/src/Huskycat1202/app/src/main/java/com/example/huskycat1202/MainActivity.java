package com.example.huskycat1202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView annieweb = (WebView) findViewById(R.id.webview);
        annieweb.setWebViewClient(new WebViewClient());
        annieweb.loadUrl("https://huskycat1202.github.io/intro.html");
        annieweb.getSettings().setUseWideViewPort(true);
        annieweb.getSettings().setLoadWithOverviewMode(true);
    }
}
