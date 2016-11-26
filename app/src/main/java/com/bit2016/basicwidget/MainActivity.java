package com.bit2016.basicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("------->", ""+findViewById(R.id.button_invisable).isClickable());
        findViewById(R.id.button_invisable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.textView).setVisibility(v.INVISIBLE);
            }
        });
        Log.d("------>", ""+findViewById(R.id.button_invisable).isClickable());

        findViewById(R.id.button_gone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.textView).setVisibility(v.GONE);
            }
        });

        findViewById(R.id.button_visible).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.textView).setVisibility(v.VISIBLE);
            }
        });
    }
}
