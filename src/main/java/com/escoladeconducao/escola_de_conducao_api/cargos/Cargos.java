package com.escoladeconducao.escola_de_conducao_api.cargos;

import java.util.List;

public class Cargos {
    private int id;
    private List<String> cargo = List.of("admin","secretario");
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<String> getCargo() {
        return cargo;
    }
    public void setCargo(List<String> cargo) {
        this.cargo = cargo;
    }
}
