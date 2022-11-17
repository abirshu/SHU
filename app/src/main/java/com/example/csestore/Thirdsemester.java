package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Thirdsemester extends AppCompatActivity {

    private Button dataStructure, oop, circuit, bdStudies, algebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdsemester);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        dataStructure=(Button) findViewById(R.id.dataStructureButtonId);
        oop =(Button)  findViewById(R.id.oopButtonId);
       circuit =(Button)   findViewById(R.id.circuitButtonId);
       bdStudies =(Button)  findViewById(R.id.bdStudiesButtonId);
       algebra =(Button)  findViewById(R.id.algebraButtonId);


       dataStructure.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Thirdsemester.this,Csedatastructure.class);
               startActivity(intent);
           }
       });

       oop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thirdsemester.this,Cseoop.class);
                startActivity(intent);
            }
        });


        circuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thirdsemester.this,Csecircuit.class);
                startActivity(intent);
            }
        });

      algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thirdsemester.this,Cselinear.class);
                startActivity(intent);
            }
        });


        dataStructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thirdsemester.this,Csedatastructure.class);
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