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
import com.cindodcindy.nitip.pojo.pojo_done.pojo_get_done.Content;
import com.cindodcindy.nitip.view.DoneDetailActivity;

import java.util.List;

public class DoneAdapter extends RecyclerView.Adapter<DoneAdapter.DoneChild> {

    public List<Content> contentList;
    public Context context;

    public  DoneAdapter(List<Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }


    @NonNull
    @Override
    public DoneChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.done_item_layout, parent, false);
        DoneChild mViewHolder = new DoneChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoneChild holder, int position) {
        final Content content= contentList.get(position);
        holder.textView_nama_penerima.setText(content.getDiterimaOleh());
        holder.textView_tggal_diterima.setText(content.getTanggalBarangTiba());

        holder.cardView_done_klik.setOnClickListener(new View.OnClickListener() {
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


                bundle.putString("akunBayar",content.getAlamatPembeli());
                bundle.putString("tanggalBayar",content.getAlamatPenerima());
                bundle.putString("bankBayar",content.getNamaPembeli());
                bundle.putString("hargaBayar",content.getNamaPenerima());

                bundle.putString("akunTerima", content.getJenisBarangKirim());
                bundle.putString("noRekTerima",content.getKapasitasBarang());
                bundle.putString("jumlahTerima", content.getJenisBarangKirim());
                bundle.putString("bankTerima",content.getKapasitasBarang());


                bundle.putString("tanggalBarangTiba",content.getTanggalBarangTiba());
                bundle.putString("namaPenerimaBarang",content.getDiterimaOleh());
                bundle.putString("lokasiBarangDiterima",content.getLokasiBarangDiterima());

                Intent intent = new Intent(context, DoneDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });


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
