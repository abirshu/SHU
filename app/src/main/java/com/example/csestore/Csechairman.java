package com.example.csestore;

import static android.content.ContentValues.TAG;
import static android.net.Uri.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.text.BreakIterator;

public class Csechairman extends AppCompatActivity {

    private CardView cseCharimancall,cseChairmanMail;
    private android.content.Intent Intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csechairman);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        cseCharimancall = findViewById(R.id.cseCharimanCallButtonId);
        cseChairmanMail = findViewById(R.id.cseChairmanMailButtonId);


        cseCharimancall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:01550059952"));
                startActivity(intent);


            }
        });

        cseChairmanMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:aditya@du.ac.bd")));

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