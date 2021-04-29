package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_bagasi.post_jasa.NitipPostLuggageRespon;
import com.cindodcindy.nitip.pojo.pojo_regis_login.pojo_login.NitipLoginRespon;
import com.cindodcindy.nitip.retrofit.RetrofitHandle;
import com.cindodcindy.nitip.retrofit.RetrofitMethodHandle;
import com.cindodcindy.nitip.shared_pref.SpHandle;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InputLuggageActivity extends AppCompatActivity {

    private EditText editText_nama_penjual, editText_asal, editText_tujuan, editText_tanggal_berangkat, editText_jam_beraagkat,
    editText_tanggal_tiba, editText_jam_tiba, editText_kapasitas, editText_jenis_barang, editText_harga;

    private TextView textView_post_jasa_bgs;

    private SpHandle spHandle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_luggage);

        spHandle=new SpHandle(InputLuggageActivity.this);

        editText_nama_penjual=findViewById(R.id.et_input_lugg_nama_seller);
        editText_asal=findViewById(R.id.et_input_lugg_asal_keberangkatan);
        editText_tujuan=findViewById(R.id.et_input_lugg_tujuan_berangkat);
        editText_tanggal_berangkat=findViewById(R.id.et_input_lugg_tanggal_berangkat);
        editText_jam_beraagkat=findViewById(R.id.et_input_lugg_jam_berangkat);
        editText_tanggal_tiba=findViewById(R.id.et_input_lugg_tanggal_tiba);
        editText_jam_tiba=findViewById(R.id.et_input_lugg_jam_tiba);
        editText_kapasitas=findViewById(R.id.et_input_lugg_kapasitas_kg);
        editText_jenis_barang=findViewById(R.id.et_input_lugg_jenis_barang);
        editText_harga=findViewById(R.id.et_input_lugg_harga_bagasi);

        textView_post_jasa_bgs=findViewById(R.id.tv_post_lugg_jasa_btn);

        textView_post_jasa_bgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText_nama_penjual.getText().toString().isEmpty()&&editText_asal.getText().toString().isEmpty()&&editText_tujuan.getText().toString().isEmpty()&&
                editText_tanggal_berangkat.getText().toString().isEmpty()&&editText_jam_beraagkat.getText().toString().isEmpty()&& editText_tanggal_tiba.getText().toString().isEmpty()&&editText_jam_tiba.getText().toString().isEmpty()&& editText_kapasitas.getText().toString().isEmpty()&&editText_jenis_barang.getText().toString().isEmpty()&& editText_harga.getText().toString().isEmpty()
                ){
                    editText_nama_penjual.setError("Input Kosong");
                    editText_asal.setError("Input Kosong");
                    editText_tujuan.setError("Input Kosong");
                    editText_tanggal_berangkat.setError("Input Kosong");
                    editText_tanggal_tiba.setError("Input Kosong");
                    editText_jam_beraagkat.setError("Input Kosong");
                    editText_jam_tiba.setError("Input Kosong");
                    editText_kapasitas.setError("Input Kosong");
                    editText_jenis_barang.setError("Input Kosong");
                    editText_harga.setError("Input Kosong");




                }else {
                    // inputItem();


                }
            }
        });
    }

    public void inputItem(){

        String sellName = editText_nama_penjual.getText().toString();
        String fromAdd = editText_asal.getText().toString();
        String destination = editText_tujuan.getText().toString();
        String dateGo = editText_tanggal_berangkat.getText().toString();
        String dateArr = editText_tanggal_tiba.getText().toString();
        String timeGo = editText_jam_beraagkat.getText().toString();
        String timeArr = editText_jam_tiba.getText().toString();
        String heightLugg = editText_kapasitas.getText().toString();
        String typeLugg = editText_jenis_barang.getText().toString();
        String priceLugg = editText_harga.getText().toString();

        Long idSeller=spHandle.getIdSeller();

        JsonObject jsonObject = new JsonObject();

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
        jsonObject.addProperty("id_seller", idSeller);





        RetrofitMethodHandle retrofitMethodHandle =  RetrofitHandle.getRetrofitLink().create(RetrofitMethodHandle.class);
        Call<NitipPostLuggageRespon> nitipPostLuggageResponCall= retrofitMethodHandle.sellerPostJasa(idSeller,jsonObject);
        nitipPostLuggageResponCall.enqueue(new Callback<NitipPostLuggageRespon>() {
            @Override
            public void onResponse(Call<NitipPostLuggageRespon> call, Response<NitipPostLuggageRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(InputLuggageActivity.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(InputLuggageActivity.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(InputLuggageActivity.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(InputLuggageActivity.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipPostLuggageRespon> call, Throwable t) {
                Toast.makeText(InputLuggageActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}