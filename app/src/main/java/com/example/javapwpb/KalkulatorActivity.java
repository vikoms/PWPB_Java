package com.example.javapwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity implements View.OnClickListener {

    EditText number1, number2, txtHasil;
    Button btn_tambah, btn_bagi, btn_kali, btn_kurang;
    protected float txtA, txtB, txtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        number1 = (EditText) findViewById(R.id.txtA);
        number2 = (EditText) findViewById(R.id.txtB);
        txtHasil = (EditText) findViewById(R.id.txtC);

        btn_tambah = (Button) findViewById(R.id.btnTambah);
        btn_tambah.setOnClickListener(this);

        btn_bagi = (Button) findViewById(R.id.btnBagi);
        btn_bagi.setOnClickListener(this);

        btn_kali = (Button) findViewById(R.id.btnKali);
        btn_kali.setOnClickListener(this);

        btn_kurang = (Button) findViewById(R.id.btnKurang);
        btn_kurang.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        txtA = Float.parseFloat(number1.getText().toString().trim());
        txtB = Float.parseFloat(number2.getText().toString().trim());
        switch (view.getId()) {
            case R.id.btnTambah:
                txtC = txtA + txtB;
                txtHasil.setText(txtC + "");
                break;
            case R.id.btnKali:
                txtC = txtA * txtB;
                txtHasil.setText(txtC + "");
                break;
            case R.id.btnKurang:
                txtC = txtA - txtB;
                txtHasil.setText(txtC + "");
                break;
            case R.id.btnBagi:
                txtC = txtA / txtB;
                txtHasil.setText(txtC + "");
                break;
        }
    }
}
