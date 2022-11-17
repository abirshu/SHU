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

public class Ecocontacts extends AppCompatActivity {

    private Button eco_shovon_sir, eco_tuhin_sir, eco_nadim_sir;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecocontacts);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        eco_shovon_sir = findViewById(R.id.ecoshovonsirButtonId);
        eco_tuhin_sir = findViewById(R.id.ecotuhinsirButtonId);
        eco_nadim_sir = findViewById(R.id.econadimSirButtonId);

        eco_shovon_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Ecocontacts.this,Ecoshovonsirprofile.class);
                startActivity(intent);
            }
        });

        eco_tuhin_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Ecocontacts.this,Ecotuhinsirprofile.class);
                startActivity(intent);

            }
        });

        eco_nadim_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ecocontacts.this,Econadimsirprofile.class);
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