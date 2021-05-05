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
import com.cindodcindy.nitip.pojo.pojo_konfirm.pojo_get_confirm.Content;
import com.cindodcindy.nitip.view.BookingDetailActivity;
import com.cindodcindy.nitip.view.ConfirmDetailActivity;

import java.util.List;

public class ConfirmAdapter  extends RecyclerView.Adapter<ConfirmAdapter.ConfirmAdapterChild> {

    public List<com.cindodcindy.nitip.pojo.pojo_konfirm.pojo_get_confirm.Content> contentList;
    public Context context;

    public  ConfirmAdapter(List<com.cindodcindy.nitip.pojo.pojo_konfirm.pojo_get_confirm.Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }

    @NonNull
    @Override
    public ConfirmAdapterChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.konfirmasi_item, parent, false);
        ConfirmAdapterChild mViewHolder = new ConfirmAdapterChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ConfirmAdapterChild holder, int position) {

        final Content content= contentList.get(position);
        holder.textView_lokasi_jemput.setText(content.getLokasiJemputbarang());
        holder.textView_jam_jemput.setText(content.getJamJemputBarang());

        holder.cardView_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                //bundle.putLong("id_buyer", content.getIdBuyer());
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

                //nanati dihash code pake akun bank nitip
                //bundle.putString("namaAkun",content.getNamaAkun());
                //bundle.putString("noRek",content.getNoRek());
                //bundle.putString("jenisBank",content.getJenisBank());
                bundle.putString("jumlahBayar",content.getJumlahBayar());
                bundle.putString("waktubayar", content.getWaktuPembayaran());

                bundle.putString("lokasiBertemu", content.getLokasiJemputbarang());
                bundle.putString("jamAmbilBrg",content.getJamJemputBarang());
                bundle.putString("estimasisampai", content.getEstimasiSampai());


                Intent intent = new Intent(context, ConfirmDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });


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
