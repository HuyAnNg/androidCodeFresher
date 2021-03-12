package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {
    Model[] models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateDummyData();
        setupView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.setting_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setupView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(models);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
//private void startDetailActivity(int index){
//        Model1 model1 = models.get(index);
//        Intent intent = new Intent(this, DetailActivity.class);
//    intent.putExtra()
//}

    private void generateDummyData() {
        Model Today = new Model("Today, April 20", "Clear", "16", "4", R.drawable.art_clear);
        Model Tomorrow = new Model("Tomorrow", "Clear", "16", "3", R.drawable.ic_clear);
        Model Wednesday = new Model("Wednesday", "Clear", "17", "4", R.drawable.ic_clear);
        Model Thursday = new Model("Thursday", "Clean", "16", "6", R.drawable.ic_clear);
        Model Friday = new Model("Tomorrow", "Rain", "15", "10", R.drawable.ic_rain);
        Model Saturday = new Model("Saturday", "Rain", "13", "8", R.drawable.ic_rain);
        models = new Model[]{Today, Tomorrow, Wednesday, Thursday, Friday, Saturday};
    }
}
