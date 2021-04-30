package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class InputConfirmActivity extends AppCompatActivity {

    private TextView textView_by_asal_barang, textView_by_tujuan_barang, textView_by_nama_pengirim, textView_by_nama_penerima,
            textView_by_jenis_barang, textView_by_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas;


    private EditText editText_order, editText_nama_akun, editText_no_rek, editText_jenis_bank, editText_tranf_sebelum,
            editText_lokasi_jmpt, editText_jam_jmeput,editText_estimiasi_tiba, editText_harga;

    private TextView textView_btn_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_confirm);

        textView_by_asal_barang=findViewById(R.id.tv_confirm_input_asal_barang);
        textView_by_tujuan_barang=findViewById(R.id.tv_confirm_input_tujuan_barang);
        textView_by_nama_pengirim=findViewById(R.id.tv_confirm_input_nama_pengirim);
        textView_by_nama_penerima=findViewById(R.id.tv_confirm_input_nama_penerima);
        textView_by_jenis_barang=findViewById(R.id.tv_confirm_input_jenis_barang);
        textView_by_berat_kg=findViewById(R.id.tv_confirm_input_berat_barang);

        //data jasa

        textView_asal=findViewById(R.id.id_tv_lugg_confirm_input_asal);
        textView_tujuan=findViewById(R.id.tv_lugg_confirm_input_tujuan);
        textView_date_going=findViewById(R.id.tv_lugg_confirm_input_tgal_going);
        textView_date_arive=findViewById(R.id.tv_lugg_confirm_input_tgal_arr);
        textView_time_going=findViewById(R.id.tv_lugg_confirm_input_time_going);
        textView_time_arrive=findViewById(R.id.tv_lugg_confirm_input_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_lugg_confirm_input_nama_seller);
        textView_harga=findViewById(R.id.tv_lugg_confirm_input_price);
        textView_barang_type=findViewById(R.id.tv_lugg_confirm_input_type);
        textView_kapasitas=findViewById(R.id.tv_lugg_confirm_input_height);

        //btn
        textView_btn_confirm=findViewById(R.id.tv_btn_confirm_input_post);

        //edit text

        editText_order=findViewById(R.id.et_input_confirm_terima_tolak);
        editText_nama_akun=findViewById(R.id.et_confirm_an);
        editText_no_rek=findViewById(R.id.et_confirm_no_rek);
        editText_jenis_bank=findViewById(R.id.et_confirm_jenis_bank);
        editText_tranf_sebelum=findViewById(R.id.et_confirm_waktu_pembayaran);
        editText_lokasi_jmpt=findViewById(R.id.et_confirm_lok_jemput);
        editText_jam_jmeput=findViewById(R.id.et_confirm_jam_jemput);
        editText_estimiasi_tiba=findViewById(R.id.et_confirm_estimasi);
        editText_harga=findViewById(R.id.et_confirm_harga);
    }

    public void getDataFromBookingDetail(){

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

    public void postConfirmToAdmin(){

    }
}