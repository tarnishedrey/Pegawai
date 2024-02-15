
package employee;

public class Internship extends Pekerja {
      public void lamakerja(){
        lamaKerja = 240;
        
    }
    public void bonus(){
        gaji = 5_000_000;
        
    }
    int potongan(int jam){
        if (jam >=240){
            jam = 240;
        }
        lamakerja();
        bonus();
        int total = gaji - lamaKerja;
        int potongan = gaji - (5_000*total);
        return potongan;
    }
}
