package com.example.erza.registrationserviceapp.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erza.registrationserviceapp.R;
import com.example.erza.registrationserviceapp.hotelmodel.HotelModel;

import java.util.ArrayList;

/**
 * Created by erza on 12/13/17.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private ArrayList<HotelModel> modelSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        ImageView imageViewCardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.imageViewCardView = itemView.findViewById(R.id.imageViewCardView);

        }

    }

    public CustomAdapter(ArrayList<HotelModel> model){
        this.modelSet = model;
    }


    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_layout, parent, false);
        view.setOnClickListener(MainActivity.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int listPosition) {
        TextView textViewName = holder.textViewName;
        ImageView imageView = holder.imageViewCardView;

        textViewName.setText(modelSet.get(listPosition).getName());
        imageView.setImageResource(modelSet.get(listPosition).getIdUrlGallery());

    }


    @Override
    public int getItemCount() {
        return modelSet.size();
    }
}
