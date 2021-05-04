package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class DoneDetailActivity extends AppCompatActivity {

    private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
            textView_jenis_barang, textView_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas,

    textView_uang_nama_tf, textView_uang_no_rek_tf, textView_uang_jumlah_tf, textView_uang_bank_terima, textView_btn_hapus_payment, textView_uang_nama_tf_sl, textView_uang_tgal_tf_sl, textView_uang_jumlah_tf_sl, textView_uang_bank_asal_sl;

    private TextView textView_nama_penerima_pn, textView_tanggal_diterima_pn, textView_lokasi_diterima_pn;

    private TextView textView_btn_pembayaran, textView_edit_done, textView_hapus_done;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_detail);

        textView_asal_barang=findViewById(R.id.tv_don_det_by_asal);
        textView_tujuan_barang=findViewById(R.id.tv_don_det_by_tujuan);
        textView_nama_pengirim=findViewById(R.id.tv_don_det_by_nama_pengirim);
        textView_nama_penerima=findViewById(R.id.tv_don_det_by_nama_penerima);
        textView_jenis_barang=findViewById(R.id.tv_don_det_by_jenis_barang);
        textView_berat_kg=findViewById(R.id.tv_don_det_by_berat_barang);

        //data jasa

        textView_asal=findViewById(R.id.tv_don_det_lugg_asal);
        textView_tujuan=findViewById(R.id.tv_don_det_lugg_tujuan);
        textView_date_going=findViewById(R.id.tv_don_det_lugg_tgal_going);
        textView_date_arive=findViewById(R.id.tv_don_det_lugg_time_going);
        textView_time_going=findViewById(R.id.tv_don_det_lugg_tgal_arr);
        textView_time_arrive=findViewById(R.id.tv_don_det_lugg_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_don_det_lugg_nama_seller);
        textView_harga=findViewById(R.id.tv_don_det_lugg_price);
        textView_jenis_barang=findViewById(R.id.tv_don_det_lugg_type);
        textView_kapasitas=findViewById(R.id.tv_don_det_lugg_height);

        textView_uang_nama_tf=findViewById(R.id.tv_don_det_tf_sl_name);
        textView_uang_no_rek_tf=findViewById(R.id.tv_don_det_tf_sl_no_rek);
        textView_uang_jumlah_tf=findViewById(R.id.tv_don_det_sl_tf_harga);
        textView_uang_bank_terima=findViewById(R.id.tv_don_det_sl_nama_bank);

        textView_uang_nama_tf_sl=findViewById(R.id.tv_don_det_by_nama_akun);
        textView_uang_tgal_tf_sl=findViewById(R.id.tv_don_det_by_tgal);
        textView_uang_jumlah_tf_sl=findViewById(R.id.tv_don_det_by_harga);
        textView_uang_bank_asal_sl=findViewById(R.id.tv_don_det_by_bank_name);

        textView_nama_penerima_pn=findViewById(R.id.tv_done_det_nama_penerima);
        textView_tanggal_diterima_pn=findViewById(R.id.tv_done_det_tgal_diterima);
        textView_lokasi_diterima_pn=findViewById(R.id.tv_done_det_lokasi_diterima);

        textView_btn_pembayaran=findViewById(R.id.tv_don_det_btn_pembayaran_detail);
        textView_edit_done=findViewById(R.id.tv_don_det_btn_edit_data);
        textView_hapus_done=findViewById(R.id.tv_don_det_btn_hapus);


    }

    public void getDoneDetail(){
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
            textView_jenis_barang.setText(bundle.getString("jenisbarang"));

            textView_asal_barang.setText(bundle.getString("asalBr"));
            textView_tujuan_barang.setText(bundle.getString("tujuanBr"));
            textView_nama_pengirim.setText(bundle.getString("pengirim"));
            textView_nama_penerima.setText(bundle.getString("penerima"));
            textView_jenis_barang.setText(bundle.getString("jenisBr"));
            textView_berat_kg.setText(bundle.getString("beratBr"));

            textView_nama_penerima_pn.setText(bundle.getString("namaPenerimaBarang"));
            textView_tanggal_diterima_pn.setText(bundle.getString("tanggalBarangTiba"));
            textView_lokasi_diterima_pn.setText(bundle.getString("lokasiBarangDiterima"));


            //pengirim
            textView_uang_nama_tf_sl.setText(bundle.getString("akunBayar"));
            textView_uang_tgal_tf_sl.setText(bundle.getString("tanggalBayar"));
            textView_uang_jumlah_tf_sl.setText(bundle.getString("hargaBayar"));
            textView_uang_bank_asal_sl.setText(bundle.getString("bankBayar"));

            //penerima
            textView_uang_nama_tf.setText(bundle.getString("akunTerima"));
            textView_uang_no_rek_tf.setText(bundle.getString("noRekTerima"));
            textView_uang_jumlah_tf.setText(bundle.getString("jumlahTerima"));
            textView_uang_bank_terima.setText(bundle.getString("bankTerima"));




        }
    }
}