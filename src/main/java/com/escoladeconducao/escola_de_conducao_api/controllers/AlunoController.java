package com.escoladeconducao.escola_de_conducao_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escoladeconducao.escola_de_conducao_api.services.AlunoService;

@RestController
public class AlunoController {
    @Autowired
    public final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
    
    @GetMapping("/api/v1/alunos")
    public String getAlunos(){
        return alunoService.getAlunos();
    }
}
