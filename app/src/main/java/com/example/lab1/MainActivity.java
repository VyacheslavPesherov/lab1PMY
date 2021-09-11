package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public int myMIN(int a,int b,int c){

        if(a<=b && a<=c){
            return a;
        }

        if(b<=a && b<=c) {
            return b;
        }

        if(c<=a && c<=b){
            return c;
        }

        return a;

    }

    public int myMAX(int a,int b,int c){

        if(a>=b && a>=c){
            return a;
        }

        if(b>=a && b>=c) {
            return b;
        }

        if(c>=a && c>=b){
            return c;
        }

        return a;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}