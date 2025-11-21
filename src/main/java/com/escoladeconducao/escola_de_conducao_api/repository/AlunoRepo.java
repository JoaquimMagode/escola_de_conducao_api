package com.escoladeconducao.escola_de_conducao_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escoladeconducao.escola_de_conducao_api.aluno.Aluno;


public interface AlunoRepo extends org.springframework.data.jpa.repository.JpaRepository<Aluno, Integer> {
    
}
