package com.example.javapwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiSuhuActivity extends AppCompatActivity {
    EditText celcius,fahrenheit,kelvin,reamur;
    Button btn_konversi;
    float hasil_celcius,hasil_fahrenheit,hasil_kelvin,hasil_reamur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        celcius = (EditText) findViewById(R.id.txtCelcius);
        fahrenheit = (EditText) findViewById(R.id.txtFahrenhit);
        kelvin = (EditText) findViewById(R.id.txtKelvin);
        reamur = (EditText) findViewById(R.id.txtReamur);
        btn_konversi = (Button) findViewById(R.id.btnKonversi);

        btn_konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil_celcius = Float.parseFloat(celcius.getText().toString().trim());

                hasil_fahrenheit = (hasil_celcius*9/5)+32;
                hasil_kelvin= hasil_celcius + 273;
                hasil_reamur = (float) (0.8 * hasil_celcius);

                fahrenheit.setText(hasil_fahrenheit+"");
                kelvin.setText(hasil_kelvin+"");
                reamur.setText(hasil_reamur+"");
            }
        });







    }
}
