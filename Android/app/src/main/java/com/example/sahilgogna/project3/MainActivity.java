package com.example.sahilgogna.project3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button temButton, metricButton, endButton;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize(){
        temButton = findViewById(R.id.tempButton);
        metricButton = findViewById(R.id.metrixButton);
        endButton = findViewById(R.id.endButton);
        temButton.setOnClickListener(this);
        metricButton.setOnClickListener(this);
        endButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tempButton :
                intent = new Intent(this, TemperatureActivity.class);
                startActivity(intent);
                break;

            case R.id.metrixButton :
                intent = new Intent(this, ActivityMetric.class);
                startActivity(intent);
                break;

            case R.id.endButton :
                finish();
                break;
        }
    }
}
