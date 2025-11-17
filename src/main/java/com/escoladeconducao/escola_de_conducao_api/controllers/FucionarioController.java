package com.escoladeconducao.escola_de_conducao_api.controllers;


import java.util.List;


import org.springframework.web.bind.annotation.RestController;

import com.escoladeconducao.escola_de_conducao_api.admin.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class FucionarioController {

    @GetMapping("/api/v1/funcionarios")
    public List<Funcionario> getAllFuncionarios(){
        return List.of(
            new Funcionario(1, "João Silva", "admin", "","1234"));
    }
    
}
