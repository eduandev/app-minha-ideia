package edu.and.appminhaideia.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import edu.and.appminhaideia.core.AppUtil;
import edu.and.appminhaideia.datamodel.ClienteDataModel;
import edu.and.appminhaideia.datasource.AppDataBase;
import edu.and.appminhaideia.model.Cliente;

public class ClientController extends AppDataBase implements ICrud<Cliente> {

    public ClientController(Context context) {
        super(context);
        Log.d(AppUtil.TAG,"ClienteController: Conectado");
    }

    ContentValues contentValues;

    @Override
    public boolean incluir(Cliente cliente) {
        contentValues = new ContentValues();
        contentValues.put(ClienteDataModel.NOME, cliente.getNome());
        contentValues.put(ClienteDataModel.EMAIL, cliente.getEmail());
        return insert(ClienteDataModel.TABELA, contentValues);
    }

    @Override
    public boolean alterar(Cliente cliente) {
        contentValues = new ContentValues();
        contentValues.put(ClienteDataModel.ID, cliente.getId());
        contentValues.put(ClienteDataModel.NOME, cliente.getNome());
        contentValues.put(ClienteDataModel.EMAIL, cliente.getEmail());
        return update(ClienteDataModel.TABELA, contentValues);
    }

    @Override
    public List<Cliente> listar() {
        return getAllClientes(ClienteDataModel.TABELA);
    }

    @Override
    public boolean deletar(int id) {
        return deleteById(ClienteDataModel.TABELA,id);
    }
}
