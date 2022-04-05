package com.example.btandroid4_bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGoogle = (Button) findViewById(R.id.btnShow);
        Button btnCall = (Button) findViewById(R.id.btnCall);
        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnViewContact = (Button) findViewById(R.id.btnViewContact);
        Button btnSendMess = (Button) findViewById(R.id.btnSendMess);
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(intent);
            }
        });
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+84)14102001"));
                startActivity(intent);
            }
        });
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse(("tel:(+84)14102001")));
                startActivity(i);
            }
        });
        btnViewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(i);
            }
        });
        btnSendMess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:14102001"));
                i.putExtra("sms_body","Bạn và tôi không giống nhau...Nghĩ về tương lai...Cuộc sống sau này ~~");
                startActivity(i);
            }
        });
    }
}