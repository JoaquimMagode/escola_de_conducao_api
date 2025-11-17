package com.escoladeconducao.escola_de_conducao_api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.escoladeconducao.escola_de_conducao_api.admin.Funcionario;

import org.springframework.web.bind.annotation.GetMapping;

import com.escoladeconducao.escola_de_conducao_api.services.FuncionarioService;



@RestController
public class FucionarioController {

    @Autowired
    public FuncionarioService funcionarioService;



    @GetMapping("/api/v1/funcionarios")
    public List<Funcionario> getAllFuncionarios(){
        return funcionarioService.getAllFuncionarios();
    }
    
}
