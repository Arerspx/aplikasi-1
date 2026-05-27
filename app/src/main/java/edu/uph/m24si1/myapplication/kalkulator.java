package edu.uph.m24si1.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Nama class wajib sama persis dengan nama file: Kalkulator
public class Kalkulator extends AppCompatActivity {

    private EditText edtAngka1, edtAngka2;
    private Button btnTambah, btnKurang, btnKali, btnBagi;
    private TextView txvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Menggunakan activity_kalkulator2 yang memiliki ID yang sesuai
        setContentView(R.layout.activity_kalkulator2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Hubungkan variabel sama ID yang ada di XML kamu
        edtAngka1 = findViewById(R.id.edtAngka1);
        edtAngka2 = findViewById(R.id.edtAngka2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        txvHasil = findViewById(R.id.txvHasil);

        // --- Logika Tombol Tambah ---
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                double angka2 = Double.parseDouble(edtAngka2.getText().toString());
                double hasil = angka1 + angka2;
                txvHasil.setText("Hasil Tambah: " + hasil);
            }
        });

        // --- Logika Tombol Kurang ---
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                double angka2 = Double.parseDouble(edtAngka2.getText().toString());
                double hasil = angka1 - angka2;
                txvHasil.setText("Hasil Kurang: " + hasil);
            }
        });

        // --- Logika Tombol Kali ---
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                double angka2 = Double.parseDouble(edtAngka2.getText().toString());
                double hasil = angka1 * angka2;
                txvHasil.setText("Hasil Kali: " + hasil);
            }
        });

        // --- Logika Tombol Bagi ---
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                double angka2 = Double.parseDouble(edtAngka2.getText().toString());

                // Validasi biar gak eror kalau pembaginya nol
                if (angka2 == 0) {
                    txvHasil.setText("Eror: Angka kedua gak boleh 0!");
                } else {
                    double hasil = angka1 / angka2;
                    txvHasil.setText("Hasil Bagi: " + hasil);
                }
            }
        });
    }
}