package com.escoladeconducao.escola_de_conducao_api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.escoladeconducao.escola_de_conducao_api.aluno.Aluno;
import com.escoladeconducao.escola_de_conducao_api.repository.AlunoRepo;

@Service
public class AlunoService {
    
    public final AlunoRepo alunoRepo;

    public AlunoService(AlunoRepo alunoRepo) {
        this.alunoRepo = alunoRepo;
    }

    public List<Aluno> getAlunos(){
        return alunoRepo.findAll();
    }
}
