package com.escoladeconducao.escola_de_conducao_api.services;
import java.util.List;
import org.springframework.stereotype.Service;
import com.escoladeconducao.escola_de_conducao_api.admin.Funcionario;

@Service
public class FuncionarioService {

    public List<Funcionario> funcionarios = List.of(
            new Funcionario(1, "João Silva", "admin", "","1234"),
            new Funcionario(1, "Anabela Silva", "admin", "", "1234"),
            new Funcionario(1, "Mariaa", "admin", "","1234"));
    

    public List<Funcionario> getAllFuncionarios() {
        return funcionarios;
    }

    public Funcionario getFuncionarioById(int id) {
        return funcionarios.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElse(new Funcionario(0, "null", "null", "null","null"));
    }
    
}
