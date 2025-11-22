package com.escoladeconducao.escola_de_conducao_api.admin;

import java.util.List;

import com.escoladeconducao.escola_de_conducao_api.aluno.Aluno;
import com.escoladeconducao.escola_de_conducao_api.cargos.Cargos;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Cargos cargo;
    private String email;
    private String senha;

    @OneToMany(mappedBy = "funcionario")
    @JsonManagedReference
    private List<Aluno> alunos;
    
}
