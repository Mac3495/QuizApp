package com.example.marcelo.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText editText;
    TextInputLayout textInputLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn_main);
        textInputLayout = (TextInputLayout) findViewById(R.id.text_input_main);
        editText = (EditText) findViewById(R.id.edit_text_main);

        final String nombre = textInputLayout.getEditText().getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Bienvenido: " + nombre , Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), QuizActivity.class));
            }
        });
    }
}
