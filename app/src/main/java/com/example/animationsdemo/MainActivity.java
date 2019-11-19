package com.example.animationsdemo;

import android.graphics.drawable.AnimationDrawable;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    AnimationDrawable animationDrawable;
    Animation ani, ani1,animation1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.i1);

        imageView.setBackgroundResource(R.drawable.mylist);
        animationDrawable = (AnimationDrawable) imageView.getBackground();

        ani = AnimationUtils.loadAnimation(this, R.anim.animation);
        ani.setDuration(2000);

        ani1 = AnimationUtils.loadAnimation(this, R.anim.tarnsition1);
        ani1.setDuration(2000);

       animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anim3);
    }
    public void RotateScale(View view) {

        imageView.startAnimation(ani);
    }
    public void MovetheImage(View view) {

        imageView.startAnimation(ani1);
    }
    public void Sequenceofimages(View view) {
        animationDrawable.start();
    }
    public void StopSequence(View view) {
        animationDrawable.stop();
       // animation1.setDuration(10000);

    }
    public void fade(View view){

        imageView.startAnimation(animation1);
    }

    public void blink(View view){
        animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anim4);
        imageView.startAnimation(animation1);

    }


    public void slide(View view){
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim6);
        imageView.startAnimation(animation1);
    }
}


