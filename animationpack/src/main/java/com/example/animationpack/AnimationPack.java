package com.example.animationpack;

import android.view.View;

/**
 * Created by Marwa on 7/8/2018.
 */


public class AnimationPack {

    /**
     * This method grows the element view (ImageView)
     */
    public void scaleIn(View view) {
        view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(2000);
    }

    /**
     * This method shrinks the element view (ImageView)
     */
    public void scaleOut(View view) {
        view.animate().scaleX(0.7f).scaleY(0.7f).setDuration(2000);
    }

    /**
     * This method grows or shrinks the element view (ImageView)
     *
     * @param x        scale of the view in the x direction
     * @param y        scale of the view in the y direction
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void scale(View view, float x, float y, long duration) {
        view.animate().scaleX(x).scaleY(y).setDuration(duration);
    }

    /**
     * This method move the element view to the right (ImageView)
     */
    public void moveToRight(View view) {
        view.animate().translationXBy(60f).setDuration(1000);
    }

    /**
     * This method move the element view to the left (ImageView)
     */
    public void moveToLeft(View view) {
        view.animate().translationXBy(-60f).setDuration(1000);
    }

    /**
     * This method move the element view to the right or left (ImageView)
     *
     * @param x        the amount to be animated by horizontally. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void moveToRightOrLeft(View view, float x, long duration) {
        view.animate().translationXBy(x).setDuration(duration);
    }

    /**
     * This method move the element view to the bottom (ImageView)
     */
    public void moveToBottom(View view) {
        view.animate().translationYBy(60f).setDuration(1000);
    }

    /**
     * This method move the element view to the top (ImageView)
     */
    public void moveToTop(View view) {
        view.animate().translationYBy(-60f).setDuration(1000);
    }

    /**
     * This method move the element view to the tob or bottom (ImageView)
     *
     * @param y        the amount to be animated by vertically. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void moveToTobOrBottom(View view, float y, long duration) {
        view.animate().translationYBy(y).setDuration(duration);
    }

    /**
     * This method rotate the element view to the right (ImageView)
     */
    public void rotateToRight(View view) {
        view.animate().rotation(360f).setDuration(2000);
    }

    /**
     * This method rotate the element view to the left (ImageView)
     */
    public void rotateToLeft(View view) {
        view.animate().rotation(-360f).setDuration(2000);
    }

    /**
     * This method move the element view to the tob or bottom (ImageView)
     *
     * @param value    rotate right or left. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void rotateRightOrLeft(View view, float value, long duration) {
        view.animate().rotation(value).setDuration(duration);
    }

    /**
     * This method rotate the element view upside down (ImageView)
     */
    public void rotateUpSideDown(View view) {
        view.animate().rotation(180f).setDuration(2000);
    }

    /**
     * This method move the element view upside down right or left (ImageView)
     *
     * @param value    rotate upside down right or left. The value can be positive or negative.
     * @param duration The length of ensuing property animations, in milliseconds. The value cannot be negative.
     */
    public void rotateUpSideDown(View view, float value, long duration) {
        view.animate().rotation(value).setDuration(duration);
    }


}


