package com.example.sahilgogna.project3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TemperatureActivity extends AppCompatActivity implements View.OnClickListener {

    Button convert, returnButton;
    EditText celciusTemp;
    TextView kelvinText, farText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        initialize();
    }

    private void initialize(){
        convert = findViewById(R.id.convertTemp);
        convert.setOnClickListener(this);
        returnButton = findViewById(R.id.returnTemp);
        returnButton.setOnClickListener(this);
        celciusTemp = findViewById(R.id.cEditText);
        farText = findViewById(R.id.convertedF);
        kelvinText = findViewById(R.id.convertedK);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.convertTemp :
                String cTemp = celciusTemp.getText().toString();
                try{
                    double temp = Double.parseDouble(cTemp);
                    double far = (temp * 9/5) + 32;
                    double kel = temp +  273.15;
                    farText.setText(far+"");
                    kelvinText.setText(kel+"");
                }catch(Exception e){
                    Toast.makeText(this,"Invalid Input",Toast.LENGTH_LONG).show();
                }finally {
                    break;
                }

            case R.id.returnTemp :
                finish();
                break;
        }
    }
}
