package com.example.Aula09.View;
import java.util.List;

import com.example.Aula09.Controller.DepartamentoController;
import com.example.Aula09.Model.Departamento;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/departamento")

public class DepartamentoView{

    DepartamentoController departamentoController = new DepartamentoController();

    @GetMapping
    public List<Departamento> getAll() {
        return departamentoController.getAll();
    }

    @GetMapping("/{id}")
    public Departamento getById(@PathVariable long id) {
        return departamentoController.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody Departamento departamento) {
        return departamentoController.insert(departamento);
    }

    @PutMapping("/{id}")
    public Departamento update(@RequestBody Departamento departamento, @PathVariable long id) {
        return departamentoController.update(id, departamento);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable long id){
        return departamentoController.delete(id);
    }

}
