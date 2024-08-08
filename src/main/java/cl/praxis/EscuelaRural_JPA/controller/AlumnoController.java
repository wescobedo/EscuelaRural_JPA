package cl.praxis.EscuelaRural_JPA.controller;
import cl.praxis.EscuelaRural_JPA.model.entities.Alumno;
import cl.praxis.EscuelaRural_JPA.model.service.AlumnoService;
import cl.praxis.EscuelaRural_JPA.model.service.CursoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoService service;
    private final CursoService cursoService;

    public AlumnoController(AlumnoService service, CursoService cursoService ) {
        this.service = service;
        this.cursoService = cursoService;

    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("alumnos", service.findAll());
        return "AlumnoList";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model){
        model.addAttribute("alumno", service.findOne(id));
        model.addAttribute("cursos", cursoService.findAll());
        return "alumnoEdit";
    }

    @PostMapping
    public String update(@ModelAttribute Alumno alumno){
        boolean result = service.update(alumno);
        return "redirect:/alumnos";
    }

    @GetMapping("/new")
    public String toCreate(Model model){
        model.addAttribute("cursos", cursoService.findAll());
        return "cursoNew";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute Alumno alumno){
        boolean result = service.create(alumno);
        return "redirect:/alumnos";
    }
    @GetMapping("/{id}/del")
    public String delete(@PathVariable("id") int id){
        boolean result = service.delete(id);

        return "redirect:/alumnos";
    }
}
