package com.example.pocketwriter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FeedViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FeedViewAdapter adapter;
    ArrayList<String> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_view);

        recyclerView = findViewById(R.id.recyclerView);
        articleList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            articleList.add("Article Title " + i);
        }

        adapter = new FeedViewAdapter(articleList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
