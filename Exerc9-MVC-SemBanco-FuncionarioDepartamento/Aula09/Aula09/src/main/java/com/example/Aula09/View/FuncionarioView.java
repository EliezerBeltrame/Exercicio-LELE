package com.example.Aula09.View;


import com.example.Aula09.Controller.FuncionarioController;
import com.example.Aula09.Model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RequestMapping
    @RestController("/funcionario")

public class FuncionarioView {


    FuncionarioController FuncController = new FuncionarioController();

        @GetMapping
        public List<Funcionario> getAll(
            @RequestParam(required = false) String curso,
            @RequestParam(required = false) String nomeDepartamento,
            @RequestParam(required = false) Double  funcionariosOrdenados
        ){
            if(curso !=null){
                return FuncController.getByCurso(curso);
            }else if(nomeDepartamento !=null){
                return FuncController.getByDepartamento(nomeDepartamento);
            }else if (funcionariosOrdenados !=null){
                 return  FuncController.funcionariosOrdenados(funcionariosOrdenados);
            }else{
                return FuncController.getAll();
            }

        }
        @GetMapping("/{id}")
        public Funcionario getById(@PathVariable long id) {
            return FuncController.getById(id);
        }

        @PostMapping
        public boolean insert(@RequestBody Funcionario funcionario) {
            return FuncController.insert(funcionario);
        }

        @PutMapping("/{id}")
        public Funcionario update(@RequestBody Funcionario funcionario, @PathVariable long id) {
            return FuncController.update(id, funcionario);
        }
        @DeleteMapping("/{id}")
        public boolean delete(@PathVariable long id){
            return FuncController.delete(id);
        }
    }

