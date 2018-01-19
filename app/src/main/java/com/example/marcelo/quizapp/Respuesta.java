package com.example.marcelo.quizapp;

import android.content.Context;

/**
 * Created by Marcelo on 18/01/2018.
 */

public class Respuesta {

    private int imagen;
    private String opcion;
    private Context checkBox;

    public Respuesta(int imagen, String opcion, Context checkBox) {
        this.imagen = imagen;
        this.opcion = opcion;
        this.checkBox = checkBox;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public Context getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(Context checkBox) {
        this.checkBox = checkBox;
    }
}
