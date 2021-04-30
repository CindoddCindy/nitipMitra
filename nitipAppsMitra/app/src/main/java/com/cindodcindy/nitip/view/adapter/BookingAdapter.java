package com.cindodcindy.nitip.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_booking.pojo_get_booking.Content;
import com.cindodcindy.nitip.view.BookingDetailActivity;

import java.util.List;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.BookingChild> {

    public List<com.cindodcindy.nitip.pojo.pojo_booking.pojo_get_booking.Content> contentList;
    public Context context;

    public  BookingAdapter(List<Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }

    @NonNull
    @Override
    public BookingChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.booking_item_layout, parent, false);
        BookingChild mViewHolder = new BookingChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookingChild holder, int position) {

        final com.cindodcindy.nitip.pojo.pojo_booking.pojo_get_booking.Content content= contentList.get(position);
        holder.textView_asal_barang.setText(content.getAlamatPembeli());
        holder.textView_tujuan_barang.setText(content.getAlamatPenerima());
        holder.textView_nama_pengirim.setText(content.getNamaPembeli());
        holder.textView_nama_penerima.setText(content.getNamaPenerima());
        holder.textView_jenis_barang.setText(content.getJenisBarangKirim());
        holder.textView_berat_kg.setText(content.getKapasitasBarang());

        holder.cardView_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putLong("id_buyer", content.getIdBuyer());
                bundle.putString("asal",content.getAsal());
                bundle.putString("tujuan",content.getTujuan());
                bundle.putString("tglgo",content.getTanggalBerangkat());
                bundle.putString("tglarr",content.getTanggalTiba());
                bundle.putString("jamgo", content.getJamBerangkat());
                bundle.putString("jamarr",content.getJamTiba());
                bundle.putString("namapenjual",content.getNamaPenjual());
                bundle.putString("kapasitas",content.getKapasitas());
                bundle.putString("jenisbarang",content.getJenisBarang());
                bundle.putString("harga", content.getHargaBagasi());

                bundle.putString("asalBr",content.getAlamatPembeli());
                bundle.putString("tujuanBr",content.getAlamatPenerima());
                bundle.putString("pengirim",content.getNamaPembeli());
                bundle.putString("penerima",content.getNamaPenerima());
                bundle.putString("jenisBr", content.getJenisBarangKirim());
                bundle.putString("beratBr",content.getKapasitasBarang());





                Intent intent = new Intent(context, BookingDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    public class BookingChild extends RecyclerView.ViewHolder{

        private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
        textView_jenis_barang, textView_berat_kg;

        private CardView cardView_booking;

        public BookingChild(@NonNull View itemView) {
            super(itemView);

            textView_asal_barang=itemView.findViewById(R.id.tv_item_booking_asal_titip);
            textView_tujuan_barang=itemView.findViewById(R.id.tv_item_booking_tujuan_titip);
            textView_nama_pengirim=itemView.findViewById(R.id.tv_item_booking_nama_pengirim);
            textView_nama_penerima=itemView.findViewById(R.id.tv_item_booking_nama_penerima);
            textView_jenis_barang=itemView.findViewById(R.id.tv_item_booking_jenis_barang);
            textView_berat_kg=itemView.findViewById(R.id.tv_item_booking_height);
            cardView_booking=itemView.findViewById(R.id.cv_booking);
        }
    }
}
