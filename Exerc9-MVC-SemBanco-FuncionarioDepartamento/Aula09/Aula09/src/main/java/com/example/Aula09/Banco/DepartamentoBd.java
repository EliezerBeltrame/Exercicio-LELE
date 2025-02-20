package com.example.Aula09.Banco;

import com.example.Aula09.Model.Departamento;
import com.example.Aula09.Model.Funcionario;

import java.util.ArrayList;
import java.util.List;


public class DepartamentoBd{

    public List<Departamento> departamentos;

    public  DepartamentoBd(){
        this.departamentos = new ArrayList<>();
    }

    //buscar todos
    public List<Departamento> findAll(){
        return new ArrayList<>(departamentos);
    }

    //busacar com base no ID
    public  Departamento getById(Long id){
        return  departamentos.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);
    }
    // inserir departamentos
    public  boolean insert(Departamento departamento){
        departamentos.add(departamento);
        return true;
    }
    // atualizar e departamento

    public boolean update(long id,  Departamento departamento){
        Departamento DepartamentoBd = departamentos.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);

        if(DepartamentoBd == null){
            return false;
        }
        DepartamentoBd.setNome(departamento.getNome());

        return  true;


    }
    public boolean delete(long id) {
        Departamento DepartamentoBd = departamentos.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);
        if (DepartamentoBd == null) {
            return false;
        }
        departamentos.remove(DepartamentoBd);
        return true;
    }

}

