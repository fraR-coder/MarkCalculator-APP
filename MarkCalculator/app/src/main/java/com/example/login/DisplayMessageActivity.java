package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class DisplayMessageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent=getIntent();

         String giusta=intent.getStringExtra("giusta");

        String sbagliata=intent.getStringExtra("sbagliata");

        String bianca=intent.getStringExtra("bianca");
        String num=intent.getStringExtra("num");
        String soglia=intent.getStringExtra("soglia");
        TestApp a=new TestApp(Double.parseDouble(giusta),Double.parseDouble(sbagliata),Double.parseDouble(bianca),Integer.parseInt(num),Double.parseDouble(soglia));

        a.prova();
        ArrayList<Linea> linee = new ArrayList<>(a.getElencoLinee());

        recyclerView=findViewById(R.id.LinesRecView);

        LinesRecViewAdapter adapter=new LinesRecViewAdapter(this);
        adapter.setLines(linee);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));


    }

  /*  public ArrayList<Linea> method(){



        String s=intent.getStringExtra("nome");

        String s1=intent.getStringExtra("cognome");

        String s2=intent.getStringExtra("mail");


        String m=intent.getStringExtra("messaggio");
        t.setText(m.toUpperCase()+"\n" +s+"\n"+s1+" "+s2);


        TestApp a=new TestApp(1,-1,0,10,5,3);
        a.prova();
        return  a.elencoLinee;




    }*/
}