package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LuggageAdapter extends RecyclerView.Adapter<LuggageAdapter.LuggageChild> {

    @NonNull
    @Override
    public LuggageChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LuggageChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class LuggageChild extends RecyclerView.ViewHolder{

        public LuggageChild(@NonNull View itemView) {
            super(itemView);
        }
    }
}
