package com.pila.pila.estructura;

import com.pila.pila.Estudiante;

public class Pila {

    private Estudiante[] estudiantes;
    private int tope;

    public Pila(int capacidad) {
        estudiantes = new Estudiante[capacidad];
        tope = -1;
    }

    public boolean agregar(Estudiante estudiante) {

        if (tope == estudiantes.length - 1) {
            return false;
        }

        tope++;
        estudiantes[tope] = estudiante;

        return true;
    }

    public Estudiante quitar() {

        if (tope == -1) {
            return null;
        }

        Estudiante estudiante = estudiantes[tope];

        estudiantes[tope] = null;
        tope--;

        return estudiante;
    }

    public Estudiante[] mostrar() {

        Estudiante[] resultado = new Estudiante[tope + 1];

        for (int i = 0; i <= tope; i++) {
            resultado[i] = estudiantes[i];
        }

        return resultado;
    }

    public int tamanyo() {
        return tope + 1;
    }
}