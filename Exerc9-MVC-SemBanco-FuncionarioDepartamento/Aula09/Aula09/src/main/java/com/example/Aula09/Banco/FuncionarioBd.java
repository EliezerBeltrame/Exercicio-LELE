package com.example.Aula09.Banco;

import com.example.Aula09.Model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioBd {

    public List<Funcionario> funcionarios;

    public FuncionarioBd() {
        this.funcionarios = new ArrayList<>();
    }

    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios);
    }
    public List<Funcionario> finBycurso(String curso){
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getCurso().equals(curso))
                .toList();
    }
    public  List<Funcionario> findByDepartamento(String nomeDepartamento){
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getDepartamento().getNome()
                        .equals(nomeDepartamento))
                .toList();

    }
    public List<Funcionario> funcionariosOrdenados(){
        return funcionarios.stream()
                .sorted((func1, func2) -> Double.compare(func2.getSalario(), func1.getSalario()))
                .toList();
    }

    public Funcionario getById(Long id) {
        return funcionarios.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean insert(Funcionario funcionario) {
        funcionarios.add(funcionario);
        return true;
    }

    public boolean update(long id, Funcionario funcionario) {
        Funcionario FuncionarioBd = funcionarios.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);

        if (FuncionarioBd == null) {
            return false;
        }
        FuncionarioBd.setNome(funcionario.getNome());

        return true;

    }

    public boolean delete(long id) {
        Funcionario FuncionarioBd = funcionarios.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);
        if (FuncionarioBd == null) {
            return false;
        }
        funcionarios.remove(FuncionarioBd);
        return true;
    }


}