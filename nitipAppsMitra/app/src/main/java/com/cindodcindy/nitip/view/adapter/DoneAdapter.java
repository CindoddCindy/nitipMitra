package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;

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

        private TextView textView_nama_penerima, textView_tggal_diterima;
        private CardView cardView_done_klik;

        public DoneChild(@NonNull View itemView) {
            super(itemView);
            textView_nama_penerima=itemView.findViewById(R.id.tv_done_item_nama_penerinma);
            textView_tggal_diterima=itemView.findViewById(R.id.tv_done_item_tggal_diterima);
            cardView_done_klik=itemView.findViewById(R.id.cv_done);
        }
    }
}
