package edu.and.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import edu.and.appminhaideia.R;
import edu.and.appminhaideia.core.AppUtil;

public class SplashActivity extends AppCompatActivity {

    int tempoDeEspera = 1000 * 5;
    TextView txtAppVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(AppUtil.TAG_LOG, "onCreate: Tela Splash carregada...");

        txtAppVersion = findViewById(R.id.txtAppVersion);
        txtAppVersion.setText(AppUtil.versaoDoAplicativo());

        trocarTela();

    }

    // CamelCase
    private void trocarTela() {

        Log.d(AppUtil.TAG_LOG, "trocarTela: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(AppUtil.TAG_LOG, "trocarTela: Esperando um tempo...");

                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);

               /*Bundle bundle = new Bundle();
                bundle.putString("nome",nome);
                bundle.putString("email",email);*/

                startActivity(trocarDeTela);
                finish();

            }
        },tempoDeEspera);

    }

}