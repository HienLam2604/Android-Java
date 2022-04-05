package com.example.btandroid4_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtName = (EditText) findViewById(R.id.txtName);
    EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
    EditText txtProject = (EditText) findViewById(R.id.txtProject);
    Button btnViewContact = (Button) findViewById(R.id.btnContactInfo);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnViewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGetContactInfo = new Intent(getApplicationContext(),ViewContactInfo.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",txtName.getText().toString());
                bundle.putString("email",txtEmail.getText().toString());
                bundle.putString("project",txtProject.getText().toString());
                iGetContactInfo.putExtras(bundle);
                startActivity(iGetContactInfo);
            }
        });
    }


}