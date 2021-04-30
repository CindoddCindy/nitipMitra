package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class BookingDetailActivity extends AppCompatActivity {

    private TextView textView_by_asal_barang, textView_by_tujuan_barang, textView_by_nama_pengirim, textView_by_nama_penerima,
            textView_by_jenis_barang, textView_by_berat_kg,

            textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas;

    private TextView btn_konfirm, btn_hapus, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_detail);
        textView_by_asal_barang=findViewById(R.id.tv_book_detail_by_asal_barang);
        textView_by_tujuan_barang=findViewById(R.id.tv_book_detail_by_tujuan_barang);
        textView_by_nama_pengirim=findViewById(R.id.tv_book_detail_by_nama_pengirim);
        textView_by_nama_penerima=findViewById(R.id.tv_book_detail_by_nama_penerima);
        textView_by_jenis_barang=findViewById(R.id.tv_detail_booking_by_jenis_barang);
        textView_by_berat_kg=findViewById(R.id.tv_detail_booking_by_berat_barang);

        //data jasa

        textView_asal=findViewById(R.id.id_tv_detail_booking_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_detail_booking_tujuan);
        textView_date_going=findViewById(R.id.tv_item_detail_booking_tgal_going);
        textView_date_arive=findViewById(R.id.tv_detail_boking_tgal_arr);
        textView_time_going=findViewById(R.id.tv_item_detail_booking_time_going);
        textView_time_arrive=findViewById(R.id.tv_item_detail_booking_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_item_detail_booking_nama_seller);
        textView_harga=findViewById(R.id.tv_booking_detail_price);
        textView_barang_type=findViewById(R.id.tv_booking_detail_type);
        textView_kapasitas=findViewById(R.id.tv_booking_detail_height);

        btn_konfirm=findViewById(R.id.tv_booking_detail_btn_konfirm_booking);
        btn_hapus=findViewById(R.id.tv_booking_detail_btn_hapus_konfirm);
        btn_back=findViewById(R.id.tv_booking_detail_btn_kembali);
    }

    public void getDataFromItem(){

        if(getIntent().getExtras()!=null) {
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();

            // spHandle.setSpIdConfirmOrderEdit(SpHandle.SP_ID_CONFIRM_ORDER_EDIT, bundle.getLong("id_customer"));
            //spHandle.setSpIdConfirmOrder(SpHandle.SP_ID_CONFIRM_ORDER,bundle.getLong("id_confirm"));
            textView_asal.setText(bundle.getString("asal"));
            textView_tujuan.setText(bundle.getString("tujuan"));
            textView_date_going.setText(bundle.getString("tglgo"));
            textView_date_arive.setText(bundle.getString("tglarr"));
            textView_time_going.setText(bundle.getString("jamgo"));
            textView_time_arrive.setText(bundle.getString("jamarr"));
            textView_nama_penjual.setText(bundle.getString("namapenjual"));
            textView_harga.setText(bundle.getString("harga"));
            textView_kapasitas.setText(bundle.getString("kapasitas"));
            textView_barang_type.setText(bundle.getString("jenisbarang"));

            textView_by_asal_barang.setText(bundle.getString("asalBr"));
            textView_by_tujuan_barang.setText(bundle.getString("tujuanBr"));
            textView_by_nama_pengirim.setText(bundle.getString("pengirim"));
            textView_by_nama_penerima.setText(bundle.getString("penerima"));
            textView_by_jenis_barang.setText(bundle.getString("jenisBr"));
            textView_by_berat_kg.setText(bundle.getString("beratBr"));

        }



        }

    public void deleteItemBooking(){

    }

    public void konfirmBooking(){

        Bundle bundle = new Bundle();
        //bundle.putLong("id_buyer", content.getIdBuyer());
        bundle.putString("asal",textView_asal.getText().toString());
        bundle.putString("tujuan",textView_tujuan.getText().toString());
        bundle.putString("tglgo",textView_date_going.getText().toString());
        bundle.putString("tglarr",textView_date_arive.getText().toString());
        bundle.putString("jamgo", textView_time_going.getText().toString());
        bundle.putString("jamarr",textView_time_arrive.getText().toString());
        bundle.putString("namapenjual",textView_nama_penjual.getText().toString());
        bundle.putString("kapasitas",textView_kapasitas.getText().toString());
        bundle.putString("jenisbarang",textView_barang_type.getText().toString());
        bundle.putString("harga", textView_harga.getText().toString());

        bundle.putString("asalBr",textView_by_asal_barang.getText().toString());
        bundle.putString("tujuanBr",textView_by_tujuan_barang.getText().toString());
        bundle.putString("pengirim",textView_by_nama_pengirim.getText().toString());
        bundle.putString("penerima",textView_by_nama_penerima.getText().toString());
        bundle.putString("jenisBr", textView_by_jenis_barang.getText().toString());
        bundle.putString("beratBr",textView_by_berat_kg.getText().toString());

        Intent intent = new Intent(BookingDetailActivity.this, InputConfirmActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}