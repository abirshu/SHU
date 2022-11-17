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

public class Csecontacts extends AppCompatActivity {

    private Button cseChairman, cse_mala_mam,cse_shiam_sir, cse_anwar_sir;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csecontacts);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



    cseChairman = (Button) findViewById(R.id.cseChairmanButtonId);
    cse_mala_mam = (Button) findViewById(R.id.cseMalaMamButtonId);
    cse_shiam_sir = (Button) findViewById(R.id.cseShiamSirButtonId);
    cse_anwar_sir =(Button) findViewById(R.id.cseAnwarulSirButtonId);

    cseChairman.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Csecontacts.this,Csechairman.class);
            startActivity(intent);
        }
    });
    cse_mala_mam.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(Csecontacts.this,Malamaprofile.class);
            startActivity(intent);
        }
    });

    cse_shiam_sir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(Csecontacts.this,Shiamsirprofile.class);
            startActivity(intent);
        }
    });

    cse_anwar_sir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(Csecontacts.this,Anwarsirprofile.class);
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