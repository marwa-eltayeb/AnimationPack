package com.example.animatedimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Marwa on 7/8/2018.
 */

@SuppressLint("AppCompatCustomView")
public class AnimatedImage extends ImageView {

    AnimatedImage mAnimatedImage = this;

    /*
    public AnimatedImage(Context context) {
        super(context);
    }
    */

    public AnimatedImage(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    /*
    public AnimatedImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public AnimatedImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }
    */

    /**
     * This method grows the element view (ImageView)
     */
    public void scaleIn() {
        mAnimatedImage.animate().scaleX(1.1f).scaleY(1.1f).setDuration(2000);
    }

    /**
     * This method shrinks the element view (ImageView)
     */
    public void scaleOut() {
        mAnimatedImage.animate().scaleX(0.7f).scaleY(0.7f).setDuration(2000);
    }

    /**
     * This method grows or shrinks the element view (ImageView)
     *
     * @param x        scale of the view in the x direction
     * @param y        scale of the view in the y direction
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void scale(float x, float y, long duration) {
        mAnimatedImage.animate().scaleX(x).scaleY(y).setDuration(duration);
    }

    /**
     * This method move the element view to the right (ImageView)
     */
    public void moveToRight() {
        mAnimatedImage.animate().translationXBy(60f).setDuration(1000);
    }

    /**
     * This method move the element view to the left (ImageView)
     */
    public void moveToLeft() {
        mAnimatedImage.animate().translationXBy(-60f).setDuration(1000);
    }

    /**
     * This method move the element view to the right or left (ImageView)
     *
     * @param x        the amount to be animated by horizontally. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void moveToRightOrLeft(float x, long duration) {
        mAnimatedImage.animate().translationXBy(x).setDuration(duration);
    }

    /**
     * This method move the element view to the bottom (ImageView)
     */
    public void moveToBottom() {
        mAnimatedImage.animate().translationYBy(60f).setDuration(1000);
    }

    /**
     * This method move the element view to the top (ImageView)
     */
    public void moveToTop() {
        mAnimatedImage.animate().translationYBy(-60f).setDuration(1000);
    }

    /**
     * This method move the element view to the tob or bottom (ImageView)
     *
     * @param y        the amount to be animated by vertically. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void moveToTobOrBottom(float y, long duration) {
        mAnimatedImage.animate().translationYBy(y).setDuration(duration);
    }

    /**
     * This method rotate the element view to the right (ImageView)
     */
    public void rotateToRight() {
        mAnimatedImage.animate().rotation(360f).setDuration(2000);
    }

    /**
     * This method rotate the element view to the left (ImageView)
     */
    public void rotateToLeft() {
        mAnimatedImage.animate().rotation(-360f).setDuration(2000);
    }

    /**
     * This method move the element view to the tob or bottom (ImageView)
     *
     * @param value    rotate right or left. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void rotateRightOrLeft(float value, long duration) {
        mAnimatedImage.animate().rotation(value).setDuration(duration);
    }
    
    /**
     * This method rotate the element view upside down (ImageView)
     */
    public void rotateUpSideDown() {
        mAnimatedImage.animate().rotation(180f).setDuration(2000);
    }

    /**
     * This method move the element view upside down right or left (ImageView)
     *
     * @param value    rotate upside down right or left. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void rotateUpSideDown(float value, long duration) {
        mAnimatedImage.animate().rotation(value).setDuration(duration);
    }


}


//https://developer.android.com/studio/projects/android-library
