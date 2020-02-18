package com.dcode.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button bdot;
    private TextView textView;
    private Button bac;
    private Button bdel;
    private Button bplus;
    private Button bminus;
    private Button bmultiply;
    private Button bdivide;
    private Button bequal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bdot=findViewById(R.id.bdot);
        textView=findViewById(R.id.textView);
        bac=findViewById(R.id.bAC);
        bdel=findViewById(R.id.bclear);
        bplus=findViewById(R.id.bplus);
        bminus=findViewById(R.id.bminus);
        bmultiply=findViewById(R.id.bmultiply);
        bdivide=findViewById(R.id.bdivide);
        bequal=findViewById(R.id.bequal);
        int start=0;
        int end = 0;
        boolean last=false;
        View.OnClickListener B0=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B1=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B2=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B3=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B4=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B5=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B6=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B7=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B8=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener B9=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BDOT=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BAC=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BDEL=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BPLUS=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BMINUS=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BMULTIPLY=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BDIVIDE=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener BEQUAL=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        b0.setOnClickListener(B0);
        b1.setOnClickListener(B1);
        b2.setOnClickListener(B2);
        b3.setOnClickListener(B3);
        b4.setOnClickListener(B4);
        b5.setOnClickListener(B5);
        b6.setOnClickListener(B6);
        b7.setOnClickListener(B7);
        b8.setOnClickListener(B8);
        b9.setOnClickListener(B9);
        bac.setOnClickListener(BAC);
        bdot.setOnClickListener(BDOT);
        bdel.setOnClickListener(BDEL);
        bplus.setOnClickListener(BPLUS);
        bminus.setOnClickListener(BMINUS);
        bmultiply.setOnClickListener(BMULTIPLY);
        bdivide.setOnClickListener(BDIVIDE);
        bequal.setOnClickListener(BEQUAL);
    }
}
