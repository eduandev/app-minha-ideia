package edu.and.appminhaideia.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import edu.and.appminhaideia.datamodel.ProdutoDataModel;
import edu.and.appminhaideia.datasource.AppDataBase;
import edu.and.appminhaideia.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    public ProdutoController(Context context) {
        super(context);
    }

    ContentValues contentValues;

    @Override
    public boolean incluir(Produto produto) {
        contentValues = new ContentValues();
        contentValues.put(ProdutoDataModel.NOME, produto.getNome());
        contentValues.put(ProdutoDataModel.FORNECEDOR, produto.getFornecedor());
        return insert(ProdutoDataModel.TABELA, contentValues);
    }

    @Override
    public boolean alterar(Produto produto) {
        contentValues = new ContentValues();
        contentValues.put(ProdutoDataModel.ID, produto.getId());
        contentValues.put(ProdutoDataModel.NOME, produto.getNome());
        contentValues.put(ProdutoDataModel.FORNECEDOR, produto.getFornecedor());
        return update(ProdutoDataModel.TABELA, contentValues);
    }

    @Override
    public List<Produto> listar() {
        List<Produto> list = new ArrayList<>();
        return list;
    }

    @Override
    public boolean deletar(int id) {
        return deleteById(ProdutoDataModel.TABELA,id);
    }
}
