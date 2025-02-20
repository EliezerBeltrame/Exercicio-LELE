package com.example.Aula09.Controller;

import com.example.Aula09.Banco.DepartamentoBd;
import com.example.Aula09.Model.Departamento;
import java.util.List;

public class DepartamentoController {
    DepartamentoBd repository = new DepartamentoBd();

    public List<Departamento> getAll(){
        return repository.findAll();
    }

    public  Departamento getById(long id){
        return  repository.getById(id);
    }

    public  boolean insert(Departamento departamento){
        return repository.insert(departamento);
    }
    public Departamento update(long id, Departamento departamento){
        boolean result = repository.update(id, departamento);

        if(result){
            return  departamento;
        }
        return null;
    }
    public  boolean delete(long id){
        return  repository.delete(id);
    }
}


