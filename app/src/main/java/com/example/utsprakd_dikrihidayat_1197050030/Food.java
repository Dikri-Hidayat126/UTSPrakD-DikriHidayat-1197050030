package com.example.utsprakd_dikrihidayat_1197050030;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;

import java.io.File;

public class Food {
    String judul;
    String deskripsi;
    String harga;
    Drawable image;

    Food(String judul, String deskripsi, String harga, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}