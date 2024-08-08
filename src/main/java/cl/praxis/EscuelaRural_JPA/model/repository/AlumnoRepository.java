package cl.praxis.EscuelaRural_JPA.model.repository;
import cl.praxis.EscuelaRural_JPA.model.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
