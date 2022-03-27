package com.example.textchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    EditText txtCountClick;
    CheckBox checkColor, checkBold;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button)findViewById(R.id.btnCountClick);
        checkColor = (CheckBox)findViewById(R.id.checkboxColor);
        checkBold = (CheckBox) findViewById(R.id.checkboxBold);
        txtCountClick = (EditText)findViewById(R.id.txtCountClick);
        txtCountClick.setSingleLine();
        txtCountClick.setInputType(InputType.TYPE_NULL);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkColor.isChecked()){
                    txtCountClick.setTextColor(Color.rgb(255, 94, 250));
                }else{
                    txtCountClick.setTextColor(Color.WHITE);
                }
                if(checkBold.isChecked()){
                    txtCountClick.setTypeface(Typeface.DEFAULT_BOLD);
                }else {
                    txtCountClick.setTypeface(Typeface.DEFAULT);
                }
                txtCountClick.setText("You've clicked" + (++count) + "times !");
            }
        });

    }
}