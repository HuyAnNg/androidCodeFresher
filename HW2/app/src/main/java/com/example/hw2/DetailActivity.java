package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String DAY_KEY = "day";
    public static final String QUALI_KEY = "quality";
    public static final String TEMP1_KEY = "temp1";
    public static final String TEMP2_KEY = "temp2";
//    public static final int PIC_KEY = 1;

    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    private void getModel1() {
        Intent intent = getIntent();
        String day = intent.getStringExtra(DAY_KEY);
        String quality = intent.getStringExtra(QUALI_KEY);
        String temp1 = intent.getStringExtra(TEMP1_KEY);
        String temp2 = intent.getStringExtra(TEMP2_KEY);
//        Integer pic = intent.getIntExtra(PIC_KEY);
        model = new Model(day, quality, temp1, temp2,1);
    }

    private void setDataToView(Model item, View view) {
        TextView day = view.findViewById(R.id.line1);
        day.setText(model.getDay());

        TextView quality = view.findViewById(R.id.line2);
        quality.setText(model.getQuality());

        TextView temp1 = view.findViewById(R.id.temp1);
        //temp1.setText(String.format("\u00B0", item.getTemp1()));
        temp1.setText(model.getTemp1());

        TextView temp2 = view.findViewById(R.id.temp2);
        //temp2.setText(String.format("\u00B0", item.getTemp2()));
        temp2.setText(model.getTemp2());

        ImageView pic = view.findViewById(R.id.pic);
        pic.setImageResource(model.getPic());
    }
}