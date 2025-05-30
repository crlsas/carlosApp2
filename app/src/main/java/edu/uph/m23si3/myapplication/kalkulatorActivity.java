package edu.uph.m23si3.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class kalkulatorActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonTambah, buttonKali, buttonBagi;
    EditText editTextA, editTextB;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        buttonTambah = findViewById(R.id.btn_tambah);
        buttonKali = findViewById(R.id.btn_kali);
        buttonBagi = findViewById(R.id.btn_bagi);
        editTextA = findViewById(R.id.NilaiA);
        editTextB = findViewById(R.id.NilaiB);
        textView = findViewById(R.id.Hasil);

        buttonTambah.setOnClickListener(this);
        buttonKali.setOnClickListener(this);
        buttonBagi.setOnClickListener(this);
        }

    public int getIntFromEditText(EditText editText){
        if (editText.getText().toString().equals("")){
            Toast.makeText(this,"Nilai pertama (A)",Toast.LENGTH_SHORT).show();
            return 0;
        } else
            return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextA);
        num2 = getIntFromEditText(editTextB);
        switch (view.getId()){
            case R.id.btn_tambah:
                textView.setText("Hasil = "+(num1 + num2));
                break;

            case R.id.btn_kali:
                textView.setText("Hasil = "+(num1 * num2));
                break;

            case R.id.btn_bagi:
                textView.setText("Hasil = "+((float)num1 /(float) num2));
                break;
        }
    }
}