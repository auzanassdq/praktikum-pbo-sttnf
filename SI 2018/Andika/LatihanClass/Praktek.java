public class Praktek{

    public static void main(String[]args){

        Hewan kucing = new Hewan();
        Hewan kelinci = new Hewan();
        Hewan semut = new Hewan("Hitam", "Darat", "Api", 4);
        
        kucing.habitat = "Darat";
        kucing.jenis = "Kampung";
        kucing.kaki = 4;
        kucing.warna = "Oren";

        kelinci.habitat = "Darat";
        kelinci.jenis = "Gembul";
        kelinci.kaki = 4;
        kelinci.warna = "Putih";

        kucing.suara("ngeeeonng");

        System.out.println("Kucing");
        System.out.println("Habitat= " + kucing.habitat);
        System.out.println("Jenis = "+ kucing.jenis);
        System.out.println("Kaki = "+ kucing.kaki);
        System.out.println("Warna = "+ kucing.warna);
        System.out.println(kucing.makanan("Ikan"));

        System.out.print("\n");

        kelinci.suara("Citt Citttt");

        System.out.println("Kelinci");
        System.out.println("Habitat = "+ kelinci.habitat);
        System.out.println("Jenis = "+ kelinci.jenis);
        System.out.println("Kaki = "+ kelinci.kaki);
        System.out.println("Warna = "+ kelinci.warna);
        System.out.println(kelinci.makanan("Wortel"));

        
        semut.suara("Whooosshhhh");
        System.out.println(semut.warna);
        System.out.println(semut.jenis);
        System.out.println(semut.kaki);
        System.out.println(semut.habitat);

    }
}