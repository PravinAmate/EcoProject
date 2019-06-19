package com.example.pravina.ecoproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity  {

    Toolbar toolbar;
    // this is data fro recycler view
    ItemData itemsData[] = { new ItemData("Help",R.drawable.almond),
            new ItemData("Delete",R.drawable.apple),
            new ItemData("Cloud",R.drawable.apricot),
            new ItemData("Favorite",R.drawable.avocado),
            new ItemData("Like",R.drawable.banana),
            new ItemData("Rating",R.drawable.blackberry)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        // 2. set layoutManger
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listProductSerach);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        SearchProductInfoAdapter mAdapter = new SearchProductInfoAdapter(itemsData);
        // 4. set adapter
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
