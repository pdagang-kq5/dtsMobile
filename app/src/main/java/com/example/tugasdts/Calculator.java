package com.example.tugasdts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    EditText angkaPertama, angkaKedua;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        angkaPertama = (EditText) findViewById(R.id.angkaPertama);
        angkaKedua = (EditText) findViewById(R.id.angkaKedua);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        bersihkan = (Button) findViewById(R.id.clear);
        hasil = (TextView) findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkaPertama.getText().length()>0) && (angkaKedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(Calculator.this,"Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkaPertama.getText().length()>0) && (angkaKedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(Calculator.this,"Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkaPertama.getText().length()>0) && (angkaKedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(Calculator.this,"Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((angkaPertama.getText().length()>0) && (angkaKedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(Calculator.this,"Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama.setText("");
                angkaKedua.setText("");
                hasil.setText("0");
                angkaPertama.requestFocus();
            }
        });
    }
}