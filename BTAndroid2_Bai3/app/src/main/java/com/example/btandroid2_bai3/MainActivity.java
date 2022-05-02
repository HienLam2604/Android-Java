package com.example.btandroid2_bai3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btnShowTime = (Button) findViewById(R.id.btnShowTime);
    AlertDialog alertBox = new AlertDialog.Builder(this).create();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date d = new Date();
                String msg = "Thời gian hiện tại: " +d.toLocaleString();
                alertBox.setMessage(msg);
                alertBox.show();
            }
        });
    }
}