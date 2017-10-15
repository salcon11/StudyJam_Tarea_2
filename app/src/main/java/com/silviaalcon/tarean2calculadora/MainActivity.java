package com.silviaalcon.tarean2calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText primero;
    private EditText segundo;
    private Button button;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        primero = (EditText) findViewById(R.id.caja1);
        segundo = (EditText) findViewById(R.id.caja2);
        resultado = (TextView) findViewById(R.id.cajar);
    }

    public void suma (View view){
        String c1 = primero.getText().toString();
        String c2 = segundo.getText().toString();
        if (c1.isEmpty() || c2.isEmpty()){
            Toast.makeText(this, "Campo(s) vacio(s)", Toast.LENGTH_SHORT).show();
        }
        else{
            int a = Integer.parseInt(c1);
            int b = Integer.parseInt(c2);
            int res = a+b;
            resultado.setText(res + " ");
        }
    }

    public void resta (View view){
        String c1 = primero.getText().toString();
        String c2 = segundo.getText().toString();
        if (c1.isEmpty() || c2.isEmpty()){
            Toast.makeText(this, "Campo(s) vacio(s)", Toast.LENGTH_SHORT).show();
        }
        else{
            int a = Integer.parseInt(c1);
            int b = Integer.parseInt(c2);
            int res = a-b;
            resultado.setText(res + " ");
        }
    }

    public void multiplicacion (View view){
        String c1 = primero.getText().toString();
        String c2 = segundo.getText().toString();
        if (c1.isEmpty() || c2.isEmpty()){
            Toast.makeText(this, "Campo(s) vacio(s)", Toast.LENGTH_SHORT).show();
        }
        else{
            int a = Integer.parseInt(c1);
            int b = Integer.parseInt(c2);
            int res = a*b;
            resultado.setText(res + " ");
        }
    }

    public void division (View view){
        String c1 = primero.getText().toString();
        String c2 = segundo.getText().toString();
        if (c1.isEmpty() || c2.isEmpty()){
            Toast.makeText(this, "Campo(s) vacio(s)", Toast.LENGTH_SHORT).show();
        }
        else {
            double a = Double.parseDouble(c1);
            double b = Double.parseDouble(c2);
            if (b==0){
                Toast.makeText(this, "Error: Division entre cero", Toast.LENGTH_SHORT).show();
            }
            else{
                double res = a / b;
                resultado.setText(res + " ");
            }

        }

    }
}

