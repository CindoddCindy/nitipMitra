package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class BookingDetailActivity extends AppCompatActivity {

    private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
            textView_jenis_barang, textView_berat_kg,

            textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas;

    private TextView btn_konfirm, btn_hapus, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_detail);
        textView_asal_barang=findViewById(R.id.tv_book_detail_asal_barang);
        textView_tujuan_barang=findViewById(R.id.tv_book_detail_tujuan_barang);
        textView_nama_pengirim=findViewById(R.id.tv_book_detail_nama_pengirim);
        textView_nama_penerima=findViewById(R.id.tv_book_detail_nama_penerima);
        textView_jenis_barang=findViewById(R.id.tv_booking_detail_type);
        textView_berat_kg=findViewById(R.id.tv_booking_detail_height);

        //data jasa

        textView_asal=findViewById(R.id.id_tv_detail_booking_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_detail_booking_tujuan);
        textView_date_going=findViewById(R.id.tv_item_detail_booking_tgal_going);
        textView_date_arive=findViewById(R.id.tv_detail_boking_tgal_arr);
        textView_time_going=findViewById(R.id.tv_item_detail_booking_time_going);
        textView_time_arrive=findViewById(R.id.tv_item_detail_booking_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_item_detail_booking_nama_seller);
        textView_harga=findViewById(R.id.tv_booking_detail_price);
        textView_jenis_barang=findViewById(R.id.tv_booking_detail_type);
        textView_kapasitas=findViewById(R.id.tv_detail_booking_berat_barang);

        btn_konfirm=findViewById(R.id.tv_booking_detail_btn_konfirm_booking);
        btn_hapus=findViewById(R.id.tv_booking_detail_btn_hapus_konfirm);
        btn_back=findViewById(R.id.tv_booking_detail_btn_kembali);
    }

    public void getDataFromItem(){

    }

    public void deleteItemBooking(){

    }

    public void konfirmBooking(){

    }
}