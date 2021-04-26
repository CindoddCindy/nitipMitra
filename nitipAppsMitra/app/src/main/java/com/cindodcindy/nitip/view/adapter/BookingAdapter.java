package com.cindodcindy.nitip.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.BookingChild> {

    @NonNull
    @Override
    public BookingChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BookingChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BookingChild extends RecyclerView.ViewHolder{

        private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
        textView_jenis_barang, textView_berat_kg;

        public BookingChild(@NonNull View itemView) {
            super(itemView);

            textView_asal_barang=itemView.findViewById(R.id.tv_item_booking_asal_titip);
            textView_tujuan_barang=itemView.findViewById(R.id.tv_item_booking_tujuan_titip);
            textView_nama_pengirim=itemView.findViewById(R.id.tv_item_booking_nama_pengirim);
            textView_nama_penerima=itemView.findViewById(R.id.tv_item_booking_nama_penerima);
            textView_jenis_barang=itemView.findViewById(R.id.tv_item_booking_jenis_barang);
            textView_berat_kg=itemView.findViewById(R.id.tv_item_booking_height);
        }
    }
}
