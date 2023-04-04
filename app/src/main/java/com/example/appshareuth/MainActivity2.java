package com.example.appshareuth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    private ChatGrupo ChatGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Instanciar el Fragment
        ChatGrupo = new ChatGrupo();

        // Agregar el Fragment al layout del Activity
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container2, ChatGrupo)
                .commit();
    }
}