package com.pila.pila.servicio;

import com.pila.pila.estructura.Pila;
import com.pila.pila.Estudiante;
import org.springframework.stereotype.Service;

@Service
public class PilaServicio {

    private final Pila pila = new Pila(100);

    public boolean agregar(Estudiante estudiante) {
        return pila.agregar(estudiante);
    }

    public Estudiante quitar() {
        return pila.quitar();
    }

    public Estudiante[] mostrar() {
        return pila.mostrar();
    }

    public int tamanyo() {
        return pila.tamanyo();
    }
}