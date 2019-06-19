package com.example.pravina.ecoproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchProductInfoAdapter  extends RecyclerView.Adapter<SearchProductInfoAdapter.ViewHolder> {
    private ItemData[] itemsData;

    public SearchProductInfoAdapter(ItemData[] itemsData) {
        this.itemsData = itemsData;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public SearchProductInfoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_product_adapter, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SearchProductInfoAdapter.ViewHolder viewHolder, int i) {
        // - replace the contents of the view with that itemsData

        viewHolder.txtProductName.setText(itemsData[i].getTitle());
      //  viewHolder.imgProductInfo.setImageResource(itemsData[i].getImageUrl());


    }



    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtProductName;
        public ImageView imgProductInfo;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtProductName = (TextView) itemLayoutView.findViewById(R.id.txtProductName);
            imgProductInfo = (ImageView) itemLayoutView.findViewById(R.id.imgProductInfo);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.length;
    }
}