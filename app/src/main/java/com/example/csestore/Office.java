package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Office extends AppCompatActivity {
private Button vcsir,adittosir, shuvroChandan, alamgirHossain,asaduzzamanPoran,taposKumar,azizurRahman,bulbulRahman,mihirChakraborty,saadMustaqim,enamulHaque,souravChoudhary,safisir,sanjidamam;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        vcsir = findViewById(R.id.golamKabirSirButtonId);
        shuvroChandan =(Button) findViewById(R.id.shuvroChandanButtonId);
        alamgirHossain =(Button) findViewById(R.id.alamgirHossainButtonId);
        asaduzzamanPoran =(Button) findViewById(R.id.poranvaiButtonId);
        taposKumar =(Button) findViewById(R.id.taposskumarButtonButtonId);
        azizurRahman =(Button) findViewById(R.id.azizurRahmanButtonButtonId);
        bulbulRahman =(Button) findViewById(R.id.bulbuAhmedButtonButtonId);
        mihirChakraborty =(Button) findViewById(R.id.mihirChakrabortyButtonButtonId);
        saadMustaqim =(Button) findViewById(R.id.saadMustaqimButtonButtonId);
        enamulHaque =(Button)findViewById(R.id.enamulHaqueButtonButtonId);
        souravChoudhary =(Button) findViewById(R.id.souravChowdhuryButtonButtonId);
        safisir = findViewById(R.id.proctorOneButtonButtonId);
        sanjidamam = findViewById(R.id.proctorTwoButtonButtonId);
        adittosir = findViewById(R.id.adityaSirButtonId);

        vcsir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Vcsir.class);
                startActivity(intent);
            }
        });

        shuvroChandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Shuvrochandan.class);
                startActivity(intent);
            }
        });
        alamgirHossain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Alamgirhossain.class);
                startActivity(intent);
            }
        });

        asaduzzamanPoran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Asaduzzamanporan.class);
                startActivity(intent);
            }
        });

        taposKumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Taposkumar.class);
                startActivity(intent);
            }
        });

        azizurRahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Azizurrahman.class);
                startActivity(intent);
            }
        });

        bulbulRahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Bulbulahmed.class);
                startActivity(intent);
            }
        });

        mihirChakraborty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Mihirchakraborty.class);
                startActivity(intent);
            }
        });

        saadMustaqim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Saadmustaqim.class);
                startActivity(intent);
            }
        });

        enamulHaque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Enamulhaque.class);
                startActivity(intent);
            }
        });

        souravChoudhary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Souravchoudhary.class);
                startActivity(intent);
            }
        });
        adittosir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Csechairman.class);
                startActivity(intent);
            }
        });
       safisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Engsafisirprofile.class);
                startActivity(intent);
            }
        });
        sanjidamam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Office.this,Sanjidamamprofile.class);
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