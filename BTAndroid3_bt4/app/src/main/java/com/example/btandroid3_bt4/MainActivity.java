package com.example.btandroid3_bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtInTexting;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnDivide,btnMulti,btnResult,btnReset;
    private String operation;
    public void setValue(EditText txt,String s){
        String lastValue = txt.getText().toString();
        if(!lastValue.equals("")){
            lastValue +=s;
            s = lastValue;
        }
        txt.setText(s);
    }
    public Integer doMath(Integer a,Integer b){
        Integer result = 0;
        if(operation.equals("+")){
            result = a+b;
            txtInTexting.setText(result.toString());
        }
        if(operation.equals("-")){
            result = a-b;
            txtInTexting.setText(result.toString());
        }
        if(operation.equals("*")){
            result = a*b;
            txtInTexting.setText(result.toString());
        }
        if(operation.equals("/")){
            result = a/b;
            txtInTexting.setText(result.toString());
        }
        return result;
    }
    public View.OnClickListener handleOnclickBtn = new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                switch (btn.getId()) {
                    case R.id.btn0:
                        setValue(txtInTexting,"0");
                        break;
                    case R.id.btn1:
                        setValue(txtInTexting,"1");
                        break;
                    case R.id.btn2:
                        setValue(txtInTexting,"2");
                        break;
                    case R.id.btn3:
                        setValue(txtInTexting,"3");
                        break;
                    case R.id.btn4:
                        setValue(txtInTexting,"4");
                        break;
                    case R.id.btn5:
                        setValue(txtInTexting,"5");
                        break;
                    case R.id.btn6:
                        setValue(txtInTexting,"6");
                        break;
                    case R.id.btn7:
                        setValue(txtInTexting,"7");
                        break;
                    case R.id.btn8:
                        setValue(txtInTexting,"8");
                        break;
                    case R.id.btn9:
                        setValue(txtInTexting,"9");
                        break;
                    case R.id.btnPlus:
                        setValue(txtInTexting,"+");
                        operation = "+";
                        break;
                    case R.id.btnMinus:
                        setValue(txtInTexting,"-");
                        operation = "-";
                        break;
                    case R.id.btnMulti:
                        setValue(txtInTexting,"*");
                        operation = "*";
                        break;
                    case R.id.btnDivide:
                        setValue(txtInTexting,"/");
                        operation = "/";
                        break;
                    case R.id.btnReset:
                        txtInTexting.setText("");
                        break;
                    case R.id.btnResult:
                        String re = "[^0-9]";
                        String recentText = txtInTexting.getText().toString();
                        String[] tmp = recentText.split(re);
                        doMath(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]));
                        break;
                    default:
                        txtInTexting.setText("");
                        break;

                }
            }
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnReset = (Button)findViewById(R.id.btnReset);
        btnResult = (Button)findViewById(R.id.btnResult);
        txtInTexting = (EditText)findViewById(R.id.txtInTexting);
        btn0.setOnClickListener(handleOnclickBtn);
        btn1.setOnClickListener(handleOnclickBtn);
        btn2.setOnClickListener(handleOnclickBtn);
        btn3.setOnClickListener(handleOnclickBtn);
        btn4.setOnClickListener(handleOnclickBtn);
        btn5.setOnClickListener(handleOnclickBtn);
        btn6.setOnClickListener(handleOnclickBtn);
        btn7.setOnClickListener(handleOnclickBtn);
        btn8.setOnClickListener(handleOnclickBtn);
        btn9.setOnClickListener(handleOnclickBtn);
        btnPlus.setOnClickListener(handleOnclickBtn);
        btnMinus.setOnClickListener(handleOnclickBtn);
        btnDivide.setOnClickListener(handleOnclickBtn);
        btnMulti.setOnClickListener(handleOnclickBtn);
        btnReset.setOnClickListener(handleOnclickBtn);
        btnResult.setOnClickListener(handleOnclickBtn);

    }

}