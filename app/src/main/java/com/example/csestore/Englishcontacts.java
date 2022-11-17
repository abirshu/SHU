package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Englishcontacts extends AppCompatActivity {

    private Button eng_hafsa_mam, eng_safi_sir, eng_gbg_sir, eng_anushka_mam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishcontacts);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        eng_hafsa_mam = (Button) findViewById(R.id.engHafsamamButtonId);
        eng_safi_sir = (Button) findViewById(R.id.engSafisirButtonId);
        eng_gbg_sir =(Button) findViewById(R.id.engGbgSirButtonId);
        eng_anushka_mam =(Button) findViewById(R.id.engAnushkamamButtonId);

        eng_hafsa_mam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Englishcontacts.this,Enghafsamamprofile.class);
                startActivity(intent);
            }
        });

        eng_safi_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Englishcontacts.this,Engsafisirprofile.class);
                startActivity(intent);
            }
        });
        eng_gbg_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Englishcontacts.this,Enggbgsirprofile.class);
                startActivity(intent);
            }
        });

        eng_anushka_mam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Englishcontacts.this,Enganushkamamprofile.class);
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