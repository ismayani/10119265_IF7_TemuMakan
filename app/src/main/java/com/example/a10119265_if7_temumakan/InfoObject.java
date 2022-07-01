package com.example.a10119265_if7_temumakan;

// 10119265_IsmayaniSetyaningrum_IF7

import java.util.ArrayList;

public class InfoObject {
    int imgObject;
    String txInfo;

    public InfoObject(int ivObject, String txTips) {
        this.imgObject = ivObject;
        this.txInfo = txTips;
    }

    public static ArrayList<InfoObject> createData() {
        ArrayList<InfoObject> justObject = new ArrayList<>();
        justObject.add(new InfoObject(R.drawable.info_resto,"Memberikan Informasi Tempat Makan Favorit Terdekat dari Lokasi Mu"));
        justObject.add(new InfoObject(R.drawable.info_lokasi,"Memberikan Informasi Lokasi Mu saat Menggunakan Aplikasi"));
        return justObject;
    }
}

