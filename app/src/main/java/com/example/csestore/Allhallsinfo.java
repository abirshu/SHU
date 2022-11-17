package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class Allhallsinfo extends AppCompatActivity {

    private Button hall_super_one_male,hall_super_two_male,administrative_male, hall_super_one_female,hall_super_two_female,administrative_female;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allhallsinfo);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        hall_super_one_male = (Button) findViewById(R.id.hallSuperonemaleButtonId);
        hall_super_two_male = (Button)findViewById(R.id.hallSupetwomaleButtonId);
        administrative_male =(Button) findViewById(R.id.administrativeofficermaleButtonId);


        hall_super_one_female =(Button) findViewById(R.id.hallSuperonefemaleButtonId);
        hall_super_two_female = (Button)findViewById(R.id.hallSupetwofemaleButtonId);
        administrative_female =(Button) findViewById(R.id.administrativeOfficerfemaleButtonId);
        administrative_male =(Button)  findViewById(R.id.administrativeofficermaleButtonId);


        hall_super_one_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allhallsinfo.this,Halimsirprofile.class);
                startActivity(intent);
            }
        });

        hall_super_two_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allhallsinfo.this,Shiamsirprofile.class);
                startActivity(intent);
            }
        });

        hall_super_one_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Allhallsinfo.this,Malamaprofile.class);
                startActivity(intent);
            }
        });

        hall_super_two_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allhallsinfo.this,Enganushkamamprofile.class);
                startActivity(intent);
            }
        });



    administrative_female.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Allhallsinfo.this,Pohelidi.class);
            startActivity(intent);

        }
    });
        administrative_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allhallsinfo.this,Mizanvaiprofile.class);
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

    //for search view
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {

        getMenuInflater().inflate(R.menu.menu_layout,menu);
        MenuItem menuItem =menu.findItem(R.id.searchViewId);
        SearchView searchView =(SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type here to search");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {



                fileList(newText);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

    private void fileList(String text) {


    }
}