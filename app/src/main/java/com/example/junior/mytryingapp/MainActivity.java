package com.example.junior.mytryingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
//    questi mtodi overraidati non sono altro che i cicli di vita di un'aaplicazione
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState );
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
//      la attività è creata

//      La classe R è una classe che mi permette di collegare xml con java
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_result);
    }

//  creiamo metodi per le 4 operazioni principali
    public void sum(View view){
        int val1 = Integer.parseInt(et1.getText().toString());
        int val2 = Integer.parseInt(et2.getText().toString());

        tv1.setText(String.valueOf(val1 + val2));
        Toast.makeText(this, "Hai sommato", Toast.LENGTH_LONG).show();
    }

    public void sub(View view){
        int val1 = Integer.parseInt(et1.getText().toString());
        int val2 = Integer.parseInt(et2.getText().toString());

        tv1.setText(String.valueOf(val1 - val2));
        Toast.makeText(this, "Hai sottratto", Toast.LENGTH_LONG).show();

    }

    public void mul(View view){
        int val1 = Integer.parseInt(et1.getText().toString());
        int val2 = Integer.parseInt(et2.getText().toString());

        tv1.setText(String.valueOf(val1 * val2));
        Toast.makeText(this, "Hai moltiplicato", Toast.LENGTH_LONG).show();

    }

    public void div(View view){
        double val1 = Double.parseDouble(et1.getText().toString());
        double val2 = Double.parseDouble(et2.getText().toString());

        tv1.setText(String.format("%.6f",(val1 / val2)));
        Toast.makeText(this, "Hai diviso", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
//      l'attività stà per rendersi visibile
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
//      l'attività è visibile
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
//      concentrarsi su altra attività
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
//      l'attività non è più visibile
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
//      l'attività è a punto di essere distrutta
    }
}
