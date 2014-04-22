package com.maeur1.calculator;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;

public class Splash extends Activity{

    MediaPlayer ourSong;
    Thread timer;
    @Override
    protected void onCreate(Bundle ThisIsBacon) {
        super.onCreate(ThisIsBacon);
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this, R.raw.splash);
        ourSong.start();
        timer = new Thread(){
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    return;
                }
                if(!isInterrupted()) {
                    Intent openStartingPoint = new Intent("android.intent.action.MENU");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        timer.interrupt();
        Intent openStartingPoint = new Intent("android.intent.action.MENU");
        startActivity(openStartingPoint);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
