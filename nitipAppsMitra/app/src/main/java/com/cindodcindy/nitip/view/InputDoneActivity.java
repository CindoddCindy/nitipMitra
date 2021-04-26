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
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas,

    textView_uang_nama_tf, textView_uang_tgal_tf, textView_uang_jumlah_tf, textView_uang_bank_asal, textView_btn_hapus_payment, textView_uang_nama_tf_sl, textView_uang_tgal_tf_sl, textView_uang_jumlah_tf_sl, textView_uang_bank_asal_sl;

    private EditText editText_nama_penerima, editText_tanggal_diterima, editText_lokasi_diterima;

    private TextView textView_btn_post_input_done;


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

        textView_uang_nama_tf=findViewById(R.id.tv_input_done_tf_sl_name);
        textView_uang_tgal_tf=findViewById(R.id.tv_input_done_tf_sl_tgal);
        textView_uang_jumlah_tf=findViewById(R.id.tv_input_done_sl_tf_harga);
        textView_uang_bank_asal=findViewById(R.id.tv_input_done_tf_sl_nama_bank);

        textView_uang_nama_tf_sl=findViewById(R.id.tv_input_done_tf_by_nama_akun);
        textView_uang_tgal_tf_sl=findViewById(R.id.tv_input_done_tf_by_tgal);
        textView_uang_jumlah_tf_sl=findViewById(R.id.tv_input_done_tf_by_harga);
        textView_uang_bank_asal_sl=findViewById(R.id.tv_input_done_tf_by_bank_name);

        editText_nama_penerima=findViewById(R.id.et_input_done_nama_penerima);
        editText_tanggal_diterima=findViewById(R.id.et_input_done_tanggal_diterima);
        editText_lokasi_diterima=findViewById(R.id.et_input_done_lokasi_diterima);

        textView_btn_post_input_done=findViewById(R.id.tv_input_done_btn_input_done);



    }

    public void postInputDone(){

    }
}