package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class InputDoneActivity extends AppCompatActivity {

    private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
            textView_jenis_barang, textView_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas;


    private EditText editText_nama_penerima, editText_tanggal_diterima, editText_lokasi_diterima;

    private TextView textView_btn_post_input_done;

    private  TextView textVie_buyer_An_, textView_buyer_tf_buyer_bank, textView_buyer_tf_buyer_tf_date ,textView_buyer_tf_jumlah_harga;

    private EditText editText_seller_An, editText_seller_no_rek, editText_seller_bank, editText_seller_jumlah_harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_done);

        textView_asal_barang=findViewById(R.id.tv_input_done_by_asal_titip);
        textView_tujuan_barang=findViewById(R.id.tv_input_done_by_tujuan_titip);
        textView_nama_pengirim=findViewById(R.id.tv_input_done_by_nama_pengirim);
        textView_nama_penerima=findViewById(R.id.tv_input_done_by_nama_penerima);
        textView_jenis_barang=findViewById(R.id.tv_input_done_by_jenis_barang);
        textView_berat_kg=findViewById(R.id.tv_input_done_by_height);

        //data jasa

        textView_asal=findViewById(R.id.tv_input_done_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_input_done_lugg_tujuan);
        textView_date_going=findViewById(R.id.tv_input_done_lugg_tgal_going);
        textView_date_arive=findViewById(R.id.tv_input_done_lugg_tgal_arr);
        textView_time_going=findViewById(R.id.tv_input_done_lugg_time_going);
        textView_time_arrive=findViewById(R.id.tv_input_done_lugg_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_input_done_lugg_nama_seller);
        textView_harga=findViewById(R.id.tv_input_done_lugg_price);
        textView_jenis_barang=findViewById(R.id.tv_input_done_lugg_type);
        textView_kapasitas=findViewById(R.id.tv_input_done_lugg_height);

        editText_seller_An=findViewById(R.id.et_input_done_tf_sl_pnerima_an);
        editText_seller_no_rek=findViewById(R.id.et_input_done_tf_sl_no_rek);
        editText_seller_bank=findViewById(R.id.et_input_done_tf_sl_nama_bank);
        editText_seller_jumlah_harga=findViewById(R.id.et_input_done_sl_jumlah_uang);

        textVie_buyer_An_=findViewById(R.id.tv_input_done_tf_by_nama_akun);
        textView_buyer_tf_buyer_tf_date=findViewById(R.id.tv_input_done_tf_by_tgal);
        textView_buyer_tf_jumlah_harga=findViewById(R.id.tv_input_done_tf_by_harga);
        textView_buyer_tf_buyer_bank=findViewById(R.id.tv_input_done_tf_by_bank_name);

        editText_nama_penerima=findViewById(R.id.et_input_done_nama_penerima);
        editText_tanggal_diterima=findViewById(R.id.et_input_done_tanggal_diterima);
        editText_lokasi_diterima=findViewById(R.id.et_input_done_lokasi_diterima);

        textView_btn_post_input_done=findViewById(R.id.tv_input_done_btn_input_done);



    }

    public void postInputDone(){

    }
}