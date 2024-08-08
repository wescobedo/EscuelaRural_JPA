package cl.praxis.EscuelaRural_JPA.model.service;
import cl.praxis.EscuelaRural_JPA.model.entities.Curso;

import java.util.List;

public interface CursoService {

    List<Curso> findAll();
    Curso findOne(int id);
    boolean create(Curso c);
    boolean update(Curso c);
    boolean delete(int id);
}
