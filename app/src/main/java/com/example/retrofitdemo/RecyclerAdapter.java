package com.example.retrofitdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewGolder> {

    private List<CityModel> cityModels;

    public RecyclerAdapter(List<CityModel> cityModels) {
        this.cityModels = cityModels;
    }

    @NonNull
    @Override
    public MyViewGolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, viewGroup, false);
        return new MyViewGolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewGolder myViewGolder, int i) {
        CityModel cityModel = cityModels.get(i);
        myViewGolder.citnname.setText(cityModel.getName());
    }

    @Override
    public int getItemCount() {
        return cityModels.size();
    }

    public class MyViewGolder extends RecyclerView.ViewHolder {
        TextView citnname;

        public MyViewGolder(@NonNull View itemView) {
            super(itemView);
            citnname = itemView.findViewById(R.id.cityname);
        }
    }

}
