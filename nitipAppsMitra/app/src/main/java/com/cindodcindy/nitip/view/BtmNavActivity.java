package com.cindodcindy.nitip.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.view.frgament.BookingFragment;
import com.cindodcindy.nitip.view.frgament.ConfirmationFragment;
import com.cindodcindy.nitip.view.frgament.DoneFragment;
import com.cindodcindy.nitip.view.frgament.LuggageFragment;
import com.cindodcindy.nitip.view.frgament.PaymentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BtmNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btm_nav);

        //Menampilkan halaman Fragment yang pertama kali muncul
        getFragmentPage(new LuggageFragment());

        /*Inisialisasi BottomNavigationView beserta listenernya untuk
         *menangkap setiap kejadian saat salah satu menu item diklik
         */
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.luggage:
                        fragment = new LuggageFragment();
                        break;

                    case R.id.booking:
                        fragment = new BookingFragment();
                        break;
                    case R.id.confirmation:
                        fragment = new ConfirmationFragment();
                        break;
                    case R.id.payments:
                        fragment = new PaymentFragment();
                        break;


                    case R.id.done:
                        fragment = new DoneFragment();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
    }

    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}