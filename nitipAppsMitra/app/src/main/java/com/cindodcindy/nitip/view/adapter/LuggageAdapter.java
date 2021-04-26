package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;

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
        private TextView textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
        textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_jenis_barang, textView_kapasitas;

        public LuggageChild(@NonNull View itemView) {
            super(itemView);
            textView_asal=itemView.findViewById(R.id.id_tv_item_lugg_asal);
            textView_tujuan=itemView.findViewById(R.id.tv_item_lugg_tujuan);
            textView_date_going=itemView.findViewById(R.id.tv_item_lugg_tgal_going);
            textView_date_arive=itemView.findViewById(R.id.tv_item_lugg_tgal_arr);
            textView_time_going=itemView.findViewById(R.id.tv_item_lugg_time_going);
            textView_time_arrive=itemView.findViewById(R.id.tv_item_lugg_time_arr);
            textView_nama_penjual=itemView.findViewById(R.id.tv_item_lugg_nama_seller);
            textView_harga=itemView.findViewById(R.id.tv_item_lugg_price);
            textView_jenis_barang=itemView.findViewById(R.id.tv_item_lugg_type);
            textView_kapasitas=itemView.findViewById(R.id.tv_item_lugg_height);
        }
    }
}
