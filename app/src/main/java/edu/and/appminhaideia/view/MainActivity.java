package edu.and.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import edu.and.appminhaideia.R;
import edu.and.appminhaideia.controller.ClientController;
import edu.and.appminhaideia.core.AppUtil;
import edu.and.appminhaideia.model.Cliente;


public class MainActivity extends AppCompatActivity {

    TextView txtNome;
    Cliente cliente = new Cliente("Eduardo André", "edu@gmail.com","993452678",36,true);
    ClientController clientController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG,"ClienteController: App minha ideia");

        clientController = new ClientController(getApplicationContext());

        txtNome = findViewById(R.id.txtNomeApp);
       txtNome.setText("Bem Vindo... " + cliente.getNome());

    }
}