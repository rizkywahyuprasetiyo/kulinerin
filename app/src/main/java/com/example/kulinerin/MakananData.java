package com.example.kulinerin;

import java.util.ArrayList;

public class MakananData {
    private static String[] namaMakanan = {
            "Sate Ayam",
            "Soto",
            "Pecel Lele",
            "Nasi Gorang",
            "Ayam Bakar",
            "Nasi Kebuli",
            "Bubur Pedas",
            "Kerupuk Basah",
            "Mie Ayam",
            "Nasi Uduk"
    };
    private static String[] alamatMakanan = {
            "Jalan Kom Yos Sudarso",
            "Jalan Teluk Barak",
            "Jalan Jendral Ahmad Yani",
            "Jalan Lintas Selatan",
            "Jalan Angkasa Pura",
            "Jalan R.A. Kartini",
            "Jalan Untung Sridadi",
            "Simpang Penjara",
            "Jalan KS Tubun",
            "Jalan Pantai Sibau"
    };
    private static int[] gambarMakanan = {
            R.drawable.sateayam,
            R.drawable.soto,
            R.drawable.pecellele,
            R.drawable.nasigoreng,
            R.drawable.ayambakar,
            R.drawable.nasikebuli,
            R.drawable.buburpedas,
            R.drawable.kerupukbasah,
            R.drawable.mieayam,
            R.drawable.nasiuduk
    };
    private static String[] hargaMakanan = {
            "Rp. 18.000",
            "Rp. 15.000",
            "Rp. 18.000",
            "Rp. 15.000",
            "Rp. 25.000",
            "Rp. 18.000",
            "Rp. 10.000",
            "Rp. 10.000",
            "Rp. 16.000",
            "Rp. 14.000"
    };
    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position <namaMakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setNama(namaMakanan[position]);
            makanan.setAlamat(alamatMakanan[position]);
            makanan.setHarga(hargaMakanan[position]);
            makanan.setPhoto(gambarMakanan[position]);
            list.add(makanan);
        }
        return list;
    }
}
