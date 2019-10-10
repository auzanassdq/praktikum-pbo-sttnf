package latihanclass;


public class Hewan {
    
    
        String warna;
        String jenis;
        String habitat;
        int kaki;
        
        public Hewan(){
            
        }
        public Hewan(String warna, String habitat, String jenis, int kaki) {
            this.warna = warna;
            this.habitat = habitat;
            this.jenis = jenis;
            this.kaki = kaki;
        }
        
        public void suara (String suara){
            System.out.println(suara);
        }
        public String makanan(String makanan){
            String makanannya = "Makananya adalah" + makanan;
            return makanannya;
            
        
        }
        
            
        }
    

