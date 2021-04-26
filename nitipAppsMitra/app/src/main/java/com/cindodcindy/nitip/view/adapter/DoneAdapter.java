package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DoneAdapter extends RecyclerView.Adapter<DoneAdapter.DoneChild> {

    @NonNull
    @Override
    public DoneChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DoneChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class  DoneChild extends RecyclerView.ViewHolder{

        public DoneChild(@NonNull View itemView) {
            super(itemView);
        }
    }
}
