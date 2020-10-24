package com.example.mygames2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView gameList;
    private GameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new GameAdapter(getApplicationContext());
        gameList = (ListView)findViewById(R.id.list);
        gameList.setAdapter(adapter);

        Game g1 = new Game(getResources().getDrawable(R.drawable.line), R.string.title01, R.string.ex01, R.string.toast1);
        Game g2 = new Game(getResources().getDrawable(R.drawable.ball), R.string.title02, R.string.ex02, R.string.toast2);
        adapter.add(g1);
        adapter.add(g2);
    }
}
