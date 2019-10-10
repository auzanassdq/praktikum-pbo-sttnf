package com.company;

public class Main {

    public static void main(String[] args) {
        Hewan kucing    = new Hewan();
        Hewan kelinci   = new Hewan();
        Hewan gajah     = new Hewan("biru","hutan", "albino", 4);

        kucing.habitat  = "Darat";
        kucing.jenis    = "Kampung";
        kucing.kaki     = 4;
        kucing.warna    = "Oren";

        kelinci.habitat = "Darat";
        kelinci.jenis   = "Kota";
        kelinci.kaki    = 4;
        kelinci.warna   = "Putih";

        kucing.suara("ngeeeooooong");
        String makananKucing = kucing.makanan("ikan");
        System.out.println("Kucing");
        System.out.println("Habitat = " + kucing.habitat);
        System.out.println("jenis   = " + kucing.jenis);
        System.out.println("kaki    = " + kucing.kaki);
        System.out.println("warna   = " + kucing.warna);
        System.out.println("Makanannya = " + makananKucing);

        kelinci.suara("wkwkwkwkwkw");
        String makananKelinci = kelinci.makanan("Wortel");
        System.out.println("Kelinci");
        System.out.println("Habitat = " + kelinci.habitat);
        System.out.println("jenis   = " + kelinci.jenis);
        System.out.println("kaki    = " + kelinci.kaki);
        System.out.println("warna   = " + kelinci.warna);
        System.out.println("Makanannya = " + makananKelinci);
    }
}
