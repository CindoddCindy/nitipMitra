package com.cindodcindy.nitip.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_payment.get_payement.Content;
import com.cindodcindy.nitip.retrofit.RetrofitMethodHandle;
import com.cindodcindy.nitip.shared_pref.SpHandle;
import com.cindodcindy.nitip.view.adapter.PaymentAdapter;

import java.util.ArrayList;
import java.util.List;

public class MoneyListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PaymentAdapter paymentAdapter;
    private List<Content> contentList = new ArrayList<>();
    private RetrofitMethodHandle retrofitMethodHandle;
    private SpHandle spHandle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_list);
    }
}