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
import com.cindodcindy.nitip.pojo.pojo_money.pojo_get_money.Content;
import com.cindodcindy.nitip.view.GetMoneyDetailActivity;

import java.util.List;

public class MoneyAdapter extends RecyclerView.Adapter<MoneyAdapter.MoneyChild> {


    public List<Content> contentList;
    public Context context;

    public  MoneyAdapter(List<Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }

    @NonNull
    @Override
    public MoneyChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.money_item_layout, parent, false);
        MoneyChild mViewHolder = new MoneyChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoneyChild holder, int position) {
        final Content content= contentList.get(position);
        holder.textView_nama_pengirim.setText(content.getAnPengirim());
        holder.textView_jumlah_uang.setText(content.getJumlahUang());
        holder.textView_nama_bank.setText(content.getDariBank());
        holder.textView_tgal_dikirm.setText(content.getTanggalTransfer());

        holder.cardView_moneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putLong("id_seller", content.getIdSeller());
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

                bundle.putString("namaPenerimaUang",content.getAnPengirim());
                bundle.putString("jumlahUang",content.getJumlahUang());
                bundle.putString("bankTf",content.getDariBank());
                bundle.putString("tanggalTf",content.getTanggalTransfer());


                bundle.putString("tanggalBarangTiba",content.getTglBrgArr());
                bundle.putString("namaPenerimaBarang",content.getAnBrgArr());
                bundle.putString("lokasiBarangDiterima",content.getLocBrgArr());

                Intent intent = new Intent(context, GetMoneyDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });

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
