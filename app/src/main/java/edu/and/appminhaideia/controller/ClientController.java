package edu.and.appminhaideia.controller;

import android.content.Context;
import android.util.Log;

import edu.and.appminhaideia.core.AppUtil;
import edu.and.appminhaideia.datasource.AppDataBase;

public class ClientController extends AppDataBase {

    public ClientController(Context context) {
        super(context);
        Log.d(AppUtil.TAG,"ClienteController: Conectado");
    }
}
