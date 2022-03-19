package com.example.markcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent=getIntent();

        EditText t=(EditText) findViewById(R.id.CiaoText);

        String s=intent.getStringExtra("nome");

        String s1=intent.getStringExtra("cognome");

        String s2=intent.getStringExtra("mail");


        String m=intent.getStringExtra("messaggio");
        t.setText(m.toUpperCase()+"\n" +s+"\n"+s1+" "+s2);


    }
}