package com.leaoartes.cardviewredessociais.main.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.leaoartes.cardviewredessociais.R;
import com.leaoartes.cardviewredessociais.main.adapter.AdapterSocialMedia;

public class MainActivity extends AppCompatActivity {

    //Variavel RecyclerView
    private RecyclerView recyclerTimeLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerTimeLine = findViewById(R.id.recyclerViewTimeLine);

        //Definir layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerTimeLine.setLayoutManager(layoutManager);

        //Definir Adapter
        AdapterSocialMedia adapterNew = new AdapterSocialMedia();
        recyclerTimeLine.setAdapter(adapterNew);

    }
}
