package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Fourthsemester extends AppCompatActivity {
    private Button dbms, algorithm,temecommunications,architecture,mechatronics;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthsemester);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        dbms = (Button) findViewById(R.id.cseDbmsid);
        algorithm = (Button) findViewById(R.id.csealgorithmButtonId);
        temecommunications =(Button) findViewById(R.id.tcseTelecommunicationButtonId);
        architecture =(Button) findViewById(R.id.cseArchitectureButtonId);
        mechatronics =(Button) findViewById(R.id.cseMechatronics);





       dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Fourthsemester.this,Csedbms.class);
                startActivity(intent);
            }
        });


      algorithm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Fourthsemester.this,Csealgorithm.class);
                startActivity(intent);
            }
        });

        temecommunications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Fourthsemester.this,Csetelecommunications.class);
                startActivity(intent);
            }
        });


        architecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Fourthsemester.this,Csearchitecture.class);
                startActivity(intent);
            }
        });

        mechatronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Fourthsemester.this,Csemechatronics.class);
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