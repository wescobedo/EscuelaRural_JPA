package cl.praxis.EscuelaRural_JPA.model.service;

import cl.praxis.EscuelaRural_JPA.model.entities.Alumno;
import cl.praxis.EscuelaRural_JPA.model.entities.Curso;
import cl.praxis.EscuelaRural_JPA.model.repository.AlumnoRepository;
import cl.praxis.EscuelaRural_JPA.model.repository.CursoRepository;

import cl.praxis.EscuelaRural_JPA.model.service.AlumnoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlumnoServiceImpl implements AlumnoService {

    AlumnoRepository repository;

    public AlumnoServiceImpl(AlumnoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Alumno> findAll() {
        return repository.findAll();
    }

    @Override
    public Alumno findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Alumno a) {
        Alumno result = repository.save(a);
        System.out.println("creado el id " + result.getId());

        return result != null;
    }

    @Override
    public boolean update(Alumno a) {
        Alumno alumno = repository.save(a);
        return alumno != null;
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
