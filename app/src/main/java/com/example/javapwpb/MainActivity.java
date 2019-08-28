package com.example.javapwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNamaDepan,txtNamaBelakang;
    TextView txtOutput;
    Button btnTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNamaDepan = (EditText) findViewById(R.id.txtNamaDepan);
        txtNamaBelakang= (EditText) findViewById(R.id.txtNamaBelakang);
        txtOutput= (TextView) findViewById(R.id.txtOutput);
        btnTampil= (Button) findViewById(R.id.btnTampil);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaDepan = txtNamaDepan.getText().toString();
                String namaBelakagan = txtNamaBelakang.getText().toString();
                String output = namaDepan + " " + namaBelakagan;

                txtOutput.setText(output);
            }
        });

        findViewById(R.id.btn_hitung_luas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent luas = new Intent(MainActivity.this, HitungLuasActivity.class);
                startActivity(luas);
            }
        });
        findViewById(R.id.btn_kalkulator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kalkulator = new Intent(MainActivity.this, KalkulatorActivity.class);
                startActivity(kalkulator);
            }
        });
        findViewById(R.id.konversi_suhu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suhu = new Intent(MainActivity.this, KonversiSuhuActivity.class);
                startActivity(suhu);
            }
        });

        findViewById(R.id.kalkulator_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_kalkulator = new Intent(MainActivity.this, SecondCalculatorActivity.class);
                startActivity(btn_kalkulator);
            }
        });


    }
}
