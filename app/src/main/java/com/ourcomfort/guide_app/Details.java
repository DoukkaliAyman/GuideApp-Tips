package com.ourcomfort.guide_app;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class Details extends AppCompatActivity {
    TextView title,descr,date;
    ImageView img;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
        getSupportActionBar().setTitle("");

        extras = getIntent().getExtras();
        title = findViewById(R.id.title_item);
        img = findViewById(R.id.img_item);
        descr = findViewById(R.id.desc_item);
        date = findViewById(R.id.date_item);

        if(extras != null){
            title.setText(extras.getString("title"));
            descr.setText(extras.getString("descr"));
            img.setImageResource(extras.getInt("image"));
            date.setText(extras.getString("date"));
        }

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
