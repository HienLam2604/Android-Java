package com.example.modernartui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static private final String URL = "http://www.MoMA.org";
    int clickStep = 100;
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

        left1.setOnClickListener(onClickChangeColor);
        left2.setOnClickListener(onClickChangeColor);
        rightTop1.setOnClickListener(onClickChangeColor);
        rightTop2.setOnClickListener(onClickChangeColor);
        rightBot1.setOnClickListener(onClickChangeColor);
        rightBot2.setOnClickListener(onClickChangeColor);

        left1.setBackgroundColor(Color.parseColor("#f0932b"));
        left2.setBackgroundColor(Color.parseColor("#4834d4"));
        rightTop1.setBackgroundColor(Color.GREEN);
        rightTop2.setBackgroundColor(Color.RED);
        rightBot1.setBackgroundColor(Color.parseColor("#84817a"));
        rightBot2.setBackgroundColor(Color.DKGRAY);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int step = i*2;
                left1.setBackgroundColor(Color.parseColor("#f0932b")+step);
                left2.setBackgroundColor(Color.parseColor("#4834d4")+step);
                rightTop1.setBackgroundColor(Color.GREEN+step);
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

    private View.OnClickListener onClickChangeColor = new View.OnClickListener() {
        public void onClick(View v) {
            clickStep = clickStep + 50;
            int color = ((ColorDrawable)v.getBackground()).getColor();
            switch (v.getId() /*to get clicked view id**/) {
                case R.id.left1:
                    v.setBackgroundColor(color+ clickStep);
                    break;
                case R.id.left2:
                    v.setBackgroundColor(color + clickStep);
                    break;
                case R.id.rightTop1:
                    v.setBackgroundColor(color + clickStep);
                    break;
                case R.id.rightTop2:
                    v.setBackgroundColor(color + clickStep);
                    break;
                case R.id.rightBot1:
                    v.setBackgroundColor(color + clickStep);
                    break;
                case R.id.rightBot2:
                    v.setBackgroundColor(color + clickStep);
                    break;
                default:
                    break;
            }
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.info:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                //Initialize and format dialog
                TextView dialog_title = new TextView(this);
                dialog_title.setText("Morden Art App");
                //dialog_title.setGravity(Gravity.CENTER_HORIZONTAL);
                dialog_title.setPadding(100,30,100,30);
                dialog_title.setTextSize(24);
                builder.setCustomTitle(dialog_title);
                builder.setMessage("Click below and see what happen :)");

                builder.setPositiveButton("Not now", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
                builder.setNegativeButton("Visit moma", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked Visit MOMA button
                        Intent momaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                        startActivity(momaIntent);
                    }
                });

                AlertDialog dialog = builder.show();
                TextView dialog_msg = (TextView) dialog.findViewById(android.R.id.message);
                dialog_msg.setGravity(Gravity.CENTER_HORIZONTAL);
                dialog_msg.setTextSize(18);
                dialog_msg.setPadding(10,60,10,0);

        }
        return super.onOptionsItemSelected(item);
    }
}