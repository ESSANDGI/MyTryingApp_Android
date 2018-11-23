package com.example.junior.mytryingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private RadioButton rb1, rb2, rb3, rb4;
    private TextView tv1;

    private Double value1, value2;

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

        rb1 = (RadioButton)findViewById(R.id.rbtn1);
        rb2 = (RadioButton)findViewById(R.id.rbtn2);
        rb3 = (RadioButton)findViewById(R.id.rbtn3);
        rb4 = (RadioButton)findViewById(R.id.rbtn4);

        tv1 = (TextView)findViewById(R.id.txt_result);
    }

//  creiamo metodi per le 4 operazioni principali

    public void calculate(View view){
        if (!et1.getText().toString().isEmpty() && !et2.getText().toString().isEmpty()){
            if(rb1.isChecked())
                sum();
            else if (rb2.isChecked())
                sub();
            else if (rb3.isChecked())
                div();
            else if (rb4.isChecked())
                mul();
        }else
            Toast.makeText(this, "caselle vuote", Toast.LENGTH_SHORT).show();
    }

    private void setValues() {
            value1 = Double.parseDouble(et1.getText().toString());
            value2 = Double.parseDouble(et2.getText().toString());
    }
    private void sum(){
        setValues();
        tv1.setText(String.format("%.2f",(value1+value2)));
        Toast.makeText(this, "Hai sommato", Toast.LENGTH_SHORT).show();
    }

    private void sub(){
        setValues();
        tv1.setText(String.format("%.2f",(value1-value2)));
        Toast.makeText(this, "Hai sottratto", Toast.LENGTH_SHORT).show();

    }

    private void mul(){
        setValues();
        tv1.setText(String.format("%.2f",(value1*value2)));
        Toast.makeText(this, "Hai moltiplicato", Toast.LENGTH_SHORT).show();

    }

    private void div(){
        setValues();
        tv1.setText(String.format("%.2f",(value1/value2)));
        Toast.makeText(this, "Hai diviso", Toast.LENGTH_SHORT).show();

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
