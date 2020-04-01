package com.leaoartes.cardviewredessociais.main.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.leaoartes.cardviewredessociais.R;
import com.leaoartes.cardviewredessociais.main.adapter.AdapterSocialMedia;
import com.leaoartes.cardviewredessociais.main.model.PostListClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Variavel RecyclerView
    private RecyclerView recyclerTimeLine;
    private List<PostListClass> postListName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerTimeLine = findViewById(R.id.recyclerViewTimeLine);

        //Definir layout (Pode-se usar duas opções)

        //Opção 1 - Vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerTimeLine.setLayoutManager(layoutManager);

        //Opção 2 - Horizontal
        /* LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        recyclerTimeLine.setLayoutManager(layoutManager);*/


        //Definir Adapter
        this.addValuePost();
        AdapterSocialMedia adapterNew = new AdapterSocialMedia(postListName);
        recyclerTimeLine.setAdapter(adapterNew);

    }

    //Adicionar valores para a lista
    public void addValuePost(){

        PostListClass postListValue = new PostListClass("Estudando / Programando", "Acordei bem cedo para estudar e programar, afinal todo esforço será recompensado! #boralutar", R.drawable.programando);
        this.postListName.add(postListValue);

        postListValue = new PostListClass("Curtindo com a Família", "Momento de lazer com a família, é o mais importante na nossa vida e eu amo minhas duas. #amoelas", R.drawable.familia);
        this.postListName.add(postListValue);

        postListValue = new PostListClass("Hora de abastecer, ALMOÇO", "Hora da comilança, degustando uma bela Parmegiana #melhorprato", R.drawable.parmegiana);
        this.postListName.add(postListValue);

        postListValue = new PostListClass("Canadá / Sonho", "Grande sonho de consumo da minha vida, com  muito esforço e dedicação chegarei lá junto com minha esposa e filha #semdescanso", R.drawable.canada);
        this.postListName.add(postListValue);

        postListValue = new PostListClass("Momento de relaxar com Game", "Depois de um dia cheio, nada melhor do que finalizar com uma jogatina #jogatina", R.drawable.games);
        this.postListName.add(postListValue);

    }
}
