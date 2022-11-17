package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Firstsemester extends AppCompatActivity {

    private  Button fundamentals, discrete,physics, eeeCircuit,calculis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstsemester);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        //show pdf
        fundamentals = (Button) findViewById(R.id.cseFundamentalsButtonId);
        discrete = (Button)  findViewById(R.id.cseDiscreteButtonId);
        physics =(Button)  findViewById(R.id.csePhysiceButtonId);
        eeeCircuit =(Button)  findViewById(R.id.cseEeeButtonId);
        calculis =(Button)  findViewById(R.id.cseCalculusButtonId);


        fundamentals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstsemester.this,Csefundamentals.class);
                startActivity(intent);
            }
        });

        discrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstsemester.this,Csediscrete.class);
                startActivity(intent);
            }
        });

        eeeCircuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstsemester.this,Cseelectricalcircuit.class);
                startActivity(intent);
            }
        });

        calculis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstsemester.this,Csecalculus.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {

            this.finish();

        }
        return super.onOptionsItemSelected(item);
    }
}