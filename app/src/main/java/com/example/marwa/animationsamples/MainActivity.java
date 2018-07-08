package com.example.marwa.animationsamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.animatedimageview.AnimatedImage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void scaleIn(View view) {
        AnimatedImage image = (AnimatedImage) findViewById(R.id.duck);
        //image.scaleIn();
        image.scaleIn(1.1f,1.1f,2000);
    }
}
