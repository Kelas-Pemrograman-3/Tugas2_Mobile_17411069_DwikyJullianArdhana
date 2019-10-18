package com.dwiky.tugas2dwiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNpm;
    EditText edtNama;
    TextView txtNpm;
    TextView txtNama;
    Button btnSend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNpm  = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);

        btnSend = (Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Npm = edtNpm.getText().toString();
                String Nama = edtNama.getText().toString();

                Intent next = new Intent(MainActivity.this,Halaman2.class);
                next.putExtra("txtNpm", Npm);
                next.putExtra("txtNama", Nama);
                startActivity(next);
                finish();
            }
        });
    }
}
