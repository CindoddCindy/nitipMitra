package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class GetMoneyDetailActivity extends AppCompatActivity {

    private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
            textView_jenis_barang, textView_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas,

    textView_uang_nama_tf, textView_uang_tgal_tf, textView_uang_jumlah_tf, textView_uang_bank_asal_tf;

    private TextView textView_nama_penerima_brg, textView_tanggal_diterima_brg, textView_lokasi_diterima_brg;

    private TextView textView_btn_hapus_get_money;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_money_detail);

        textView_asal_barang=findViewById(R.id.tv_mon_det_by_asal);
        textView_tujuan_barang=findViewById(R.id.tv_mon_det_by_tujuan);
        textView_nama_pengirim=findViewById(R.id.tv_mon_det_by_pengirim);
        textView_nama_penerima=findViewById(R.id.tv_mon_det_by_penerima);
        textView_jenis_barang=findViewById(R.id.tv_mon_det_by_jenis_barang);
        textView_berat_kg=findViewById(R.id.tv_mon_det_by_berat_barang);

        //data jasa

        textView_asal=findViewById(R.id.tv_mon_det_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_mon_det_lugg_tujuan);
        textView_date_going=findViewById(R.id.tv_mon_det_lugg_tgal_going);
        textView_date_arive=findViewById(R.id.tv_mon_det_lugg_tgal_arr);
        textView_time_going=findViewById(R.id.tv_mon_det_lugg_time_going);
        textView_time_arrive=findViewById(R.id.tv_mon_det_lugg_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_mon_det_lugg_nama_seller);
        textView_harga=findViewById(R.id.tv_mon_det_lugg_price);
        textView_jenis_barang=findViewById(R.id.tv_mon_det_lugg_type);
        textView_kapasitas=findViewById(R.id.tv_mon_det_lugg_height);

        textView_uang_nama_tf=findViewById(R.id.tv_mon_det_tf_nama_pengirim);
        textView_uang_tgal_tf=findViewById(R.id.tv_mon_det_tf_tgal_kirim);
        textView_uang_jumlah_tf=findViewById(R.id.tv_mon_det_tf_jumlah_kirim);
        textView_uang_bank_asal_tf=findViewById(R.id.tv_mon_det_tf_nama_bank);


        textView_nama_penerima_brg=findViewById(R.id.tv_mon_det_brg_nama_penerima);
        textView_tanggal_diterima_brg=findViewById(R.id.tv_mon_det_brg_tgal_diterima);
        textView_lokasi_diterima_brg=findViewById(R.id.tv_mon_det_brg_lokasi_diterima);

        textView_btn_hapus_get_money=findViewById(R.id.tv_mon_det_tv_btn_btn_hapus_data_money);

    }

    public void getMoneyDetailFromAdapter(){
        if(getIntent().getExtras()!=null) {
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();

            textView_uang_nama_tf.setText(bundle.getString("namaPenerimaUang"));
            textView_uang_jumlah_tf.setText(bundle.getString("jumlahUang"));
            textView_uang_bank_asal_tf.setText(bundle.getString("bankTf"));
            textView_uang_tgal_tf.setText(bundle.getString("tanggalTf"));


            textView_nama_penerima_brg.setText(bundle.getString("namaPenerimaBarang"));
            textView_tanggal_diterima_brg.setText(bundle.getString("tanggalBarangTiba"));
            textView_lokasi_diterima_brg.setText(bundle.getString("lokasiBarangDiterima"));


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
            textView_jenis_barang.setText(bundle.getString("jenisbarang"));

            textView_asal_barang.setText(bundle.getString("asalBr"));
            textView_tujuan_barang.setText(bundle.getString("tujuanBr"));
            textView_nama_pengirim.setText(bundle.getString("pengirim"));
            textView_nama_penerima.setText(bundle.getString("penerima"));
            textView_jenis_barang.setText(bundle.getString("jenisBr"));
            textView_berat_kg.setText(bundle.getString("beratBr"));


        }
    }
}