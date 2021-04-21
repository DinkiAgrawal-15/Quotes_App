package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random=new Random();
    TextView textQuot;
    Button buttonQuot;
    String randQuotes="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textQuot=findViewById(R.id.textViewtextquote);
        buttonQuot=findViewById(R.id.buttonnextQuote);
        buttonQuot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayquote();
            }
        });

    }
    public  void displayquote(){
        int randNum=random.nextInt((10+1)-1)+1;
        switch (randNum){

            case 1:
                randQuotes=getString(R.string.quote1);
                break;
            case 2:
                randQuotes=getString(R.string.quote2);
                break;
            case 3:
                randQuotes=getString(R.string.quote3);
                break;
            case 4:
                randQuotes=getString(R.string.quote4);
                break;
            case 5:
                randQuotes=getString(R.string.quote5);
                break;
            case 6:
                randQuotes=getString(R.string.quote6);
                break;
            case 7:
                randQuotes=getString(R.string.quote7);
                break;
            case 8:
                randQuotes=getString(R.string.quote8);
                break;
            case 9:
                randQuotes=getString(R.string.quote9);
                break;
            case 10:
                randQuotes=getString(R.string.quote10);
                break;
        }
        textQuot.setText(randQuotes);
    }
    public  void  shareQuote(View view){
        Intent shareIntent= new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT,randQuotes);
        startActivity(Intent.createChooser(shareIntent,"Select an App"));

    }
}