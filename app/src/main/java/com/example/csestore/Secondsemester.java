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

public class Secondsemester extends AppCompatActivity {
    private Button programming, dld, chemistry, integration;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondsemester);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        programming = findViewById(R.id.cseProgrammingButtonId);
        dld = findViewById(R.id.cseDLDButtonId);
        chemistry = findViewById( R.id.cseChemistryButtonId);
        integration = findViewById(R.id.cseIntegrationButtonId);


        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Secondsemester.this,Cseprogramming.class);
                startActivity(intent);
            }
        });

        dld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Secondsemester.this,Csedld.class);
                startActivity(intent);
            }
        });

       chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Secondsemester.this,Csechemistry.class);
                startActivity(intent);
            }
        });

        integration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Secondsemester.this,Cseintegration.class);
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