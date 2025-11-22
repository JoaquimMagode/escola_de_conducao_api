package com.escoladeconducao.escola_de_conducao_api.aluno;

import com.escoladeconducao.escola_de_conducao_api.admin.Funcionario;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alunos")

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAluno;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String tipodocumento;
    private String dataNascimento;
    private String genero;
    private String matricula;
    private String senha;
    private String status;
    private String dataCadastro;
    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    @JsonBackReference
    private Funcionario funcionario;
}
