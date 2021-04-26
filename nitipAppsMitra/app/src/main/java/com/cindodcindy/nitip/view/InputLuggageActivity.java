package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.cindodcindy.nitip.R;

public class InputLuggageActivity extends AppCompatActivity {

    private EditText editText_nama_penjual, editText_asal, editText_tujuan, editText_tanggal_berangkat, editText_jam_beraagkat,
    editText_tanggal_tiba, editText_jam_tiba, editText_kapasitas, editText_jenis_barang, editText_harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_luggage);

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
    }

    public void inputItem(){

    }
}