package com.example.onlineshopping;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        // Find TextViews
        TextView textViewBashaer = findViewById(R.id.textViewBashaer);
        TextView textViewFayzah = findViewById(R.id.textViewFayzah);

        textViewBashaer.setText("Bushra alfoud 202207249");
        textViewFayzah.setText("Raghad abdu  202203838");

    }
}
