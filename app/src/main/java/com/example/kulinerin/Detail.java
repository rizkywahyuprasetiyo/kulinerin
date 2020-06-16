package com.example.kulinerin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {
    private ImageView imgPhoto;
    private TextView tvNama, tvAlamat, tvHarga;
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_ALAMAT = "extra_alamat";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_GAMBAR = "extra_gambar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String alamat = getIntent().getStringExtra(EXTRA_ALAMAT);
        String harga = getIntent().getStringExtra(EXTRA_HARGA);
        int gambar = getIntent().getIntExtra(EXTRA_GAMBAR, 0);
        setContentView(R.layout.activity_detail);
        imgPhoto = findViewById(R.id.img_photo);
        tvNama = findViewById(R.id.tv_item_makanan);
        tvAlamat = findViewById(R.id.tv_item_alamat);
        tvHarga = findViewById(R.id.tv_item_harga);
        Glide.with(this)
                .load(gambar)
                .into(imgPhoto);
        tvNama.setText(nama);
        tvAlamat.setText(alamat);
        tvHarga.setText(harga);
    }
}
