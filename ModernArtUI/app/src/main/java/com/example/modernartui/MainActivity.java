package com.example.modernartui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        View left1 = (View) findViewById(R.id.left1);
        View left2 = (View) findViewById(R.id.left2);
        View rightTop1 = (View) findViewById(R.id.rightTop1);
        View rightTop2 = (View) findViewById(R.id.rightTop2);
        View rightBot1 = (View) findViewById(R.id.rightBot1);
        View rightBot2 = (View) findViewById(R.id.rightBot2);
        left1.setBackgroundColor(Color.parseColor("#f0932b"));
        left2.setBackgroundColor(Color.parseColor("#4834d4"));
        rightTop1.setBackgroundColor(Color.YELLOW);
        rightTop2.setBackgroundColor(Color.RED);
        rightBot1.setBackgroundColor(Color.parseColor("#84817a"));
        rightBot2.setBackgroundColor(Color.DKGRAY);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int step = i*2;
                left1.setBackgroundColor(Color.parseColor("#f0932b")+step);
                left2.setBackgroundColor(Color.parseColor("#4834d4")+step);
                rightTop1.setBackgroundColor(Color.YELLOW+step);
                rightTop2.setBackgroundColor(Color.RED+step);
                rightBot1.setBackgroundColor(Color.parseColor("#84817a")+step);
                rightBot2.setBackgroundColor(Color.DKGRAY+step);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}