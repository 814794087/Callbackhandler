package com.example.human.callbackhandler;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Button;

import java.security.KeyException;
import java.util.jar.Attributes;

public class MyButton extends Button{
    public MyButton(Context content, AttributeSet set){
        super(content , set);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v("com.sise" , "the onKeyDown in MyButton");
        return super.onTouchEvent(event);
    }

}

