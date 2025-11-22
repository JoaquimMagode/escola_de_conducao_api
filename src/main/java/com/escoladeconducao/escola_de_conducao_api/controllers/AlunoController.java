package com.escoladeconducao.escola_de_conducao_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.escoladeconducao.escola_de_conducao_api.aluno.Aluno;
import com.escoladeconducao.escola_de_conducao_api.services.AlunoService;

@RestController
public class AlunoController {
    @Autowired
    public final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
    
    @GetMapping("/api/v1/alunos")
    public List<Aluno> getAlunos(){
        return alunoService.getAlunos();
    }

    @PostMapping("/api/v1/alunos")
    public void addAlunos(@RequestBody Aluno aluno){
        alunoService.addAlunos(aluno);
    }
}
