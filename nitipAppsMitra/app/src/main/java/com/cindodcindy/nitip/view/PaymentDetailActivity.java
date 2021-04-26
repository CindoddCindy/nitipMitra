package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class PaymentDetailActivity extends AppCompatActivity {

    private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
            textView_jenis_barang, textView_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas,

    textView_uang_nama_tf, textView_uang_tgal_tf, textView_uang_jumlah_tf, textView_uang_bank_asal, textView_btn_hapus_payment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_detail);

        textView_asal_barang=findViewById(R.id.tv_pay_det_asal_pngirm);
        textView_tujuan_barang=findViewById(R.id.tv_pay_det_tujuan_pngirim);
        textView_nama_pengirim=findViewById(R.id.tv_pay_det_nama_pengirim);
        textView_nama_penerima=findViewById(R.id.tv_pay_det_nama_penerima);
        textView_jenis_barang=findViewById(R.id.tv_pay_det_jenis_barang);
        textView_berat_kg=findViewById(R.id.tv_pay_det_berat_barang);

        //data jasa

        textView_asal=findViewById(R.id.tv_id_pay_det_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_pay_det_lugg_tujuan);
        textView_date_going=findViewById(R.id.tv_pay_det_lugg_tgal_going);
        textView_date_arive=findViewById(R.id.tv_pay_det_lugg_tgal_arr);
        textView_time_going=findViewById(R.id.tv_pay_det_lugg_time_going);
        textView_time_arrive=findViewById(R.id.tv_pay_det_lugg_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_pay_det_lugg_nama_seller);
        textView_harga=findViewById(R.id.tv_pay_det_lugg_price);
        textView_jenis_barang=findViewById(R.id.tv_pay_det_lugg_type);
        textView_kapasitas=findViewById(R.id.tv_pay_det_lugg_height);

        textView_uang_nama_tf=findViewById(R.id.tv_pay_det_nama_tf);
        textView_uang_tgal_tf=findViewById(R.id.tv_pay_det_tgal_tf);
        textView_uang_jumlah_tf=findViewById(R.id.tv_pay_det_jumlah_uang_tf);
        textView_uang_bank_asal=findViewById(R.id.tv_pay_det_from_bank_tf);

        textView_btn_hapus_payment=findViewById(R.id.tv_btn_pay_det_hapus);



    }

    public  void getDataDetailPayment(){

    }

    public void hapusDataPayment(){

    }
}