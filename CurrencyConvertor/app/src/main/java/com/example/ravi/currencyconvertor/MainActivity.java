package com.example.ravi.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertRupees (View view) {

        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);

        Double amountDouble = Double.parseDouble(amountEditText.getText().toString());

        Double rupeesAmount = amountDouble*64.82;

        Toast.makeText(MainActivity.this, String.format("%.2f",rupeesAmount) + "Rs.", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
