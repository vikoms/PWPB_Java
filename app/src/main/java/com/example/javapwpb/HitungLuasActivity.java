package com.example.javapwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.ETC1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungLuasActivity extends AppCompatActivity {

    EditText panjang,lebar;
    TextView hasil;
    Button btn_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas);

        panjang = (EditText) findViewById(R.id.edt_panjang);
        lebar = (EditText) findViewById(R.id.edt_lebar);
        hasil = (TextView) findViewById(R.id.txt_luas);
        btn_hasil = (Button) findViewById(R.id.btn_hitung);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double p = (double) Double.parseDouble(panjang.getText().toString().trim());
                double l = (double) Double.parseDouble(lebar.getText().toString().trim());

                double luas = p * l;

                hasil.setText(luas +"cm");
            }
        });


    }
}
