package com.example.kulinerin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvMakanan;
    private ImageView btnProfile;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProfile = (ImageView) findViewById(R.id.btn_profil);
        btnProfile.setOnClickListener(this);
        rvMakanan = findViewById(R.id.rv_makanan);
        rvMakanan.setHasFixedSize(true);
        list.addAll(MakananData.getListData());
        showRecyclerCardView();
    }

    @Override
    public void onClick(View v){
        Intent profile;

        switch (v.getId()){
            case R.id.btn_profil : profile = new Intent(this, ActivityProfile.class); startActivity(profile); break;
            default:break;
        }
    }

    private void showRecyclerCardView(){
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        CardViewMakananAdapter cardViewHeroAdapter = new CardViewMakananAdapter(list);
        rvMakanan.setAdapter(cardViewHeroAdapter);
        cardViewHeroAdapter.setOnItemClickCallback(new CardViewMakananAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Makanan data) {
                Intent moveIntent = new Intent(MainActivity.this, Detail.class);
                moveIntent.putExtra(Detail.EXTRA_NAMA, data.getNama());
                moveIntent.putExtra(Detail.EXTRA_ALAMAT, data.getAlamat());
                moveIntent.putExtra(Detail.EXTRA_HARGA, data.getHarga());
                moveIntent.putExtra(Detail.EXTRA_GAMBAR, data.getPhoto());
                startActivity(moveIntent);
            }
        });
    }

}
