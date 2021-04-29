package com.cindodcindy.nitip.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_bagasi.get_jasa.Content;

import java.util.List;

public class LuggageAdapter extends RecyclerView.Adapter<LuggageAdapter.LuggageChild> {

    public List<Content> contentList;
    public Context context;

    public  LuggageAdapter(List<Content> contentList,  Context context){
        this.contentList=contentList;
        this.context=context;

    }


    @NonNull
    @Override
    public LuggageChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nitip_bagasi_layout, parent, false);
        LuggageChild mViewHolder = new LuggageChild(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LuggageChild holder, int position) {
        final Content content= contentList.get(position);
        holder.textView_asal.setText(content.getAsal());
        holder.textView_tujuan.setText(content.getTujuan());
        holder.textView_date_going.setText(content.getTanggalBerangkat());
        holder.textView_time_going.setText(content.getJamBerangkat());
        holder.textView_date_arive.setText(content.getTanggalTiba());
        holder.textView_time_arrive.setText(content.getJamTiba());
        holder.textView_nama_penjual.setText(content.getNamaPenjual());
        holder.textView_harga.setText(content.getHargaBagasi());
        holder.textView_kapasitas.setText(content.getKapasitas());
        holder.textView_jenis_barang.setText(content.getJenisBarang());

    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    public class LuggageChild extends RecyclerView.ViewHolder{

        private TextView textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
        textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_jenis_barang, textView_kapasitas;

    private CardView cardView_lugg_rv;
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

            cardView_lugg_rv=itemView.findViewById(R.id.cv_lugg_rv);


        }
    }
}
