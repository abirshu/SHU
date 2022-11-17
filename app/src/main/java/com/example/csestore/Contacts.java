package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.logging.Handler;

public class Contacts extends AppCompatActivity {

    CardView department, office,hall, emergency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        department = findViewById(R.id.departmentsCardViewId);
        hall = findViewById(R.id.hallCardViewId);
        office = findViewById(R.id.officeCardViewId);
        emergency = findViewById(R.id.emergencyCardViewId);

        department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Contacts.this,Alldeptinfo.class);
                startActivity(intent);
            }
        });



        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Contacts.this,Allhallsinfo.class);
                startActivity(intent);

            }
        });

        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Contacts.this,Office.class);
                startActivity(intent);

            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Contacts.this,Emergency.class);
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
    public boolean onCreateOptionsMenu(@NonNull Menu menu, Handler adapter) {

        getMenuInflater().inflate(R.menu.menu_layout,menu);
        MenuItem menuItem =menu.findItem(R.id.searchViewId);
        SearchView searchView =(SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type here to search");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            private String list;

            @Override
            public boolean onQueryTextSubmit(String query)
            {

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {




                //    adapter.getFilter().filter(newText);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

    private void fileList(String text) {


    }
}