package cl.praxis.EscuelaRural_JPA.model.service;

import cl.praxis.EscuelaRural_JPA.model.entities.Alumno;
import cl.praxis.EscuelaRural_JPA.model.entities.Curso;
import cl.praxis.EscuelaRural_JPA.model.repository.AlumnoRepository;
import cl.praxis.EscuelaRural_JPA.model.repository.CursoRepository;

import cl.praxis.EscuelaRural_JPA.model.service.AlumnoService;
import cl.praxis.EscuelaRural_JPA.model.service.CursoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursoServiceImpl implements CursoService {

    CursoRepository repository;

    public CursoServiceImpl(CursoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Curso> findAll() {
        return repository.findAll();
    }

    @Override
    public Curso findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Curso c) {
        Curso result = repository.save(c);
        System.out.println("creado el id " + result.getId());

        return result != null;
    }

    @Override
    public boolean update(Curso c) {
        Curso curso = repository.save(c);
        return curso != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }
}
