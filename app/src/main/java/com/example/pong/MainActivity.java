package com.example.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Point;
import android.view.Display;


import android.graphics.Point;
import android.view.Display;
public class MainActivity extends AppCompatActivity {
    private PongGame mPongGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mPongGame = new PongGame(this, size.x, size.y);
        setContentView(mPongGame);
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        mPongGame.resume();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        mPongGame.pause();
    }



}