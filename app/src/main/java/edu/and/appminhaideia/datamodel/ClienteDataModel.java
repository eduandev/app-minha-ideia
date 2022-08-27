package edu.and.appminhaideia.datamodel;

public class ClienteDataModel {

    public static final String TABELA = "cliente";

    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";

    public static String queryCriarTb = "";

    public static String criarTb() {
        queryCriarTb += "CREATE TABLE "+TABELA+" (";
        queryCriarTb += ID+" integer primary key autoincrement, ";
        queryCriarTb += NOME+" text, ";
        queryCriarTb += EMAIL+" text ";
        queryCriarTb += ")";

        return queryCriarTb;
    }

}
