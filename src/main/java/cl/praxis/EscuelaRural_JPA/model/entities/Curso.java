package cl.praxis.EscuelaRural_JPA.model.entities;
import jakarta.persistence.*;

@Entity
@Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="curso_id")
    private int id;
    private String cursoname;

    public Curso() {
    }

    public Curso(int id, String cursoname) {
        this.id = id;
        this.cursoname = cursoname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCursoname() {
        return cursoname;
    }

    public void setCursoname(String cursoname) {
        this.cursoname = cursoname;
    }
}
