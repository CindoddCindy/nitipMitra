package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_bagasi.post_jasa.NitipPostLuggageRespon;
import com.cindodcindy.nitip.pojo.pojo_konfirm.pojo_post_confirm.NitipResponPostConfirm;
import com.cindodcindy.nitip.retrofit.RetrofitHandle;
import com.cindodcindy.nitip.retrofit.RetrofitMethodHandle;
import com.cindodcindy.nitip.shared_pref.SpHandle;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InputConfirmActivity extends AppCompatActivity {

    private TextView textView_by_asal_barang, textView_by_tujuan_barang, textView_by_nama_pengirim, textView_by_nama_penerima,
            textView_by_jenis_barang, textView_by_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas;


    private EditText editText_order, editText_nama_akun, editText_no_rek, editText_jenis_bank, editText_tranf_sebelum,
            editText_lokasi_jmpt, editText_jam_jmeput,editText_estimiasi_tiba, editText_jumlahBayar;



    private TextView textView_btn_confirm;

    private SpHandle spHandle;


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

        spHandle=new SpHandle(InputConfirmActivity.this);

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
        editText_jumlahBayar=findViewById(R.id.et_confirm_harga);


        textView_btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText_order.getText().toString().isEmpty()&&
                        editText_nama_akun.getText().toString().isEmpty()&&
                        editText_no_rek.getText().toString().isEmpty()&&
                        editText_jenis_bank.getText().toString().isEmpty()&&
                        editText_jumlahBayar.getText().toString().isEmpty()&&
                        editText_tranf_sebelum.getText().toString().isEmpty()&&
                        editText_lokasi_jmpt.getText().toString().isEmpty()&&
                        editText_jam_jmeput.getText().toString().isEmpty()&&
                        editText_estimiasi_tiba.getText().toString().isEmpty()


                ){
                    editText_order.setError("Input Kosong");
                    editText_nama_akun.setError("Input Kosong");
                    editText_no_rek.setError("Input Kosong");
                    editText_jenis_bank.setError("Input Kosong");
                    editText_jumlahBayar.setError("Input Kosong");
                    editText_tranf_sebelum.setError("Input Kosong");
                    editText_lokasi_jmpt.setError("Input Kosong");
                    editText_jam_jmeput.setError("Input Kosong");
                    editText_estimiasi_tiba.setError("Input Kosong");




                }else {
                    // inputItem();


                }
            }
        });
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

    public void postConfirmToMe(){
        //jasa
        String sellName = textView_nama_penjual.getText().toString();
        String fromAdd = textView_asal.getText().toString();
        String destination = textView_tujuan.getText().toString();
        String dateGo = textView_date_going.getText().toString();
        String dateArr = textView_date_arive.getText().toString();
        String timeGo = textView_time_going.getText().toString();
        String timeArr = textView_time_arrive.getText().toString();
        String heightLugg = textView_kapasitas.getText().toString();
        String typeLugg = textView_by_jenis_barang.getText().toString();
        String priceLugg = textView_harga.getText().toString();

        //beli

        String asalBy = textView_by_asal_barang.getText().toString();
        String tujuanBy = textView_by_tujuan_barang.getText().toString();
        String pengirimBy = textView_by_nama_pengirim.getText().toString();
        String penerimaBy = textView_by_nama_penerima.getText().toString();
        String jenisBarangby = textView_by_jenis_barang.getText().toString();
        String beratbarangby = textView_by_berat_kg.getText().toString();


        //confirm
        String orderConf = editText_order.getText().toString();
        String wktuBayar=editText_tranf_sebelum.getText().toString();
        String namaAkun=editText_nama_akun.getText().toString();
        String noRek=editText_no_rek.getText().toString();
        String jenisBank=editText_jenis_bank.getText().toString();
        String jumlahBayar=editText_jumlahBayar.getText().toString();
        String lokasijemput=editText_lokasi_jmpt.getText().toString();
        String jamJemput=editText_jam_jmeput.getText().toString();
        String estimasiTiba=editText_estimiasi_tiba.getText().toString();


        Long idSeller=spHandle.getIdSeller();
        Long idBuyer=spHandle.getIdBuyer();

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("orderConfirmation",orderConf );
        jsonObject.addProperty("waktuPembayaran",wktuBayar);
        jsonObject.addProperty("namaAkun", namaAkun);
        jsonObject.addProperty("noRek", noRek);
        jsonObject.addProperty("jenisBank", jenisBank);
        jsonObject.addProperty("jumlahBayar", jumlahBayar);
        jsonObject.addProperty("lokasiJemputbarang",lokasijemput );
        jsonObject.addProperty("jamJemputBarang",jamJemput);
        jsonObject.addProperty("estimasiSampai",estimasiTiba );

        jsonObject.addProperty("id_seller", idSeller);
        jsonObject.addProperty("id_buyer", idBuyer);





        jsonObject.addProperty("namaPembeli",pengirimBy );
        jsonObject.addProperty("alamatPembeli",asalBy);
        jsonObject.addProperty("alamatPenerima",tujuanBy );
        jsonObject.addProperty("namaPenerima",penerimaBy );
        jsonObject.addProperty("jenisBarangKirim",jenisBarangby );
        jsonObject.addProperty("kapasitasBarang",beratbarangby );


        jsonObject.addProperty("namaPenjual", sellName);
        jsonObject.addProperty("asal", fromAdd);
        jsonObject.addProperty("tujuan", destination);
        jsonObject.addProperty("tanggalBerangkat", dateGo);
        jsonObject.addProperty("jamBerangkat", timeGo);
        jsonObject.addProperty("tanggalTiba", dateArr);
        jsonObject.addProperty("jamTiba", timeArr);
        jsonObject.addProperty("kapasitas", heightLugg);
        jsonObject.addProperty("jenisBarang", typeLugg);
        jsonObject.addProperty("hargaBagasi", priceLugg);


        RetrofitMethodHandle retrofitMethodHandle =  RetrofitHandle.getRetrofitLink().create(RetrofitMethodHandle.class);
        Call<NitipResponPostConfirm> postConfirmCall= retrofitMethodHandle.sellerPostConfirmToOwn(idSeller,jsonObject);
        postConfirmCall.enqueue(new Callback<NitipResponPostConfirm>() {
            @Override
            public void onResponse(Call<NitipResponPostConfirm> call, Response<NitipResponPostConfirm> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(InputConfirmActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(InputConfirmActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(InputConfirmActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(InputConfirmActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipResponPostConfirm> call, Throwable t) {
                Toast.makeText(InputConfirmActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });

    }


    public void postConfirmToBuyer(){

        //jasa
        String sellName = textView_nama_penjual.getText().toString();
        String fromAdd = textView_asal.getText().toString();
        String destination = textView_tujuan.getText().toString();
        String dateGo = textView_date_going.getText().toString();
        String dateArr = textView_date_arive.getText().toString();
        String timeGo = textView_time_going.getText().toString();
        String timeArr = textView_time_arrive.getText().toString();
        String heightLugg = textView_kapasitas.getText().toString();
        String typeLugg = textView_by_jenis_barang.getText().toString();
        String priceLugg = textView_harga.getText().toString();

        //beli

        String asalBy = textView_by_asal_barang.getText().toString();
        String tujuanBy = textView_by_tujuan_barang.getText().toString();
        String pengirimBy = textView_by_nama_pengirim.getText().toString();
        String penerimaBy = textView_by_nama_penerima.getText().toString();
        String jenisBarangby = textView_by_jenis_barang.getText().toString();
        String beratbarangby = textView_by_berat_kg.getText().toString();


        //confirm
        String orderConf = editText_order.getText().toString();
        String wktuBayar=editText_tranf_sebelum.getText().toString();
        String namaAkun=editText_nama_akun.getText().toString();
        String noRek=editText_no_rek.getText().toString();
        String jenisBank=editText_jenis_bank.getText().toString();
        String jumlahBayar=editText_jumlahBayar.getText().toString();
        String lokasijemput=editText_lokasi_jmpt.getText().toString();
        String jamJemput=editText_jam_jmeput.getText().toString();
        String estimasiTiba=editText_estimiasi_tiba.getText().toString();


        Long idSeller=spHandle.getIdSeller();
        Long idBuyer=spHandle.getIdBuyer();

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("orderConfirmation",orderConf );
        jsonObject.addProperty("waktuPembayaran",wktuBayar);
        jsonObject.addProperty("namaAkun", namaAkun);
        jsonObject.addProperty("noRek", noRek);
        jsonObject.addProperty("jenisBank", jenisBank);
        jsonObject.addProperty("jumlahBayar", jumlahBayar);
        jsonObject.addProperty("lokasiJemputbarang",lokasijemput );
        jsonObject.addProperty("jamJemputBarang",jamJemput);
        jsonObject.addProperty("estimasiSampai",estimasiTiba );

        jsonObject.addProperty("id_seller", idSeller);
        jsonObject.addProperty("id_buyer", idBuyer);





        jsonObject.addProperty("namaPembeli",pengirimBy );
        jsonObject.addProperty("alamatPembeli",asalBy);
        jsonObject.addProperty("alamatPenerima",tujuanBy );
        jsonObject.addProperty("namaPenerima",penerimaBy );
        jsonObject.addProperty("jenisBarangKirim",jenisBarangby );
        jsonObject.addProperty("kapasitasBarang",beratbarangby );


        jsonObject.addProperty("namaPenjual", sellName);
        jsonObject.addProperty("asal", fromAdd);
        jsonObject.addProperty("tujuan", destination);
        jsonObject.addProperty("tanggalBerangkat", dateGo);
        jsonObject.addProperty("jamBerangkat", timeGo);
        jsonObject.addProperty("tanggalTiba", dateArr);
        jsonObject.addProperty("jamTiba", timeArr);
        jsonObject.addProperty("kapasitas", heightLugg);
        jsonObject.addProperty("jenisBarang", typeLugg);
        jsonObject.addProperty("hargaBagasi", priceLugg);


        RetrofitMethodHandle retrofitMethodHandle =  RetrofitHandle.getRetrofitLink().create(RetrofitMethodHandle.class);
        Call<NitipResponPostConfirm> postConfirmCall= retrofitMethodHandle.sellerPostConfirmToBuyer(idSeller,jsonObject);
        postConfirmCall.enqueue(new Callback<NitipResponPostConfirm>() {
            @Override
            public void onResponse(Call<NitipResponPostConfirm> call, Response<NitipResponPostConfirm> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(InputConfirmActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(InputConfirmActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(InputConfirmActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(InputConfirmActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipResponPostConfirm> call, Throwable t) {
                Toast.makeText(InputConfirmActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });


    }

    public void sendKonfirm(){

    }
}