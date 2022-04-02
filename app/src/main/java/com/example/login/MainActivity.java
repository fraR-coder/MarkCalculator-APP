package com.example.login;

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

    /*public void clickRegisterButton(View view){
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
*/
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText giusta =(EditText) findViewById(R.id.txtGiusta);

        String message = giusta.getText().toString();
        intent.putExtra("giusta", message);

        EditText sbagliata = (EditText) findViewById(R.id.txtSbagliata);
        String message1 = sbagliata.getText().toString();
        intent.putExtra("sbagliata", message1);

        EditText bianca = (EditText) findViewById(R.id.txtBianca);
        String message2 = bianca.getText().toString();
        intent.putExtra("bianca", message2);

        EditText numeroDomande = (EditText) findViewById(R.id.txtNum);
        String message3 = numeroDomande.getText().toString();
        intent.putExtra("num", message3);

        EditText soglia = (EditText) findViewById(R.id.txtSoglia);
        String message4 = soglia.getText().toString();
        intent.putExtra("soglia", message4);


        startActivity(intent);
    }
}