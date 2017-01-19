package com.example.suman.volleydemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.suman.volleydemo.Adapter.CustomAdapter;
import com.example.suman.volleydemo.Pojo.DataModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bapi on 4/1/17.
 */

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<DataModel> list = new ArrayList<>();
    CustomAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_main);
        prepareMovieData();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        adapter = new CustomAdapter(this, list);
        mRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void prepareMovieData() {
        DataModel movie = new DataModel("Mad Max: Fury Road", "Action & Adventure");
        list.add(movie);

        movie = new DataModel("Inside Out", "Animation, Kids & Family");
        list.add(movie);

        movie = new DataModel("Star Wars: Episode VII - The Force Awakens", "Action");
        list.add(movie);
        movie = new DataModel("Shaun the Sheep", "Animation");
        list.add(movie);
        movie = new DataModel("The Martian", "Science Fiction & Fantasy");
        list.add(movie);
        movie = new DataModel("Mission: Impossible Rogue Nation", "Action");
        list.add(movie);
        movie = new DataModel("Up", "Animation");
        list.add(movie);

        movie = new DataModel("Star Trek", "Science Fiction");
        list.add(movie);

        movie = new DataModel("The LEGO Movie", "Animation");
        list.add(movie);

        movie = new DataModel("Iron Man", "Action & Adventure");
        list.add(movie);

        movie = new DataModel("Aliens", "Science Fiction");
        list.add(movie);

        movie = new DataModel("Chicken Run", "Animation");
        list.add(movie);

        movie = new DataModel("Back to the Future", "Science Fiction");
        list.add(movie);

        movie = new DataModel("Raiders of the Lost Ark", "Action & Adventure");
        list.add(movie);

        movie = new DataModel("Goldfinger", "Action & Adventure");
        list.add(movie);

        movie = new DataModel("Guardians of the Galaxy", "Science Fiction & Fantasy");
        list.add(movie);


    }
}
