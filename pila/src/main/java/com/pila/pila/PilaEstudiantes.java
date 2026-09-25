package com.pila.pila;

import org.springframework.stereotype.Component;

@Component
public class PilaEstudiantes {

    private static final int CAPACIDAD = 100;
    private final Estudiante[] elementos;
    private int tope;

    public PilaEstudiantes() {
        elementos = new Estudiante[CAPACIDAD];
        tope = -1;
    }

    public boolean agregar(Estudiante estudiante) {
        if (estudiante == null || estaLlena()) {
            return false;
        }
        elementos[++tope] = estudiante;
        return true;
    }

    public Estudiante quitar() {
        if (estaVacia()) {
            return null;
        }
        Estudiante eliminado = elementos[tope];
        elementos[tope] = null;
        tope--;
        return eliminado;
    }

    public Estudiante[] mostrar() {
        int cantidad = tamanyo();
        Estudiante[] resultado = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            resultado[i] = elementos[tope - i];
        }
        return resultado;
    }

    public int tamanyo() {
        return tope + 1;
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        return tope == CAPACIDAD - 1;
    }
}
