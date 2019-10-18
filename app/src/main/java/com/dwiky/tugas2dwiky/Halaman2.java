package com.dwiky.tugas2dwiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Halaman2 extends AppCompatActivity {

    TextView txtNpm;
    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        txtNpm  = (TextView) findViewById(R.id.txtNpm);
        txtNama = (TextView) findViewById(R.id.txtNama);


        Intent datas = getIntent();
        String Npm = datas.getStringExtra("txtNpm");
        String Nama = datas.getStringExtra("txtNama");



        txtNpm.setText(Npm);
        txtNama.setText(Nama);


    }
    @Override
    public void onBackPressed() {
        Intent back = new Intent(Halaman2.this, MainActivity.class);
        startActivity(back);
        finish();

    }
}
