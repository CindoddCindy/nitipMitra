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
import com.cindodcindy.nitip.pojo.pojo_payment.get_payement.Content;
import com.cindodcindy.nitip.view.BookingDetailActivity;
import com.cindodcindy.nitip.view.PaymentDetailActivity;

import java.util.List;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.PaymentChild> {

    public List<com.cindodcindy.nitip.pojo.pojo_payment.get_payement.Content> contentList;
    public Context context;

    public  PaymentAdapter(List<com.cindodcindy.nitip.pojo.pojo_payment.get_payement.Content> contentList, Context context){
        this.contentList=contentList;
        this.context=context;

    }


    @NonNull
    @Override
    public PaymentChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.booking_item_layout, parent, false);
        PaymentChild mViewHolder = new PaymentChild(mView);

        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentChild holder, int position) {

        final Content content= contentList.get(position);
        holder.textView_nama_pengirim.setText(content.getNamaPengirimUang());
        holder.textView_tgal_kirim.setText(content.getTanggalTransfer());
        holder.textView_jumlah_uang.setText(content.getUangSejumlah());
        holder.textView_nama_bank.setText(content.getBankPengirimUang());

        holder.cardView_payment.setOnClickListener(new View.OnClickListener() {
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

                bundle.putString("namaPengirimUang",content.getNamaPengirimUang());
                bundle.putString("TanggalUangDikirim",content.getTanggalTransfer());
                bundle.putString("JumlahUangDikirim",content.getUangSejumlah());
                bundle.putString("BankPengirim",content.getBankPengirimUang());


                Intent intent = new Intent(context, PaymentDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);

            }
        });

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
