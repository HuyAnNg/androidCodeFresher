package com.example.hw2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Model[] models;

    private static final int TYPE_1 = 1;
    private static final int TYPE_2 = 2;

    public TextView line1;

    public Adapter(Model[] models) {
        this.models = models;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_1;
        }
        return TYPE_2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        int layout = viewType == TYPE_1 ? R.layout.item2 : R.layout.item1;
        View view = layoutInflater.inflate(layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Model item = models[position];
        setDataToView(item, holder.getView());
    }

    @Override
    public int getItemCount() {
        return models.length;
    }


    private void setDataToView(Model item, View view) {
        TextView day = view.findViewById(R.id.line1);
        day.setText(item.getDay());

        TextView quality = view.findViewById(R.id.line2);
        quality.setText(item.getQuality());

        TextView temp1 = view.findViewById(R.id.temp1);
        //temp1.setText(String.format("\u00B0", item.getTemp1()));
        temp1.setText(item.getTemp1());

        TextView temp2 = view.findViewById(R.id.temp2);
        //temp2.setText(String.format("\u00B0", item.getTemp2()));
        temp2.setText(item.getTemp2());

        ImageView pic = view.findViewById(R.id.pic);
        pic.setImageResource(item.getPic());
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        View view;

        ViewHolder(View view) {
            super(view);
            this.view = view;
        }

        View getView() {
            return view;
        }
    }


}

