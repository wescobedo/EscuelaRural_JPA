package cl.praxis.EscuelaRural_JPA.model.service;

import cl.praxis.EscuelaRural_JPA.model.entities.Alumno;
import java.util.List;

public interface  AlumnoService {
    List<Alumno> findAll();
    Alumno findOne(int id);
    boolean create(Alumno a);
    boolean update(Alumno a);
    boolean delete(int id);

}
