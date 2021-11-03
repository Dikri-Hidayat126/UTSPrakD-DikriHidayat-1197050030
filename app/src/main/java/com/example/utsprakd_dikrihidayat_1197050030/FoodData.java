package com.example.utsprakd_dikrihidayat_1197050030;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Nasi Goreng", "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk", "Rp. 15000", context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Cireng", "Cireng adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka.", "Rp. 1000", context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut", "Donat adalah penganan yang digoreng, dibuat dari adonan tepung terigu, gula, telur, dan mentega. Donat yang paling umum adalah donat berbentuk cincin dengan lubang di tengah dan donat berbentuk bundar dengan isian manis, seperti selai, jelly, krim, dan custard.", "Rp.3000", context.getDrawable(R.drawable.donut)));
        list.add(new Food("Mie Goreng", "Mie Goreng adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura. Mi goreng terbuat dari mi kuning yang digoreng dengan sedikit minyak goreng, dan ditambahkan bawang putih, bawang merah, udang serta daging ayam atau daging sapi, irisan bakso, cabai, sayuran, tomat, telur ayam, dan acar.","Rp. 7000", context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Batagor", "Batagor merupakan jajanan khas Bandung yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia. Secara umum, batagor dibuat dari tahu yang dilembutkan dan diisi dengan adonan berbahan ikan tenggiri[2] dan tepung tapioka lalu dibentuk menyerupai bola yang digoreng dalam minyak panas selama beberapa menit hingga matang. ", "Rp. 5000", context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Black Salad adalah makanan baru yang banyak diminati, dinamakan black salad Karena ada kandungan charcoal yang memiliki fungsi yang baik untuk tubuh kita, antara lain mencegah kembung dan menurunkan kolesterol.", "Rp. 25000", context.getDrawable(R.drawable.black_salad)));

        return list;
    }
}