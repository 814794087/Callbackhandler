package com.example.human.callbackhandler;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Callbackhandler extends Activity{
    Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callbackhandler_layout);
        btn=findViewById(R.id.buttonOfThis);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("调试","Button");
            }
        });
    }
}

