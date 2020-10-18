package Kambing;

public class Kambing {

    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
   
    public static void main(String[] args) {
       Kambing kambingJantan = new Kambing();
       kambingJantan.tambahKambing();    
                
        
    }
    
}
