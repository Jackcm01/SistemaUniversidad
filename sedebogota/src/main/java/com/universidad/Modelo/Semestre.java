package com.universidad.modelo;
import java.util.List;

public class Semestre {
    String id;
    String fechaInicio;
    String fechaFin;
    //poner fecha maxima creacion de asignaturas, tres meses antes del incio
    //poner fecha de inscripcion?
    List<Clase> clases;
}
