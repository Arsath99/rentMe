package com.example.rentme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button btnrenter;
    private Button btnrentee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnrenter = findViewById(R.id.btnRenter);
        btnrenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {opennewactivity2();}
        });
    }

    private void opennewactivity2() {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }


}