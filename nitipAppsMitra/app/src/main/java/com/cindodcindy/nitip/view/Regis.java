package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_regis_login.pojo_regis.NitipRegisRespon;
import com.cindodcindy.nitip.retrofit.RetrofitHandle;
import com.cindodcindy.nitip.retrofit.RetrofitMethodHandle;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Regis extends AppCompatActivity {
    private EditText editText_nama, editText_email, editText_phone, editText_password;

    private TextView textView_btn_regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        editText_nama=findViewById(R.id.et_regis_name);
        editText_email=findViewById(R.id.et_regis_email);
        editText_phone=findViewById(R.id.et_regis_phone);
        editText_password=findViewById(R.id.et_regis_password);

        textView_btn_regis=findViewById(R.id.tv_btn_regis);

        textView_btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText_nama.getText().toString().isEmpty()&&editText_email.getText().toString().isEmpty()&& editText_phone.getText().toString().isEmpty()&&editText_password.getText().toString().isEmpty()){
                    editText_nama.setError("nama belum diisi");
                    editText_email.setError("email belum diisi");
                    editText_phone.setError("nomor telepon belum diisi");
                    editText_password.setError("password belum diisi");


                }else {
                   // btnRegis();


                }

            }
        });
    }

    public void btnRegis(){

        String name = editText_nama.getText().toString();
        String email = editText_email.getText().toString();
        String phone = editText_phone.getText().toString();
        String password = editText_password.getText().toString();

        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("seller");
        jsonArray.add("seller");

        jsonObject.addProperty("name", name);
        jsonObject.addProperty("email",email );
        jsonObject.addProperty("phone", phone);
        jsonObject.addProperty("password", password);
        jsonObject.add("role", jsonArray);



        RetrofitMethodHandle retrofitMethodHandle =  RetrofitHandle.getRetrofitLink().create(RetrofitMethodHandle.class);
        Call<NitipRegisRespon> call= retrofitMethodHandle.sellerRegistration(jsonObject);
        call.enqueue(new Callback<NitipRegisRespon>() {
            @Override
            public void onResponse(Call<NitipRegisRespon> call, Response<NitipRegisRespon> response) {
                if(response.isSuccessful()){



                }

                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(Regis.this, " not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(Regis.this, "server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(Regis.this, " sorry can't authenticated, try again", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(Regis.this, "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<NitipRegisRespon> call, Throwable t) {
                Toast.makeText(Regis.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });




    }
}