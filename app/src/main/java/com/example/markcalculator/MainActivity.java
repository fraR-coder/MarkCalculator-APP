package com.example.markcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickRegisterButton(View view){
        TextView txtFistName=findViewById(R.id.textView1);
        TextView txtLastName=findViewById(R.id.textView2);
        TextView txtMail=findViewById(R.id.textView3);

        EditText Firstname=findViewById(R.id.editTextFirstName);
        EditText Lastname=findViewById(R.id.EditTextLastName);
        EditText Mail=findViewById(R.id.EditTextEmailAdress);

        txtFistName.setText("First Name:"+Firstname.getText().toString());
        txtLastName.setText("LAst Name:"+Lastname.getText().toString());
        txtMail.setText("Email:"+Mail.getText().toString());



    }

    public void sendMessage(View view){
        Intent intent=new Intent(this,DisplayMessageActivity.class);
        EditText name = (EditText) findViewById(R.id.editTextFirstName);

        String message = name.getText().toString();
        intent.putExtra("nome", message);

        EditText lastname = (EditText) findViewById(R.id.EditTextLastName);
        String message1 = lastname.getText().toString();
        intent.putExtra("cognome", message1);

        EditText mail = (EditText) findViewById(R.id.EditTextEmailAdress);
        String message2 = mail.getText().toString();
        intent.putExtra("mail", message2);


        if(message.equals("fra")){
            intent.putExtra("messaggio","ciaooo");
        }
        else intent.putExtra("messaggio","noooo");

        startActivity(intent);
    }
}