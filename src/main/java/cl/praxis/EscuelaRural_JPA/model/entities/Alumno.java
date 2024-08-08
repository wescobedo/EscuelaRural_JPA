package cl.praxis.EscuelaRural_JPA.model.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alumno_id")
    private int id;
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name="curso_id", insertable = true, updatable = true)
    private Curso curso;

    public Alumno() {
    }

    public Alumno(int id, String firstName, String lastName, Curso curso) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
