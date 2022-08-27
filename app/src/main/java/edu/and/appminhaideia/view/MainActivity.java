package edu.and.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import edu.and.appminhaideia.R;
import edu.and.appminhaideia.controller.ClientController;
import edu.and.appminhaideia.core.AppUtil;
import edu.and.appminhaideia.datamodel.ClienteDataModel;
import edu.and.appminhaideia.datasource.AppDataBase;
import edu.and.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    TextView txtNome;
    //Cliente cliente = new Cliente();
    ClientController clientController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");


        clientController = new ClientController(getApplicationContext());

        /*for (int i = 0; i <= 50; i++) {
            cliente.setNome("Eduardo And"+i);
            cliente.setEmail(i+"_mar@gmail.com");
            clientController.incluir(cliente);
        }*/

      /* if (clientController.incluir(cliente)) {
            Toast.makeText(MainActivity.this,"Cliente"+cliente.getNome()+"Incluido com sucesso",
                    Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this,"Cliente"+cliente.getNome()+"Não incluido com sucesso",
                    Toast.LENGTH_SHORT).show();
        }*/

        /*if (clientController.deletar(cliente.getId())) {
            Toast.makeText(MainActivity.this,"Cliente"+cliente.getNome()+"Excluido com sucesso",
                    Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this,"Cliente"+cliente.getNome()+"Não excluido com sucesso",
                    Toast.LENGTH_SHORT).show();
        }*/

        /*if (clientController.alterar(cliente)) {
            Toast.makeText(MainActivity.this,"Cliente"+cliente.getNome()+"Alterado com sucesso",
                    Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this, "Cliente" + cliente.getNome() + "Não alterado com sucesso",
                    Toast.LENGTH_SHORT).show();
        }*/

        for (Cliente cliente: clientController.listar()) {
            Log.i("Lista","Cliente: " + cliente.getId() + "-" + cliente.getNome() + "-" + cliente.getEmail());
        }
            txtNome = findViewById(R.id.txtNomeApp);
            txtNome.setText("Bem Vindo... " );


    }
}