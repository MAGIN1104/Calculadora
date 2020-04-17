package com.example.class_2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    double op1,op2;
    TextView pantalla;
    Toast msj;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = (TextView) findViewById(R.id.textView);
    }
    //Numeros
    public void uno(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"1");
        }else{
            pantalla.setText("");
            pantalla.setText("1");
        }
    }
    public void dos(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"2");
        }else{
            pantalla.setText("");
            pantalla.setText("2");
        }
    }
    public void tres(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"3");

        }else{
            pantalla.setText("");
            pantalla.setText("3");
        }
    }
    public void cuatro(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"4");

        }else{
            pantalla.setText("");
            pantalla.setText("4");
        }
    }
    public void cinco(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"5");

        }else{
            pantalla.setText("");
            pantalla.setText("5");
        }
    }
    public void seis(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"6");

        }else{
            pantalla.setText("");
            pantalla.setText("6");
        }
    }
    public void siete(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"7");

        }else{
            pantalla.setText("");
            pantalla.setText("7");
        }
    }
    public void ocho(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"8");

        }else{
            pantalla.setText("");
            pantalla.setText("8");
        }
    }
    public void nueve(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"9");

        }else{
            pantalla.setText("");
            pantalla.setText("9");
        }
    }
    public void cero(View view){
        if(pantalla.getText().toString()!="0"){
            pantalla.setText(pantalla.getText()+"0");

        }else{
            pantalla.setText("");
            pantalla.setText("0");
        }
    }
    public void point(View view){
       if(!pantalla.getText().toString().contains(".")){
           pantalla.setText(pantalla.getText()+".");

       }

    }

    //operaciones
    public void  suma (View view){
        op='+';
        op1=Double.parseDouble(pantalla.getText()+"");
        pantalla.setText("0");
    }
    public void  porcentaje (View view){
        double n=100;
        op='%';
        op1=Double.parseDouble(pantalla.getText()+"");
        pantalla.setText((op1/n)+"");
    }
    public void sen(View view){
        try {
            op1 = Double.parseDouble(pantalla.getText() + "");
            double res = Math.sin(op1);
            String message = Double.toString(res);
            pantalla.setText(message);
        } catch (Exception e) {
            Log.d("develop", e.toString());
        }
    }
    public void cos(View view){
        try {
            op1 = Double.parseDouble(pantalla.getText() + "");
            String message = Double.toString(Math.cos(op1));
            pantalla.setText(message);
        } catch (Exception e) {
            Log.d("develop", e.toString());
        }
    }
    public void tan(View view){
        try {
            op1 = Double.parseDouble(pantalla.getText() + "");
            String message = Double.toString(Math.tan(op1));
            pantalla.setText(message);
        } catch (Exception e) {
            Log.d("develop", e.toString());
        }
    }
    public void pot(View view){
        try {
            op1 = Double.parseDouble(pantalla.getText() + "");
            String message = Double.toString(Math.pow(op1, 2));
            pantalla.setText(message);
        } catch (Exception e) {
            Log.d("develop", e.toString());
        }
    }
    public void  raiz (View view){
        op='%';
        try {
            op1 = Double.parseDouble(pantalla.getText() + "");
            String message = Double.toString(Math.sqrt(op1));
            pantalla.setText(message);
        } catch (Exception e) {
            Log.d("develop", e.toString());
        }
    }
    public void  resta (View view){
        op='-';
        op1=Double.parseDouble(pantalla.getText()+"");
        pantalla.setText("");

    }
    public void  mult (View view){
        op='*';
        op1=Double.parseDouble(pantalla.getText()+"");
        pantalla.setText("0");
    }
    public void  div (View view){
        op='/';
        op1=Double.parseDouble(pantalla.getText()+"");
        pantalla.setText("0");
    }
    public void igual(View view){
        op2=Double.parseDouble(pantalla.getText()+"");
        switch (op){
            case'+': pantalla.setText(sumar(op1,op2)+""); break;
            case'-': pantalla.setText(restar(op1,op2)+""); break;
            case'*': pantalla.setText(multiplicar(op1,op2)+""); break;
            case'/': {
                        if(op2!=0){
                            pantalla.setText(dividir(op1,op2)+""); break;
                        }else{
                            Toast.makeText(getApplicationContext(),"LA DIVISION ENTRE 0 ES INFINITO",Toast.LENGTH_SHORT).show();
                            break;
                        }
                     }
        }
    }
    public void borrar(View view){
        pantalla.setText("0");
    }
    public void borrar2(View view){
        if(!pantalla.getText().toString().equals(""))
            pantalla.setText(pantalla.getText().subSequence(0,pantalla.getText().length()-1)+"");
    }
    public double  sumar(double n1,double n2){
        return n1+n2;
    }
    public double restar(double n1, double n2){
        return n1-n2;
    }
    public double  dividir(double n1,double n2){
        return n1/n2;
    }
    public double  multiplicar(double n1,double n2){
        return n1*n2;
    }
}
