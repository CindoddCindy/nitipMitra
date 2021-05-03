package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_done.pojo_post_done.NitipPostDoneRespon;
import com.cindodcindy.nitip.pojo.pojo_konfirm.pojo_post_confirm.NitipResponPostConfirm;
import com.cindodcindy.nitip.retrofit.RetrofitHandle;
import com.cindodcindy.nitip.retrofit.RetrofitMethodHandle;
import com.cindodcindy.nitip.shared_pref.SpHandle;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InputDoneActivity extends AppCompatActivity {

    private TextView textView_asal_barang, textView_tujuan_barang, textView_nama_pengirim, textView_nama_penerima,
            textView_jenis_barang, textView_berat_kg,

    textView_asal, textView_tujuan, textView_date_going, textView_date_arive,
            textView_time_going, textView_time_arrive, textView_nama_penjual, textView_harga, textView_barang_type, textView_kapasitas;


    private EditText editText_nama_penerima, editText_tanggal_diterima, editText_lokasi_diterima;

    private TextView textView_btn_post_input_done;

    private  TextView textView_buyer_An, textView_buyer_tf_buyer_bank, textView_buyer_tf_buyer_tf_date ,textView_buyer_tf_jumlah_harga;

    private EditText editText_seller_An, editText_seller_no_rek, editText_seller_bank, editText_seller_jumlah_harga;

    private SpHandle spHandle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_done);

        spHandle= new SpHandle(InputDoneActivity.this);

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

        textView_buyer_An=findViewById(R.id.tv_input_done_tf_by_nama_akun);
        textView_buyer_tf_buyer_tf_date=findViewById(R.id.tv_input_done_tf_by_tgal);
        textView_buyer_tf_jumlah_harga=findViewById(R.id.tv_input_done_tf_by_harga);
        textView_buyer_tf_buyer_bank=findViewById(R.id.tv_input_done_tf_by_bank_name);

        editText_nama_penerima=findViewById(R.id.et_input_done_nama_penerima);
        editText_tanggal_diterima=findViewById(R.id.et_input_done_tanggal_diterima);
        editText_lokasi_diterima=findViewById(R.id.et_input_done_lokasi_diterima);

        textView_btn_post_input_done=findViewById(R.id.tv_input_done_btn_input_done);

        textView_btn_post_input_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText_seller_An.getText().toString().isEmpty()&&
                        editText_seller_no_rek.getText().toString().isEmpty()&&
                        editText_seller_jumlah_harga.getText().toString().isEmpty()&&
                        editText_seller_bank.getText().toString().isEmpty()&&
                        editText_nama_penerima.getText().toString().isEmpty()&&
                        editText_tanggal_diterima.getText().toString().isEmpty()&&
                        editText_lokasi_diterima.getText().toString().isEmpty()


                ){
                    editText_seller_An.setError("Input Kosong");
                    editText_seller_no_rek.setError("Input Kosong");
                    editText_seller_no_rek.setError("Input Kosong");
                    editText_seller_jumlah_harga.setError("Input Kosong");
                    editText_seller_bank.setError("Input Kosong");
                    editText_nama_penerima.setError("Input Kosong");
                    editText_tanggal_diterima.setError("Input Kosong");
                    editText_lokasi_diterima.setError("Input Kosong");




                }else {
                    // inputItem();


                }
            }
        });



    }


    public void getDataFromPayment(){
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

            textView_asal_barang.setText(bundle.getString("asalBr"));
            textView_tujuan_barang.setText(bundle.getString("tujuanBr"));
            textView_nama_pengirim.setText(bundle.getString("pengirim"));
            textView_nama_penerima.setText(bundle.getString("penerima"));
            textView_jenis_barang.setText(bundle.getString("jenisBr"));
            textView_berat_kg.setText(bundle.getString("beratBr"));

            textView_buyer_An.setText(bundle.getString("namaPengirimUang"));
            textView_buyer_tf_buyer_tf_date.setText(bundle.getString("TanggalUangDikirim"));
            textView_buyer_tf_jumlah_harga.setText(bundle.getString("JumlahUangDikirim"));
            textView_buyer_tf_buyer_bank.setText(bundle.getString("BankPengirim"));
            //nanti edit text nya ambil d sp




        }
    }

    public void sendDoneToBuyer(){


        //jasa
        String sellName = textView_nama_penjual.getText().toString();
        String fromAdd = textView_asal.getText().toString();
        String destination = textView_tujuan.getText().toString();
        String dateGo = textView_date_going.getText().toString();
        String dateArr = textView_date_arive.getText().toString();
        String timeGo = textView_time_going.getText().toString();
        String timeArr = textView_time_arrive.getText().toString();
        String heightLugg = textView_kapasitas.getText().toString();
        String typeLugg = textView_jenis_barang.getText().toString();
        String priceLugg = textView_harga.getText().toString();

        //beli

        String asalBy = textView_asal_barang.getText().toString();
        String tujuanBy = textView_tujuan_barang.getText().toString();
        String pengirimBy = textView_nama_pengirim.getText().toString();
        String penerimaBy = textView_nama_penerima.getText().toString();
        String jenisBarangby = textView_jenis_barang.getText().toString();
        String beratbarangby = textView_berat_kg.getText().toString();


        //buyer data bank
        String buyAccountBank=textView_buyer_An.getText().toString();
        String buyPayLuggage=textView_buyer_tf_jumlah_harga.getText().toString();
        String buyBankType=textView_buyer_tf_buyer_bank.getText().toString();
        String buyDateTf=textView_buyer_tf_buyer_tf_date.getText().toString();



        //seler data bank
        String sellAcountBankName=editText_seller_An.getText().toString();
        String sellNoRek=editText_seller_no_rek.getText().toString();
        String sellHargaBayar=editText_seller_jumlah_harga.getText().toString();
        String sellBankType=editText_seller_bank.getText().toString();



        //barang tiba data

        String namaGetBrgArr=editText_nama_penerima.getText().toString();
        String dateBrgArr=editText_tanggal_diterima.getText().toString();
        String locBrgArr=editText_lokasi_diterima.getText().toString();

        Long idSeller=spHandle.getIdSeller();
        Long idBuyer=spHandle.getIdBuyer();

        JsonObject jsonObject = new JsonObject();

        //sell
        jsonObject.addProperty("penerimaAn",sellAcountBankName );
        jsonObject.addProperty("noRek",sellNoRek );
        jsonObject.addProperty("jenisBank", sellBankType);
        jsonObject.addProperty("jumlahUangSeller", sellHargaBayar);



        //buy pay
        jsonObject.addProperty("pengirimAn", buyAccountBank);
        jsonObject.addProperty("jumlahBayarBuyer",buyPayLuggage );
        jsonObject.addProperty("bankPengirim",buyBankType );
        jsonObject.addProperty("tanggalTransfer", buyDateTf);



        //brg arr
        jsonObject.addProperty("tanggalBarangTiba", dateBrgArr);
        jsonObject.addProperty("diterimaOleh", namaGetBrgArr);
        jsonObject.addProperty("lokasiBarangDiterima",locBrgArr );




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
        Call<NitipPostDoneRespon> doneResponCall= retrofitMethodHandle.sellerPostDoneToBuyer(idSeller,jsonObject);
        doneResponCall.enqueue(new Callback<NitipPostDoneRespon>() {
            @Override
            public void onResponse(Call<NitipPostDoneRespon> call, Response<NitipPostDoneRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(InputDoneActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(InputDoneActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(InputDoneActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(InputDoneActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipPostDoneRespon> call, Throwable t) {
                Toast.makeText(InputDoneActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });


    }


    public void sendDoneToMe(){

        //jasa
        String sellName = textView_nama_penjual.getText().toString();
        String fromAdd = textView_asal.getText().toString();
        String destination = textView_tujuan.getText().toString();
        String dateGo = textView_date_going.getText().toString();
        String dateArr = textView_date_arive.getText().toString();
        String timeGo = textView_time_going.getText().toString();
        String timeArr = textView_time_arrive.getText().toString();
        String heightLugg = textView_kapasitas.getText().toString();
        String typeLugg = textView_jenis_barang.getText().toString();
        String priceLugg = textView_harga.getText().toString();

        //beli

        String asalBy = textView_asal_barang.getText().toString();
        String tujuanBy = textView_tujuan_barang.getText().toString();
        String pengirimBy = textView_nama_pengirim.getText().toString();
        String penerimaBy = textView_nama_penerima.getText().toString();
        String jenisBarangby = textView_jenis_barang.getText().toString();
        String beratbarangby = textView_berat_kg.getText().toString();


        //buyer data bank
        String buyAccountBank=textView_buyer_An.getText().toString();
        String buyPayLuggage=textView_buyer_tf_jumlah_harga.getText().toString();
        String buyBankType=textView_buyer_tf_buyer_bank.getText().toString();
        String buyDateTf=textView_buyer_tf_buyer_tf_date.getText().toString();



        //seler data bank
        String sellAcountBankName=editText_seller_An.getText().toString();
        String sellNoRek=editText_seller_no_rek.getText().toString();
        String sellHargaBayar=editText_seller_jumlah_harga.getText().toString();
        String sellBankType=editText_seller_bank.getText().toString();



        //barang tiba data

        String namaGetBrgArr=editText_nama_penerima.getText().toString();
        String dateBrgArr=editText_tanggal_diterima.getText().toString();
        String locBrgArr=editText_lokasi_diterima.getText().toString();

        Long idSeller=spHandle.getIdSeller();
        Long idBuyer=spHandle.getIdBuyer();

        JsonObject jsonObject = new JsonObject();

        //sell
        jsonObject.addProperty("penerimaAn",sellAcountBankName );
        jsonObject.addProperty("noRek",sellNoRek );
        jsonObject.addProperty("jenisBank", sellBankType);
        jsonObject.addProperty("jumlahUangSeller", sellHargaBayar);



        //buy pay
        jsonObject.addProperty("pengirimAn", buyAccountBank);
        jsonObject.addProperty("jumlahBayarBuyer",buyPayLuggage );
        jsonObject.addProperty("bankPengirim",buyBankType );
        jsonObject.addProperty("tanggalTransfer", buyDateTf);



        //brg arr
        jsonObject.addProperty("tanggalBarangTiba", dateBrgArr);
        jsonObject.addProperty("diterimaOleh", namaGetBrgArr);
        jsonObject.addProperty("lokasiBarangDiterima",locBrgArr );




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
        Call<NitipPostDoneRespon> doneResponCall= retrofitMethodHandle.sellerPostDoneToOwnSeller(idSeller,jsonObject);
        doneResponCall.enqueue(new Callback<NitipPostDoneRespon>() {
            @Override
            public void onResponse(Call<NitipPostDoneRespon> call, Response<NitipPostDoneRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(InputDoneActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(InputDoneActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(InputDoneActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(InputDoneActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipPostDoneRespon> call, Throwable t) {
                Toast.makeText(InputDoneActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });



    }

    public void sendDoneToAdmin(){

        //jasa
        String sellName = textView_nama_penjual.getText().toString();
        String fromAdd = textView_asal.getText().toString();
        String destination = textView_tujuan.getText().toString();
        String dateGo = textView_date_going.getText().toString();
        String dateArr = textView_date_arive.getText().toString();
        String timeGo = textView_time_going.getText().toString();
        String timeArr = textView_time_arrive.getText().toString();
        String heightLugg = textView_kapasitas.getText().toString();
        String typeLugg = textView_jenis_barang.getText().toString();
        String priceLugg = textView_harga.getText().toString();

        //beli

        String asalBy = textView_asal_barang.getText().toString();
        String tujuanBy = textView_tujuan_barang.getText().toString();
        String pengirimBy = textView_nama_pengirim.getText().toString();
        String penerimaBy = textView_nama_penerima.getText().toString();
        String jenisBarangby = textView_jenis_barang.getText().toString();
        String beratbarangby = textView_berat_kg.getText().toString();


        //buyer data bank
        String buyAccountBank=textView_buyer_An.getText().toString();
        String buyPayLuggage=textView_buyer_tf_jumlah_harga.getText().toString();
        String buyBankType=textView_buyer_tf_buyer_bank.getText().toString();
        String buyDateTf=textView_buyer_tf_buyer_tf_date.getText().toString();



        //seler data bank
        String sellAcountBankName=editText_seller_An.getText().toString();
        String sellNoRek=editText_seller_no_rek.getText().toString();
        String sellHargaBayar=editText_seller_jumlah_harga.getText().toString();
        String sellBankType=editText_seller_bank.getText().toString();



        //barang tiba data

        String namaGetBrgArr=editText_nama_penerima.getText().toString();
        String dateBrgArr=editText_tanggal_diterima.getText().toString();
        String locBrgArr=editText_lokasi_diterima.getText().toString();

        Long idSeller=spHandle.getIdSeller();
        Long idBuyer=spHandle.getIdBuyer();

        JsonObject jsonObject = new JsonObject();

        //sell
        jsonObject.addProperty("penerimaAn",sellAcountBankName );
        jsonObject.addProperty("noRek",sellNoRek );
        jsonObject.addProperty("jenisBank", sellBankType);
        jsonObject.addProperty("jumlahUangSeller", sellHargaBayar);



        //buy pay
        jsonObject.addProperty("pengirimAn", buyAccountBank);
        jsonObject.addProperty("jumlahBayarBuyer",buyPayLuggage );
        jsonObject.addProperty("bankPengirim",buyBankType );
        jsonObject.addProperty("tanggalTransfer", buyDateTf);



        //brg arr
        jsonObject.addProperty("tanggalBarangTiba", dateBrgArr);
        jsonObject.addProperty("diterimaOleh", namaGetBrgArr);
        jsonObject.addProperty("lokasiBarangDiterima",locBrgArr );




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
        Call<NitipPostDoneRespon> doneResponCall= retrofitMethodHandle.sellerPostDoneToAdmin(idSeller,jsonObject);
        doneResponCall.enqueue(new Callback<NitipPostDoneRespon>() {
            @Override
            public void onResponse(Call<NitipPostDoneRespon> call, Response<NitipPostDoneRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(InputDoneActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(InputDoneActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(InputDoneActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(InputDoneActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipPostDoneRespon> call, Throwable t) {
                Toast.makeText(InputDoneActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });



    }

}