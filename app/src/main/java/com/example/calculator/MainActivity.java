package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText resultat=(EditText)findViewById(R.id.resultat);
Button button1=(Button)findViewById(R.id.b1);
    Button button2=(Button)findViewById(R.id.b2);
    Button button3=(Button)findViewById(R.id.b3);
    Button button4=(Button)findViewById(R.id.b4);
    Button button5=(Button)findViewById(R.id.b5);
    Button button6=(Button)findViewById(R.id.b6);
    Button button7=(Button)findViewById(R.id.b7);
    Button button8=(Button)findViewById(R.id.b8);
    Button button9=(Button)findViewById(R.id.b9);
    Button button0=(Button)findViewById(R.id.b0);
    Button sum=(Button)findViewById(R.id.sum);
    Button substact=(Button)findViewById(R.id.substract);
    Button divide=(Button)findViewById(R.id.divide);
    Button equal=(Button)findViewById(R.id.point);
    Button multiply=(Button)findViewById(R.id.multiply);
    Button AC=(Button)findViewById(R.id.ac);
    Button point=(Button)findViewById(R.id.point);
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               chiffreclick("0");
           }
       });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick("9");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chiffreclick(".");
            }
        });
    }
    public void chiffreclick(String str){
        if(!resultat.getText().equals(0)){
            str=str+resultat.getText().equals(0);
        }
        resultat.setText(str);
    }

}