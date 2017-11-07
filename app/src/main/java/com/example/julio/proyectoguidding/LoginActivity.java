package com.example.julio.proyectoguidding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_Usuario_Login;
    EditText edt_Password_Login;
    Button btnIngresar;
    Button btnRegistrar;


    void init(){
        edt_Usuario_Login = (EditText)findViewById(R.id.edt_Usuario_Login);
        edt_Password_Login = (EditText)findViewById(R.id.edt_Password_Login);
        btnIngresar = (Button)findViewById(R.id.btnIngresar);
        btnRegistrar = (Button)findViewById(R.id.btnRegistrar);
        btnIngresar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    @Override
    public void onClick(View view) {
        
    }
}
