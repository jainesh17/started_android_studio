package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "successfully submited", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int mile = Integer.parseInt(s);
                double kilometer = 1.60934 * mile;
                textView.setText(" KM : " + kilometer);
            }
        });
    }
}