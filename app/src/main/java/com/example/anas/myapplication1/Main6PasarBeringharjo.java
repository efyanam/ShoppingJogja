package com.example.anas.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;



public class Main6PasarBeringharjo extends AppCompatActivity {
    private TextView tvLinkfy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_pasar_beringharjo);
        tvLinkfy = (TextView) findViewById(R.id.textViewLinkberingharjo);
        tvLinkfy.setText("Pasar beringharjo \n" +
                "Lihat Peta  \n" +
                "https://goo.gl/maps/zjfSGB6X4Zp \n");
        Linkify.addLinks(tvLinkfy,Linkify.ALL);
    }
}
