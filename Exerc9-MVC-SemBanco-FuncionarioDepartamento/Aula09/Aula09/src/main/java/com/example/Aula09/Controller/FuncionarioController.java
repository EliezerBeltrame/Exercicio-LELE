package com.example.Aula09.Controller;

import com.example.Aula09.Banco.FuncionarioBd;
import com.example.Aula09.Model.Funcionario;

import java.util.List;

public class FuncionarioController {
    FuncionarioBd Funcrepository = new FuncionarioBd();

    public List<Funcionario> getAll(){
        return Funcrepository.findAll();
    }
    public List<Funcionario> getByCurso(String curso){
        return Funcrepository.finBycurso(curso);
    }
    public List<Funcionario> funcionariosOrdenados(Double salario){
        return Funcrepository.funcionariosOrdenados();
    }
    public  List<Funcionario> getByDepartamento(String nomeDepartamento){
        return  Funcrepository.findByDepartamento(nomeDepartamento);
    }

    public Funcionario getById(long id){
        return  Funcrepository.getById(id);
    }

    public  boolean insert(Funcionario funcionario){
        return Funcrepository.insert(funcionario);
    }
    public Funcionario update(long id,Funcionario funcionario){
        boolean result = Funcrepository.update(id, funcionario);

        if (result){
            return  null;
        }
        return null;
    }
    //deletar
    public  boolean delete(long id){
        return  Funcrepository.delete(id);
    }

}

