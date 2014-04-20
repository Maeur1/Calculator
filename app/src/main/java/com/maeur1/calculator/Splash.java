package com.maeur1.calculator;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{

    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle ThisIsBacon) {
        super.onCreate(ThisIsBacon);
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this, R.raw.splash);
        ourSong.start();
        Thread timer = new Thread(){
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent("android.intent.action.MAINACTIVITY");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}
