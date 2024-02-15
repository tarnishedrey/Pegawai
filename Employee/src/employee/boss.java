
package employee;

public class boss extends Pekerja {
    
    public void lamakerja(){
        lamaKerja = 240;
        
    }
    public void gaji(){
        gaji = 40_000_000;
        
    }
    int potongan(int jam){
        if (jam >=240){
            jam = 240;
        }
        lamakerja();
        gaji();
        int total = lamaKerja - jam;
        int potongan = gaji - (20_000*total);
        System.out.println("Potongan : "+(gaji - potongan));
        return potongan;
    }
}
