package com.example.marcelo.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    RecyclerView rv1, rv2;
    RespuestaAdapter adapter;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        rv1 = (RecyclerView) findViewById(R.id.rv_pregunta1);
        rv2 = (RecyclerView) findViewById(R.id.rv_pregunta2);
        btn = (Button) findViewById(R.id.btn_quiz);

        rv1.setHasFixedSize(true);
        rv1.setLayoutManager(new LinearLayoutManager(this));
        rv2.setHasFixedSize(true);
        rv2.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RespuestaAdapter(this);

        llenarDatos();

        rv1.setAdapter(adapter);
        rv2.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuizActivity.this, "En construccion :D", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*De momento los RecyclerView no valoran una calificacion a las preguntas
    * se debe completar el adaptador y varias cosas mas*/


    private void llenarDatos() {
        List<Respuesta> lista = new ArrayList<>();
        lista.add(new Respuesta(R.mipmap.ic_launcher, "Opcion 1", this));
        lista.add(new Respuesta(R.mipmap.ic_launcher, "Opcion 2", this));
        lista.add(new Respuesta(R.mipmap.ic_launcher, "Opcion 3", this));
        lista.add(new Respuesta(R.mipmap.ic_launcher, "Opcion 4", this));
        adapter.setDataset(lista);
    }
}
