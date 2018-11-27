package com.daffzzaqihaq.rukunimandanislam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Recycle extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] nama, detail;
    int[] gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        nama = getResources().getStringArray(R.array.name);
        detail = getResources().getStringArray(R.array.detail);
        gambar = new int[]{R.drawable.syahadat, R.drawable.sholat, R.drawable.puasa, R.drawable.zakattt, R.drawable.haji};

        Adapter adapter = new Adapter(Recycle.this, gambar, nama, detail);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(Recycle.this));
        myRecyclerView.setAdapter(adapter);
    }
}

