package com.example.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity {
    public EditText pantalla;
    public double num1;
    public double num2;
    public double resultado;
    int operacion;
    public boolean rad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        pantalla=(EditText)findViewById(R.id.Caja); // Recoge y guarda el valor de la caja
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (CompoundButton buttonView,boolean isChecked){
                if (isChecked) {
                    //Rad
                    Toast.makeText(getApplicationContext(), "Radianes", Toast.LENGTH_LONG).show();
                    rad = true;
                } else {
                    // Grados
                    Toast.makeText(getApplicationContext(), "Grados", Toast.LENGTH_LONG).show();
                    rad = false;
                }
            }
        });
    }


    // Métodos para coger los números al clickar y mostrarlos en pantalla
    public void Pi(View v){
        String cap=pantalla.getText().toString();
        cap = cap + "π";
        pantalla.setText("π");
    }
    public void Uno (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "1";
        pantalla.setText(cap);
    }

    public void Dos (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "2";
        pantalla.setText(cap);
    }

    public void Tres (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "3";
        pantalla.setText(cap);
    }

    public void Cuatro (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "4";
        pantalla.setText(cap);
    }

    public void Cinco (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "5";
        pantalla.setText(cap);
    }

    public void Seis (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "6";
        pantalla.setText(cap);
    }

    public void Siete (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "7";
        pantalla.setText(cap);
    }

    public void Ocho (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "8";
        pantalla.setText(cap);
    }

    public void Nueve (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "9";
        pantalla.setText(cap);
    }

    public void Cero (View v){
        String cap=pantalla.getText().toString();
        cap = cap + "0";
        pantalla.setText(cap);
    }

    public void Punto (View v){
        String cap=pantalla.getText().toString();
        cap = cap + ".";
        pantalla.setText(cap);
    }

    // Método suma (operación 1)
    public void Suma (View v){
        try{
            String aux1 = pantalla.getText().toString();
            if(aux1.matches("π")){
                num1 = Math.PI;
            }
            else {
                num1 = Double.parseDouble(aux1);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText(" "+ num1); // Limpiamos la pantalla para introducir el otro número
        operacion = 1;
    }

    // Método resta (operación 2)
    public void Resta (View v){
        try{
            String aux1 = pantalla.getText().toString();
            if(aux1.matches("π")){
                num1 = Math.PI;
            }
            else {
                num1 = Double.parseDouble(aux1);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText("");
        operacion = 2;
    }

    // Método multiplicación (operación 3)
    public void Multiplicacion (View v){
        try{
            String aux1 = pantalla.getText().toString();
            if(aux1.matches("π")){
                num1 = Math.PI;
            }
            else {
                num1 = Double.parseDouble(aux1);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText("");
        operacion = 3;
    }

    // Método division (operación 1)
    public void Division (View v){
        try{
            String aux1 = pantalla.getText().toString();
            if(aux1.matches("π")){
                num1 = Math.PI;
            }
            else {
                num1 = Double.parseDouble(aux1);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText("");
        operacion = 4;
    }

    // Método seno (operación 5)
    public void Seno (View v){
        try{
            String aux1 = pantalla.getText().toString();
            if(aux1.matches("π")){
                num1 = Math.PI;
            }
            else {
                num1 = Double.parseDouble(aux1);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText("Sin(");
        operacion = 5;
    }

    // Método coseno (operación 6)
    public void Coseno (View v){
        try{
            String aux1 = pantalla.getText().toString();
            if(aux1.matches("π")){
                num1 = Math.PI;
            }
            else {
                num1 = Double.parseDouble(aux1);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText("Cos(");
        operacion = 6;
    }

    // Método tangente (operación 7)
    public void Tangente (View v){
        try{
            String aux1 = pantalla.getText().toString();
            if(aux1.matches("π")){
                num1 = Math.PI;
            }
            else {
                num1 = Double.parseDouble(aux1);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText("Tan(");
        operacion = 7;
    }

    // Metodo igual
    public void Igual (View v){
        try{ // Obviar el num2 algunas veces solo usamos uno
            String aux2 = pantalla.getText().toString();
            if(aux2.matches("π")){
                num2 = Math.PI;
            }
            else {
                num2 = Double.parseDouble(aux2);
            }
        }
        catch (NumberFormatException nfe) {}
        pantalla.setText(""); // Limpiamos la pantalla

        // Realizamos las operaciones
        if (operacion == 1){
            resultado = num1 + num2;
        }
        else if (operacion == 2){
            resultado = num1 - num2;
        }
        else if (operacion == 3){
            resultado = num1 * num2;
        }
        else if (operacion == 4){
            if (num2 == 0){
                pantalla.setText("Error");
            }
            else{
                resultado = num1 / num2;
            }
        }
        else if (operacion == 5){
            if(rad == false) {
                double rad = Math.toRadians(num1);
                resultado = (Math.sin(rad));
            }
            else{
                resultado = (Math.sin(num1));
            }
        }
        else if (operacion == 6){
            if(rad == false) {
                double rad = Math.toRadians(num1);
                resultado = (Math.cos(rad));
            }
            else {
                resultado = (Math.cos(num1));
            }
        }
        else if (operacion == 7){
            if(rad == false){
                double rad=Math.toRadians(num1);
                resultado=(Math.tan(rad));
            }
            else {
                resultado=(Math.tan(num1));
            }

        }
        pantalla.setText(""+resultado);
        num1=resultado;
    }

    // Método limpiar
    public void Clear (View v){
        pantalla.setText("");
        num1=0.0;
        num2=0.0;
        resultado=0.0;
    }

    public void Off (View v){
        finish();
    }
}
