package edu.and.appminhaideia.controller;

import java.util.List;

public interface ICrud<T>{

    public boolean incluir(T obj);

    public boolean alterar(T obj);

    public List<T> listar();

    public boolean deletar(int id);

}
