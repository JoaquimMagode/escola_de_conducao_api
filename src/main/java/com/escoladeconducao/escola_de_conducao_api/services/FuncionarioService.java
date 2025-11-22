package com.escoladeconducao.escola_de_conducao_api.services;
import java.util.List;
import org.springframework.stereotype.Service;
import com.escoladeconducao.escola_de_conducao_api.admin.Funcionario;
import com.escoladeconducao.escola_de_conducao_api.cargos.Cargos;

@Service
public class FuncionarioService {

    

    public List<Funcionario> getAllFuncionarios() {
        return funcionarios;
    }

    public Funcionario getFuncionarioById(int id) {
        return funcionarios.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElse(new Funcionario(0, "null", Cargos.Admin, "null", "null"));
    }
    
}
