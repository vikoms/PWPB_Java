package com.example.javapwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondCalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    Button satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, kali, bagi, tambah, kurang, samaDengan, clear;
    TextView hasil;
    boolean plus,min,div,times;
    float var1,var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_calculator);

        satu = (Button) findViewById(R.id.btnSatu);
        satu.setOnClickListener(this);

        dua = (Button) findViewById(R.id.btnDua);
        dua.setOnClickListener(this);

        tiga = (Button) findViewById(R.id.btnTiga);
        tiga.setOnClickListener(this);

        empat = (Button) findViewById(R.id.btnEmpat);
        empat.setOnClickListener(this);

        lima = (Button) findViewById(R.id.btnLima);
        lima.setOnClickListener(this);

        enam = (Button) findViewById(R.id.btnEnam);
        enam.setOnClickListener(this);

        tujuh = (Button) findViewById(R.id.btnTujuh);
        tujuh.setOnClickListener(this);

        delapan = (Button) findViewById(R.id.btnDelapan);
        delapan.setOnClickListener(this);

        sembilan = (Button) findViewById(R.id.btnSembilan);
        sembilan.setOnClickListener(this);

        kali = (Button) findViewById(R.id.buttonKali);
        kali.setOnClickListener(this);

        bagi = (Button) findViewById(R.id.buttonBagi);
        bagi.setOnClickListener(this);

        tambah = (Button) findViewById(R.id.buttonTambah);
        tambah.setOnClickListener(this);

        kurang = (Button) findViewById(R.id.buttonKurang);
        kurang.setOnClickListener(this);

        samaDengan = (Button) findViewById(R.id.btnSamaDengan);
        samaDengan.setOnClickListener(this);

        clear = (Button) findViewById(R.id.btnClear);
        clear.setOnClickListener(this);


        hasil = (TextView) findViewById(R.id.txtHasil);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnClear:
                hasil.setText(" ");
                break;
            case R.id.btnSatu:
                hasil.setText(hasil.getText().toString().trim() + "1");
                break;
            case R.id.btnDua:
                hasil.setText(hasil.getText().toString().trim() + "2");
                break;
            case R.id.btnTiga:
                hasil.setText(hasil.getText().toString().trim() + "3");
                break;
            case R.id.btnEmpat:
                hasil.setText(hasil.getText().toString().trim() + "4");
                break;
            case R.id.btnLima:
                hasil.setText(hasil.getText().toString().trim() + "5");
                break;
            case R.id.btnEnam:
                hasil.setText(hasil.getText().toString().trim() + "6");
                break;
            case R.id.btnTujuh:
                hasil.setText(hasil.getText().toString().trim() + "7");
                break;
            case R.id.btnDelapan:
                hasil.setText(hasil.getText().toString().trim() + "8");
                break;
            case R.id.btnSembilan:
                hasil.setText(hasil.getText().toString().trim() + "9");
                break;
            case R.id.btnNol:
                hasil.setText(hasil.getText().toString().trim() + "0");
                break;
            case R.id.buttonTitik:
                hasil.setText(hasil.getText().toString().trim() + ".");
                break;
            case R.id.buttonTambah:
                var1 = Float.parseFloat(hasil.getText().toString());
                plus = true;
                hasil.setText(null);
                break;
            case R.id.buttonKurang:
                var1 = Float.parseFloat(hasil.getText().toString());
                min = true;
                hasil.setText(null);
                break;
            case R.id.buttonKali:
                var1 = Float.parseFloat(hasil.getText().toString());
                times = true;
                hasil.setText(null);
                break;
            case R.id.buttonBagi:
                var1 = Float.parseFloat(hasil.getText().toString());
                div = true;
                hasil.setText(null);
                break;
            case R.id.btnSamaDengan :
                var2 = Float.parseFloat(hasil.getText().toString().trim());
                if (plus == true) {
                    hasil.setText(var1+var2+"");
                    plus = false;
                }else if(min == true) {
                    hasil.setText(var1-var2+"");
                    min = false;
                }else if(div == true) {
                    hasil.setText(var1/var2+"");
                    div = false;
                }else if(times == true) {
                    hasil.setText(var1*var2+"");
                    times = false;
                }
        }
    }
}
