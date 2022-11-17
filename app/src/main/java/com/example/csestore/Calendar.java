package com.example.csestore;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.github.barteksc.pdfviewer.PDFView;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();





        PDFView pdfView =findViewById(R.id.pdfView);
        pdfView.fromAsset("shucalander.pdf").load();
    }
}