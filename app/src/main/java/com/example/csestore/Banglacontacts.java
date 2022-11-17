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

public class Banglacontacts extends AppCompatActivity {

    private Button ban_angur_sir, ban_halim_sir, ban_sanjida_mam;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglacontacts);

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ban_angur_sir =(Button) findViewById(R.id.banAngursirButtonId);
        ban_halim_sir =(Button) findViewById(R.id.banHalimsirButtonId);
        ban_sanjida_mam =(Button) findViewById(R.id.banSanjidamamButtonId);

        ban_angur_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Banglacontacts.this,Angursirprofile.class);
                startActivity(intent);
            }
        });

        ban_halim_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Banglacontacts.this,Halimsirprofile.class);
                startActivity(intent);

            }
        });

        ban_sanjida_mam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Banglacontacts.this,Sanjidamamprofile.class);
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