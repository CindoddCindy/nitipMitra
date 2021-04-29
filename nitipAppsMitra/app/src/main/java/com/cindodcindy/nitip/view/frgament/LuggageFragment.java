package com.cindodcindy.nitip.view.frgament;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cindodcindy.nitip.R;
import com.cindodcindy.nitip.pojo.pojo_bagasi.get_jasa.Content;
import com.cindodcindy.nitip.pojo.pojo_bagasi.get_jasa.NitipGetLuggageRespon;
import com.cindodcindy.nitip.retrofit.RetrofitHandle;
import com.cindodcindy.nitip.retrofit.RetrofitMethodHandle;
import com.cindodcindy.nitip.shared_pref.SpHandle;
import com.cindodcindy.nitip.view.adapter.LuggageAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LuggageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LuggageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    private RecyclerView recyclerView;
    private LuggageAdapter luggageAdapter;
    private List<Content> contentList = new ArrayList<>();
    private RetrofitMethodHandle retrofitMethodHandle;
    private SpHandle spHandle;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LuggageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LuggageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LuggageFragment newInstance(String param1, String param2) {
        LuggageFragment fragment = new LuggageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view= inflater.inflate(R.layout.fragment_luggage, container, false);

        spHandle = new SpHandle(getContext());

        recyclerView = view.findViewById(R.id.rv_lugg);
        luggageAdapter = new LuggageAdapter( contentList, getContext());
        recyclerView.setAdapter(luggageAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        sellerGetOwnLuggageList();

        return view;
    }


    public void sellerGetOwnLuggageList(){

        Long id = spHandle.getIdSeller();



        retrofitMethodHandle = RetrofitHandle.getRetrofitLink().create(RetrofitMethodHandle.class);
        Call<NitipGetLuggageRespon> getLuggageResponCall= retrofitMethodHandle.sellerGetOwnLuggage(id);
        getLuggageResponCall.enqueue(new Callback<NitipGetLuggageRespon>() {
            @Override
            public void onResponse(Call<NitipGetLuggageRespon> call, Response<NitipGetLuggageRespon> response) {

                if (response.isSuccessful()) {
                    List<Content> content = response.body().getContent();
                    luggageAdapter = new LuggageAdapter(content, getContext());
                    recyclerView.setAdapter(luggageAdapter);
                    luggageAdapter.notifyDataSetChanged();
                }
                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(getContext(), "404 not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(getContext(), "500 internal server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(getContext(), "401 unauthorized", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(getContext(), "unknown error", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }

            @Override
            public void onFailure(Call<NitipGetLuggageRespon> call, Throwable t) {
                Toast.makeText(getContext(), "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}