package edu.and.appminhaideia.datasource;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import edu.and.appminhaideia.core.AppUtil;
import edu.and.appminhaideia.datamodel.ClienteDataModel;
import edu.and.appminhaideia.datamodel.ProdutoDataModel;
import edu.and.appminhaideia.model.Cliente;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "AppMinhaIdeiaSQLite";
    public static final int DB_VERSION = 1;
    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context,DB_NAME,null,DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de Dados");

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTb());

        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente criada... " + ClienteDataModel.criarTb());

        db.execSQL(ProdutoDataModel.criarTb());

        Log.d(AppUtil.TAG, "onCreate: Tabela produto criada... " + ProdutoDataModel.criarTb());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean insert(String tabela, ContentValues contentValues) {
        boolean returnInsert = true;
        try { returnInsert = db.insert(tabela, null,contentValues) > 0;}
        catch (Exception e) { Log.d(AppUtil.TAG, "insert: " + e.getMessage());}
        return returnInsert;
    }

    public boolean update(String tabela, ContentValues contentValues) {
        boolean returnUpdate = true;
        try { returnUpdate = db.update(tabela,contentValues,"id = ?",new String[] {String.valueOf(contentValues.get("id"))}) > 0;}
        catch (Exception e) { Log.d(AppUtil.TAG, "update: " + e.getMessage());}
        return returnUpdate;
    }

    public List<Cliente> getAllClientes(String tabela) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM " + tabela;
        Cursor cursor;
        cursor = db.rawQuery(sql,null);

        if(cursor.moveToFirst()) {
            do {
                Cliente cliente = new Cliente();
                cliente.setId(cursor.getInt(cursor.getColumnIndexOrThrow(ClienteDataModel.ID)));
                cliente.setNome(cursor.getString(cursor.getColumnIndexOrThrow(ClienteDataModel.NOME)));
                cliente.setEmail(cursor.getString(cursor.getColumnIndexOrThrow(ClienteDataModel.EMAIL)));

                Log.i("C","Nome: " + cliente.getNome());

            } while(cursor.moveToNext());
        }
        return clientes;
    }

    public boolean deleteById(String tabela, int id) {
        boolean returnDelet = true;
        try {returnDelet = db.delete(tabela,"id = ?", new String[] {String.valueOf(id)}) > 0;}
        catch (Exception e) { Log.d(AppUtil.TAG, "delete: " + e.getMessage());}
        return returnDelet;
    }
}
