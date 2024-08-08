package cl.praxis.EscuelaRural_JPA.controller;


import cl.praxis.EscuelaRural_JPA.model.entities.Curso;
import cl.praxis.EscuelaRural_JPA.model.service.AlumnoService;
import cl.praxis.EscuelaRural_JPA.model.service.CursoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service ) {
        this.service = service;

    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("cursos", service.findAll());
        return "CursoList";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model){
        model.addAttribute("curso", service.findOne(id));

        return "cursoEdit";
    }

    @PostMapping
    public String update(@ModelAttribute Curso curso){
        boolean result = service.update(curso);
        return "redirect:/cursos";
    }



    @PostMapping("/new")
    public String create(@ModelAttribute Curso curso){
        boolean result = service.create(curso);

        return "redirect:/cursos";
    }
    @GetMapping("/{id}/del")
    public String delete(@PathVariable("id") int id){
        boolean result = service.delete(id);

        return "redirect:/cursos";
    }

}
