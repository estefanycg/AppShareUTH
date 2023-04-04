package com.example.appshareuth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private LoginFragment loginFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instanciar el Fragment
        loginFragment = new LoginFragment();

        // Agregar el Fragment al layout del Activity
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container2, loginFragment)
                .commit();
    }
}