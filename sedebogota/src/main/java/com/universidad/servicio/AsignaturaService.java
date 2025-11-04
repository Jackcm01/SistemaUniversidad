package com.universidad.servicio;

import org.springframework.stereotype.Service;

import com.universidad.modelo.Asignatura;
import com.universidad.repositorio.AsignaturaRepository;

@Service
public class AsignaturaService {

    private final AsignaturaRepository repo;

    public AsignaturaService(AsignaturaRepository asignaturaRepository){
        this.repo = asignaturaRepository;
    }

    public Asignatura getAsignatura(Long id){
        return repo.findById(id).orElse(null);
    }

    public Asignatura crear(Asignatura asignatura){
        return repo.save(asignatura);
    }
}
