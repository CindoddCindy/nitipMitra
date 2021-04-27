package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;

public class MoneyAdapter extends RecyclerView.Adapter<MoneyAdapter.MoneyChild> {

    @NonNull
    @Override
    public MoneyChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MoneyChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class MoneyChild extends RecyclerView.ViewHolder{

        public TextView textView_nama_pengirim, textView_tgal_dikirm, textView_jumlah_uang, textView_nama_bank;

        public CardView cardView_moneys;

        public MoneyChild(@NonNull View itemView) {
            super(itemView);

            textView_nama_pengirim=itemView.findViewById(R.id.tv_money_item_nama_pengirim);
            textView_tgal_dikirm=itemView.findViewById(R.id.tv_money_item_tanggal_dikirim);
            textView_jumlah_uang=itemView.findViewById(R.id.tv_money_item_jumlah_uang);
            textView_nama_bank=itemView.findViewById(R.id.tv_money_item_nama_bank);
            cardView_moneys=itemView.findViewById(R.id.cv_money);

        }
    }
}
