package com.example.sahilgogna.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMetric extends AppCompatActivity implements View.OnClickListener {

    Button convert, returnButton;
    EditText meter;
    TextView centi, kilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metric);
        initialize();
    }

    private void initialize(){
        convert = findViewById(R.id.convertMetric);
        convert.setOnClickListener(this);
        returnButton = findViewById(R.id.returnMetric);
        returnButton.setOnClickListener(this);
        meter = findViewById(R.id.meterEditText);
        centi = findViewById(R.id.convertedCenti);
        kilo = findViewById(R.id.convertedKilometer);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.convertMetric :
                String meterDouble = meter.getText().toString();
                try{
                    double meter = Double.parseDouble(meterDouble);
                    double centiDouble = meter*100;
                    double kiloDouble = meter/1000;
                    centi.setText(centiDouble+"");
                    kilo.setText(kiloDouble+"");
                }catch(Exception e){
                    Toast.makeText(this,"Invalid Input",Toast.LENGTH_LONG).show();
                }finally {
                    break;
                }

            case R.id.returnMetric :
                finish();
                break;
        }
        }


}
