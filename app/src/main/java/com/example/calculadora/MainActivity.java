package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final EditText text1 = findViewById(R.id.editText2);
        final EditText text2 = findViewById(R.id.editText3);

        final TextView resultado = findViewById(R.id.tvresultado);

        Button suma = findViewById(R.id.button);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(text1.getText().toString());
                int b= Integer.parseInt(text2.getText().toString());
                int r=a+b;

                resultado.setText(String.valueOf(r));

            }
        });
    }
}
