package com.example.csestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cgpacalculate extends AppCompatActivity {
private EditText Credit;
    private EditText Grade;
private Button addcourse, enterCgpa, erase;
private TextView textView;
double counter = 0, total_credit = 0, credit =0, grade =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpacalculate);

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        Credit = findViewById(R.id.editText1);
        Grade = findViewById(R.id.editText2);
        addcourse = findViewById(R.id.button);
        enterCgpa = findViewById(R.id.button2);
        erase = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);

        addcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try
                {
                    credit = Double.parseDouble(Credit.getText().toString());
                    grade = Double.parseDouble(Grade.getText().toString());
                }
                catch (Exception e)
                {
                    Toast.makeText(Cgpacalculate.this,"Please Enter your Credit and Grade",Toast.LENGTH_SHORT).show();
                }


                counter +=(grade*credit);
                total_credit+= credit;
                Toast.makeText(getApplicationContext(),"Credit: " + credit + "\n Grade : " + grade,Toast.LENGTH_SHORT).show();

                Credit.setText("");
                Grade.setText("");

            }
        });

        enterCgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = counter/total_credit;
                textView.setText("Your CGPA : " +result);
            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                total_credit = 0;
                credit =0;
                grade =0;
                Credit.setText("");
                Grade.setText("");
                textView.setText("");

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