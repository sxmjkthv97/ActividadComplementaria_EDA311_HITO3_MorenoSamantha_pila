package com.pila.pila.controlador;

import com.pila.pila.Estudiante;
import com.pila.pila.servicio.PilaServicio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pila")
public class PilaController {

    private final PilaServicio pilaServicio;

    public PilaController(PilaServicio pilaServicio) {
        this.pilaServicio = pilaServicio;
    }

    @PostMapping("/agregar")
    public String agregar(@RequestBody Estudiante estudiante) {

        boolean agregado = pilaServicio.agregar(estudiante);

        if (agregado) {
            return "Estudiante agregado correctamente";
        }

        return "La pila está llena";
    }

    @DeleteMapping("/quitar")
    public Estudiante quitar() {
        return pilaServicio.quitar();
    }

    @GetMapping("/mostrar")
    public Estudiante[] mostrar() {
        return pilaServicio.mostrar();
    }

    @GetMapping("/tamanyo")
    public int tamanyo() {
        return pilaServicio.tamanyo();
    }
}