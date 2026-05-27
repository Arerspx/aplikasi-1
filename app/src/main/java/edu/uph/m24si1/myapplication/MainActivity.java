package edu.uph.m24si1.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txvnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvnama = findViewById(R.id.txvnama);
        txvnama.setText("HALO FEDE!!!!!");
        txvnama.setTextSize(18);
        for (int i = 10; i > 0; i++) {
            txvnama.setText("" + i + "");
            Log.d("cek nilai I", "" + i + "");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}