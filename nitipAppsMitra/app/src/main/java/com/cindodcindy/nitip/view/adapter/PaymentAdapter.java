package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.PaymentChild> {

    @NonNull
    @Override
    public PaymentChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class PaymentChild extends RecyclerView.ViewHolder{
        private TextView textView_nama_pengirim, textView_tgal_kirim,textView_jumlah_uang, textView_nama_bank;
        private CardView cardView_payment;

        public PaymentChild(@NonNull View itemView) {
            super(itemView);
            textView_nama_pengirim=itemView.findViewById(R.id.tv_pay_nama_by_tf);
            textView_tgal_kirim=itemView.findViewById(R.id.tv_pay_tgl_by_tf);
            textView_jumlah_uang=itemView.findViewById(R.id.tv_pay_jmlh_by_tf);
            textView_nama_bank=itemView.findViewById(R.id.tv_pay_bank_by_tf);
            cardView_payment=itemView.findViewById(R.id.cv_pay);
        }
    }
}
