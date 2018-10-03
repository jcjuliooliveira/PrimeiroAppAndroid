package com.example.geisianefranca.smartlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Visualizar_Categorias extends AppCompatActivity {

    List<String> alimentos;
    ArrayAdapter<String> adaptador;
    ListView lvAlimentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar__categorias);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(view -> finish());

        
//        lvAlimentos = (ListView) findViewById(R.id.alimentos);
//
//        alimentos = new ArrayList<String>();
//
//        alimentos.add("Arroz");
//        alimentos.add("Feijão");
//        alimentos.add("Açucar");
//        alimentos.add("Sal");
//
//        adaptador = new ArrayAdapter<String>(Visualizar_Categorias.this, android.R.layout.simple_list_item_1, alimentos);
//        lvAlimentos.setAdapter(adaptador);

    }

}
