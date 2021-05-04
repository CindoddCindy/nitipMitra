package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_money.pojo_get_money.Content;
import com.cindodcindy.nitip.pojo.pojo_money.pojo_get_money.NitipGetMoneyRespon;
import com.cindodcindy.nitip.retrofit.RetrofitHandle;
import com.cindodcindy.nitip.retrofit.RetrofitMethodHandle;
import com.cindodcindy.nitip.shared_pref.SpHandle;
import com.cindodcindy.nitip.view.adapter.MoneyAdapter;
import com.cindodcindy.nitip.view.adapter.PaymentAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoneyListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MoneyAdapter moneyAdapter;
    private List<com.cindodcindy.nitip.pojo.pojo_money.pojo_get_money.Content> contentList = new ArrayList<>();
    private RetrofitMethodHandle retrofitMethodHandle;
    private SpHandle spHandle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_list);

        recyclerView = findViewById(R.id.rv_get_money);
        moneyAdapter = new MoneyAdapter( contentList, MoneyListActivity.this);
        recyclerView.setAdapter(moneyAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MoneyListActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        sellerGetPayment();
    }

    public void sellerGetPayment(){

        Long id = spHandle.getIdSeller();

        retrofitMethodHandle = RetrofitHandle.getRetrofitLink().create(RetrofitMethodHandle.class);
        Call<NitipGetMoneyRespon> getMoneyResponCall= retrofitMethodHandle.sellerGetMoney(id);
        getMoneyResponCall.enqueue(new Callback<NitipGetMoneyRespon>() {
            @Override
            public void onResponse(Call<NitipGetMoneyRespon> call, Response<NitipGetMoneyRespon> response) {

                if (response.isSuccessful()) {
                    List<Content> content = response.body().getContent();
                    moneyAdapter = new MoneyAdapter(content, MoneyListActivity.this);
                    recyclerView.setAdapter(moneyAdapter);
                    moneyAdapter.notifyDataSetChanged();
                }
                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(MoneyListActivity.this, "404 not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(MoneyListActivity.this, "500 internal server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(MoneyListActivity.this, "401 unauthorized", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(MoneyListActivity.this, "unknown error", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }

            @Override
            public void onFailure(Call<NitipGetMoneyRespon> call, Throwable t) {
                Toast.makeText(MoneyListActivity.this, "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}