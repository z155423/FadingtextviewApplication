package com.example.huede.fadingtextviewapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tomer.fadingtextview.FadingTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] texts = {"Eric","very","happy"};
        FadingTextView FTV = (FadingTextView) findViewById(R.id.fadingTextView);
        FTV.setTexts(texts);

    }
}
