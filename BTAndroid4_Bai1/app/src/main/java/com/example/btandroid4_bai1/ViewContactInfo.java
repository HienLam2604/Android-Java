package com.example.btandroid4_bai1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewContactInfo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfo);
        TextView txtNameInfo = (TextView) findViewById(R.id.txtNameInfo);
        TextView txtEmailInfo = (TextView) findViewById(R.id.txtEmailInfo);
        TextView txtProjectInfo = (TextView) findViewById(R.id.txtProjectInfo);
        Button btnFinish = (Button) findViewById(R.id.btnFinish);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String email = bundle.getString("email");
        String project = bundle.getString("project");
        txtNameInfo.setText(name);
        txtEmailInfo.setText(email);
        txtProjectInfo.setText(project);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
