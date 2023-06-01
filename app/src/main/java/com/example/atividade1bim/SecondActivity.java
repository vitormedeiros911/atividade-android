package com.example.atividade1bim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewNome;
    private TextView textViewIdade;
    private TextView textViewEndereco;
    private Button botaoSim;
    private Button botaoNao;

    private final static String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewNome = findViewById(R.id.textViewNome);
        textViewIdade = findViewById(R.id.textViewIdade);
        textViewEndereco = findViewById(R.id.textViewEndereco);
        botaoSim = findViewById(R.id.botaoSim);
        botaoNao = findViewById(R.id.botaoNao);

        Intent intent = getIntent();
        if (intent != null) {
            String nome = intent.getStringExtra("nome");
            String idade = intent.getStringExtra("idade");
            String endereco = intent.getStringExtra("endereco");

            textViewNome.setText("Nome: " + nome);
            textViewIdade.setText("Idade: " + idade);
            textViewEndereco.setText("Endereço: " + endereco);
        }

        botaoSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewNome.setText("");
                textViewIdade.setText("");
                textViewEndereco.setText("");

                Toast.makeText(SecondActivity.this,  "Cadastro salvo com sucesso", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoNao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Log.e(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "onDestroy");
    }

}