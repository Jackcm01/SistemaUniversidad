package com.universidad.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.universidad.modelo.Asignatura;
import com.universidad.servicio.AsignaturaService;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {

    private AsignaturaService service;

    public AsignaturaController(AsignaturaService asignaturaService){
        this.service = asignaturaService;
    }

    @GetMapping("/Test")
    public String getTestData() {
        return "Hello World";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asignatura> getAsignatura(@PathVariable Long id){
        return ResponseEntity.ok(service.getAsignatura(id));
    }

    @PostMapping
    public ResponseEntity<Asignatura> crearAsignatura(@RequestBody Asignatura asignatura){
        return ResponseEntity.ok(service.crear(asignatura));
    }
}
