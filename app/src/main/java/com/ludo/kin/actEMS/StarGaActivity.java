package com.ludo.kin.actEMS;

import static com.ludo.kin.AppEMS.viewModEMS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ludo.kin.R;

public class StarGaActivity extends AppCompatActivity {

    TextView textView4,textView5, textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_ga);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        viewModEMS.sss(this);
        textView4.setText("Your victories " + viewModEMS.getV());
        textView5.setText("Your defeats " + viewModEMS.getD());
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finishAffinity();
            }
        });
    }
}