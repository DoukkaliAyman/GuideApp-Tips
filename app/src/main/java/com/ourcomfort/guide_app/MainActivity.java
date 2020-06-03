package com.ourcomfort.guide_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.ourcomfort.guide_app.adapter.adapter_list;
import com.ourcomfort.guide_app.model.list_item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView toolbar_title;
    private RecyclerView recyclerView ;
    private List<list_item> list_items = new ArrayList<>() ;
    private adapter_list adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbarTop =   findViewById(R.id.toolbar_main);
         toolbar_title = (TextView) toolbarTop.findViewById(R.id.toolbar_title);
         recyclerView = findViewById(R.id.recycler_view);
         recyclerView.setHasFixedSize(true);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setItemAnimator(new DefaultItemAnimator());
      //   recyclerView.setHorizontalScrollBarEnabled(true);

         recyclerView.setAdapter(adapter);
         List_data();


       //

        adapter = new adapter_list(this,list_items);
        recyclerView.setAdapter(adapter);
    }

    private void List_data() {

        list_items.add(new list_item("webScraping " , R.drawable.visual,"this is web Scraping use perfect style by python for get resource by other page","12/04/2020"));
        list_items.add(new list_item("Artificial intelligence " ,R.drawable.i1,"any technique used for get knowledge to machine","14/04/2020"));


    }

}