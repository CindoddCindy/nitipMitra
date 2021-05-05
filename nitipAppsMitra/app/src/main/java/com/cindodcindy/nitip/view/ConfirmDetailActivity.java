package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cindodcindy.nitip.R;

public class ConfirmDetailActivity extends AppCompatActivity {

    private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
            textView_jenis_barang, textView_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas;


    private TextView  mn_nama_akun, mn_no_rek, mn_jenis_bank, mn_wktu_tranf,
            mn_lokasi_jmpt, mn_jam_jmput,mn_estimiasi_tiba, mn_harga;

    private TextView btn_edit, btn_delete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_detail);

        textView_asal_barang=findViewById(R.id.tv_con_det_by_asal);
        textView_tujuan_barang=findViewById(R.id.tv_con_det_by_tujuan);
        textView_nama_pengirim=findViewById(R.id.tv_con_det_by_pengirim);
        textView_nama_penerima=findViewById(R.id.tv_con_det_penerima);
        textView_jenis_barang=findViewById(R.id.tv_con_det_by_type);
        textView_berat_kg=findViewById(R.id.tv_con_det_height);

        //data jasa

        textView_asal=findViewById(R.id.id_tv_con_det_sl_asal);
        textView_tujuan=findViewById(R.id.tv_con_det_sl_tujuan);
        textView_date_going=findViewById(R.id.tv_con_det_sl_tgal_going);
        textView_date_arive=findViewById(R.id.tv_con_det_sl_tgal_arr);
        textView_time_going=findViewById(R.id.tv_con_det_sl_time_going);
        textView_time_arrive=findViewById(R.id.tv_con_det_sl_time_arr);
        textView_nama_penjual=findViewById(R.id.tv_con_det_sl_nama_seller);
        textView_harga=findViewById(R.id.tv_con_det_sl_price);
        textView_jenis_barang=findViewById(R.id.tv_con_det_sl_type);
        textView_kapasitas=findViewById(R.id.tv_con_det_sl_height);

        //btn
        btn_edit=findViewById(R.id.btn_edit_conf_detail);
        btn_delete=findViewById(R.id.btn_hapus_conf_detail);

        //edit text

       mn_nama_akun =findViewById(R.id.tv_con_det_an_rek);
        mn_no_rek=findViewById(R.id.tv_con_det_no_rek);
        mn_wktu_tranf=findViewById(R.id.tv_con_det_waktu_tf);
        mn_harga=findViewById(R.id.tv_con_det_harga);
        mn_jenis_bank=findViewById(R.id.tv_con_det_nama_bank);
        mn_estimiasi_tiba=findViewById(R.id.tv_con_det_estimasi);
        mn_lokasi_jmpt=findViewById(R.id.tv_con_det_lok_jmput);
        mn_jam_jmput=findViewById(R.id.tv_con_det_jam_jemput);

    }

    public void getDetailConfirm(){
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

            mn_nama_akun.setText(bundle.getString("namaAkun"));
            mn_no_rek.setText(bundle.getString("noRek"));
            mn_jenis_bank.setText(bundle.getString("jenisBank"));
            mn_harga.setText(bundle.getString("jumlahBayar"));
            mn_wktu_tranf.setText(bundle.getString("waktubayar"));
            mn_lokasi_jmpt.setText(bundle.getString("lokasiBertemu"));
            mn_jam_jmput.setText(bundle.getString("jamAmbilBrg"));
            mn_estimiasi_tiba.setText(bundle.getString("estimasisampai"));




        }
    }
}