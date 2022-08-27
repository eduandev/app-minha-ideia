package edu.and.appminhaideia.datamodel;

public class ProdutoDataModel {

    public static final String TABELA = "produto";

    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String FORNECEDOR = "fornecedor";

    public static String queryCriarTb = "";

    public static String criarTb() {
        queryCriarTb += "CREATE TABLE "+TABELA+" (";
        queryCriarTb += ID+" integer primary key autoincrement, ";
        queryCriarTb += NOME+" text, ";
        queryCriarTb += FORNECEDOR+" text ";
        queryCriarTb += ")";

        return queryCriarTb;
    }
}
