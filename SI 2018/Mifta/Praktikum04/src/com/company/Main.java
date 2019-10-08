package com.company;

public class Main {

    public static void main(String[] args) {
	    Hewan kucing = new Hewan();
        Hewan kelinci = new Hewan();
        Hewan semut = new Hewan("merah", "darat", "api", 4);

        kucing.habitat = "darat";
        kucing.jenis = "kampung";
        kucing.kaki = 4;
        kucing.warna = "oren";

        kelinci.habitat = "darat";
        kelinci.jenis = "kota";
        kelinci.kaki = 4;
        kelinci.warna = "putih";


        kucing.suara("ngeeeeooooooong");


        System.out.println("Kucing");
        System.out.println("Habitat = " + kucing.habitat);
        System.out.println("Jenis = " + kucing.jenis);
        System.out.println("Kaki = " + kucing.kaki);
        System.out.println("Warna = " + kucing.warna);
        System.out.println(kucing.makanan("whiskas"));

        kelinci.suara("ciiiit");
        System.out.println("Kelinci");
        System.out.println("Habitat = " + kelinci.habitat);
        System.out.println("Jenis = " + kelinci.jenis);
        System.out.println("Kaki = " + kelinci.kaki);
        System.out.println("Warna = " + kelinci.warna);
        System.out.println(kelinci.makanan("wortel"));
    }
}
