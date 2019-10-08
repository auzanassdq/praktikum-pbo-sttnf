package com.company;

public class Main {

    public static void main(String[] args) {

        Hewan kucing = new Hewan();
        Hewan kelinci = new Hewan();
        Hewan semut = new Hewan( "hitam", "darat", "api", 4);

        kucing.habitat = "Darat";
        kucing.jenis = "Kampung";
        kucing.kaki = 4;
        kucing.warna = "Oren";

        kelinci.habitat = "Air";
        kelinci.jenis = "Kota";
        kelinci.kaki = 4;
        kelinci.warna = "Putih";

        kucing.suara("ngeeeooooongg");

        System.out.println("Kucing");
        System.out.println("Habitat = " + kucing.habitat);
        System.out.println("Jenis = " + kucing.jenis);
        System.out.println("Kaki = " + kucing.kaki);
        System.out.println("Warna = " + kucing.warna);
        System.out.println(kucing.makanan("Ikan"));

        System.out.println();

        System.out.println("Kelinci");
        kelinci.suara("ciiiiitttt");
        System.out.println("Habitat = " + kelinci.habitat);
        System.out.println("Jenis = " + kelinci.jenis);
        System.out.println("Kaki = " + kelinci.kaki);
        System.out.println("Warna = " + kelinci.warna);

        System.out.println();

        System.out.println("Semut");
        System.out.println("Habitat = " + semut.habitat);
        System.out.println("Jenis = " + semut.jenis);
        System.out.println("Kaki = " + semut.kaki);
        System.out.println("Warna = " + semut.warna);
        System.out.println(semut.makanan("gula"));



    }
}
