package latihanclass;

public class LatihanClass {
    
    public static void main(String[] args) {
        
        Hewan kucing = new Hewan();
        Hewan kelinci = new Hewan();
        Hewan semut = new Hewan ("hitam", "darat", "api", 4);
     
        
        kucing.habitat = "Darat";
        kucing.jenis = "Kampung";
        kucing.kaki = 4;
        kucing.warna = "oren";
        
        kelinci.habitat = "Darat";
        kelinci.jenis = "Kota";
        kelinci.kaki = 4;
        kelinci.warna = "Putih";
        
        kucing.suara("ngeooooong");
       
        
        System.out.println("Kucing");
        System.out.println("Habitat = " + kucing.habitat);
        System.out.println("Jenis = " + kucing.jenis);
        System.out.println("Kaki = " + kucing.kaki);
        System.out.println("Warna = " + kucing.warna);
        System.out.println(kucing.makanan ("ikan"));
        
        kelinci.suara("citcitcit");
        
        System.out.println("Kelinci");
        System.out.println("Habitat = " + kelinci.habitat);
        System.out.println("Jenis = " + kucing.jenis);
        System.out.println("Kaki = " + kucing.kaki);
        System.out.println("Warna = " + kucing.warna);
        System.out.println(kelinci.makanan ("Wortel"));
    }
    
}