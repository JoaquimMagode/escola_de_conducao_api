package com.escoladeconducao.escola_de_conducao_api.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escoladeconducao.escola_de_conducao_api.admin.Funcionario;
import com.escoladeconducao.escola_de_conducao_api.cargos.Cargos;
import com.escoladeconducao.escola_de_conducao_api.repository.FuncionarioRepo;

@Service
public class FuncionarioService {

    @Autowired
    public final FuncionarioRepo funcionarioRepo;
    
    //Constructor
    public FuncionarioService(FuncionarioRepo funcionarioRepo) {
        this.funcionarioRepo = funcionarioRepo;
    }

    //Get all funcionarios
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepo.findAll();
    }

    //Get funcionario by ID
    public Funcionario getFuncionarioById(int id) {
        return funcionarioRepo.findById(id).orElse(null);
    }

    //Add funcionario
    public void addFuncionarios(Funcionario funcionario) {
        funcionarioRepo.save(funcionario);
    }
    
}
