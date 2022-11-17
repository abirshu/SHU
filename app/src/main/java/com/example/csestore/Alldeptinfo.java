package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Alldeptinfo extends AppCompatActivity {
private Button cseButton,banButton,engButton,ecoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldeptinfo);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cseButton =(Button) findViewById(R.id.cseButtonId);
        banButton = (Button) findViewById(R.id.banglaButtonId);
        engButton =(Button) findViewById(R.id.englishButtonId);
        ecoButton = (Button) findViewById(R.id.ecoButtonId);


        cseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Alldeptinfo.this,Csecontacts.class);
                startActivity(intent);
            }
        });

        banButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Alldeptinfo.this,Banglacontacts.class);
                startActivity(intent);

            }
        });

        engButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Alldeptinfo.this,Englishcontacts.class);
                startActivity(intent);
            }
        });

        ecoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Alldeptinfo.this,Ecocontacts.class);
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