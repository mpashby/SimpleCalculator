package com.mobappdev.pashby.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAddButton();
        initSubractButton();
        initMultiplyButton();
        initDivideButton();
    }

    private void initAddButton(){
        ImageButton addButton = (ImageButton)findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText numberOne = (EditText) findViewById(R.id.editTextName1);
                EditText numberTwo = (EditText) findViewById(R.id.editTextName2);
                TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
                int num1 = Integer.parseInt(numberOne.getText().toString());
                int num2 = Integer.parseInt(numberTwo.getText().toString());
                String total =  String.valueOf(num1+num2) ;
                textDisplay.setText(total);
            }
        });
    }

    private void initSubractButton(){
        ImageButton subButton = (ImageButton)findViewById(R.id.subButton);
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText numberOne = (EditText) findViewById(R.id.editTextName1);
                EditText numberTwo = (EditText) findViewById(R.id.editTextName2);
                TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
                int num1 = Integer.parseInt(numberOne.getText().toString());
                int num2 = Integer.parseInt(numberTwo.getText().toString());
                String total =  String.valueOf(num1-num2) ;
                textDisplay.setText(total);
            }
        });
    }

    private void initMultiplyButton(){
        ImageButton multButton = (ImageButton)findViewById(R.id.multButton);
        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText numberOne = (EditText) findViewById(R.id.editTextName1);
                EditText numberTwo = (EditText) findViewById(R.id.editTextName2);
                TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
                int num1 = Integer.parseInt(numberOne.getText().toString());
                int num2 = Integer.parseInt(numberTwo.getText().toString());
                String total =  String.valueOf(num1*num2) ;
                textDisplay.setText(total);
            }
        });
    }

    private void initDivideButton(){
        ImageButton divButton = (ImageButton)findViewById(R.id.divButton);
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText numberOne = (EditText) findViewById(R.id.editTextName1);
                EditText numberTwo = (EditText) findViewById(R.id.editTextName2);
                TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
                int num1 = Integer.parseInt(numberOne.getText().toString());
                int num2 = Integer.parseInt(numberTwo.getText().toString());
                String total =  String.valueOf(num1/num2) ;
                textDisplay.setText(total);
            }
        });
    }
}
