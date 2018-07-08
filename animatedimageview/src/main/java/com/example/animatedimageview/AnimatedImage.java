package com.example.animatedimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Marwa on 7/8/2018.
 */

@SuppressLint("AppCompatCustomView")
public class AnimatedImage extends ImageView{

    AnimatedImage mAnimatedImage = this;

    public AnimatedImage(Context context) {
        super(context);

    }

    public AnimatedImage(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public AnimatedImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public AnimatedImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }


    public void scaleIn(){
        mAnimatedImage.animate().scaleX(1.1f).scaleY(1.1f).setDuration(2000);
    }


    public void scaleIn(float x, float y, long duration){
        mAnimatedImage.animate().scaleX(x).scaleY(y).setDuration(duration);
    }

}




//https://developer.android.com/studio/projects/android-library
