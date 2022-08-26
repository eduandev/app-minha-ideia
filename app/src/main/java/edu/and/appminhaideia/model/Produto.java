package edu.and.appminhaideia.model;

import android.util.Log;

import edu.and.appminhaideia.core.AppUtil;

public class Produto {

    private String nome;
    private String fornecedor;

    public Produto() {}

    public Produto(String nome, String fornecedor) {
        this.nome = nome;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
