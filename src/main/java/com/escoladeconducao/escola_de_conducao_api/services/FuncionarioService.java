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

    public FuncionarioService(FuncionarioRepo funcionarioRepo) {
        this.funcionarioRepo = funcionarioRepo;
    }

    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepo.findAll();
    }

    public Funcionario getFuncionarioById(int id) {
        return funcionarioRepo.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElse(new Funcionario(0, "null", Cargos.Admin, "null", "null"));
    }
    
}
