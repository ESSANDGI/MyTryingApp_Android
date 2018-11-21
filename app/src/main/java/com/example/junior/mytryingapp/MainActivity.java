package com.example.junior.mytryingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    questi mtodi overraidati non sono altro che i cicli di vita di un'aaplicazione


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
//      la attività è creata
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
