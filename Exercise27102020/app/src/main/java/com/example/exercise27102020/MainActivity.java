package com.example.exercise27102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner from, to;
    EditText amount;
    TextView result;
    private List<String> items;
    private double usd2vnd = 22.5, eur2vnd = 26.5, jpy2vnd = 217.5,
                    aud2vnd = 16.1, cad2vnd = 17.1, krw2vnd = 24.0,
                    cny2vnd = 3.4, sgd2vnd = 16.7, gbp2vnd = 29.7;
    String from1, to1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<>();
        items.add("USD");
        items.add("VND");
        items.add("EUR");
        items.add("JPY");
        items.add("AUD");
        items.add("CAD");
        items.add("KRW");
        items.add("CNY");
        items.add("SGD");
        items.add("GBP");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        from = findViewById(R.id.spinner_from);
        from.setAdapter(adapter);
        from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from1 = items.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        to = findViewById(R.id.spinner_to);
        to.setAdapter(adapter);
        to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to1 = items.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        result = findViewById(R.id.result);

        amount = findViewById(R.id.amount);
        amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                double amount1 = s.toString().length() > 0 ?Double.parseDouble(s.toString()): 0;
                double vnd = amount1;

                switch (from1){
                    case "USD":
                        vnd = amount1 * usd2vnd;
                        break;
                    case "VND":
                        vnd = amount1;
                        break;
                    case "EUR":
                        vnd = amount1 * eur2vnd;
                        break;
                    case "JPY":
                        vnd = amount1 * jpy2vnd;
                        break;
                    case "AUD":
                        vnd = amount1 * aud2vnd;
                        break;
                    case "CAD":
                        vnd = amount1 * cad2vnd;
                        break;
                    case "KRW":
                        vnd = amount1 * krw2vnd;
                        break;
                    case "CNY":
                        vnd = amount1 * cny2vnd;
                        break;
                    case "SGD":
                        vnd = amount1 * sgd2vnd;
                        break;
                    case "GBP":
                        vnd = amount1 * gbp2vnd;
                        break;
                }

                double result1 = vnd;

                switch (to1){
                    case "USD":
                        result1 = vnd / usd2vnd;
                        break;
                    case "VND":
                        result1 = vnd;
                        break;
                    case "EUR":
                        result1 = vnd / eur2vnd;
                        break;
                    case "JPY":
                        result1 = vnd / jpy2vnd;
                        break;
                    case "AUD":
                        result1 = vnd / aud2vnd;
                        break;
                    case "CAD":
                        result1 = vnd / cad2vnd;
                        break;
                    case "KRW":
                        result1 = vnd / krw2vnd;
                        break;
                    case "CNY":
                        result1 = vnd / cny2vnd;
                        break;
                    case "SGD":
                        result1 = vnd / sgd2vnd;
                        break;
                    case "GBP":
                        result1 = vnd / gbp2vnd;
                        break;
                }
                result.setText(String.valueOf(result1));
            }

        });


    }
}