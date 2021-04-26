package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;

public class ConfirmAdapter  extends RecyclerView.Adapter<ConfirmAdapter.ConfirmAdapterChild> {

    @NonNull
    @Override
    public ConfirmAdapterChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ConfirmAdapterChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ConfirmAdapterChild extends RecyclerView.ViewHolder{
        private TextView textView_lokasi_jemput, textView_jam_jemput;
        private CardView cardView_confirm;

        public ConfirmAdapterChild(@NonNull View itemView) {
            super(itemView);
            textView_lokasi_jemput=itemView.findViewById(R.id.tv_item_confirm_lokasi_jemput_barang);
            textView_jam_jemput=itemView.findViewById(R.id.tv_item_confirm_jam_jemput_barang);
            cardView_confirm=itemView.findViewById(R.id.cv_confirm);
        }
    }
}
