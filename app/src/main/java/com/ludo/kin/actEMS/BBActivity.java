package com.ludo.kin.actEMS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ludo.kin.R;

public class BBActivity extends AppCompatActivity {

    TextView textViewst, textViewru,textViewrrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbactivity);
        textViewst = findViewById(R.id.textViewst);
        textViewru = findViewById(R.id.textIntE);
        textViewrrr = findViewById(R.id.textViewrrr);

        textViewst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),StarGaActivity.class));
            }
        });

        textViewru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewrrr.setVisibility(View.VISIBLE);
                textViewru.setVisibility(View.INVISIBLE);
                textViewst.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    public void onBackPressed() {
        textViewrrr.setVisibility(View.INVISIBLE);
        textViewru.setVisibility(View.VISIBLE);
        textViewst.setVisibility(View.VISIBLE);
    }
}