package com.oscarsilva.basesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registrar extends AppCompatActivity {
EditText us, pas, nom, ap, iden;
Button reg, can;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        us=(EditText) findViewById(R.id.RegUser);
        pas = (EditText)findViewById(R.id.RegPass);
        nom = (EditText)findViewById(R.id.RegNombre);
        ap = (EditText)findViewById(R.id.RegApellido);
        iden = (EditText)findViewById(R.id.RegIdentificacion);
        reg = (Button) findViewById(R.id.btnRegRegistrar);
        can =(Button) findViewById(R.id.btnRegCancelar);
    }
}