package com.example.listandgrid_adzibilal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewList;
    private RecyclerView recyclerViewGrid;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewList = findViewById(R.id.recyclerViewList);
        recyclerViewGrid = findViewById(R.id.recyclerViewGrid);

        // Setup RecyclerView untuk list
        recyclerViewList.setHasFixedSize(true);
        recyclerViewList.setLayoutManager(new LinearLayoutManager(this));

        // Setup RecyclerView untuk grid
        recyclerViewGrid.setHasFixedSize(true);
        recyclerViewGrid.setLayoutManager(new GridLayoutManager(this, 2));

        listItems = new ArrayList<>();

        // Tambahkan item ke list dengan URL gambar
        listItems.add(new ListItem("Monkey D. Luffy", "Captain", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZd-G5KVUhsv48oXP73_bG3AZeb9p6VPw30w&s"));
        listItems.add(new ListItem("Roronoa Zoro", "Sword Man", "https://i.pinimg.com/originals/0f/62/05/0f62058ee89389e00e7c6b0af5f7d984.jpg"));
        listItems.add(new ListItem("Vinsmoke Sanji", "Chef", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgrGb22mHfeHQTPb8IbpThr1L0Kn7XOetzbg&s"));

        adapter = new ListAdapter(listItems, this);

        // Set adapter untuk list dan grid
        recyclerViewList.setAdapter(adapter);
        recyclerViewGrid.setAdapter(adapter);
    }
}