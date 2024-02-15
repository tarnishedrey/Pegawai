package employee;

import java.util.Scanner;

public class Pekerja {

    public static final Scanner sc = new Scanner(System.in);

    int lamaKerja = 0, gaji = 0, bonus = 0;

    void nama() {
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
    }

    void nip() {
        System.out.print("Masukkan NIP : ");
        int nip = sc.nextInt();
    }

    public static void fungsi() {
        System.out.print("Lama Bekerja : ");
        int jam = sc.nextInt();
        System.out.print("Masukkan Jabatan : ");
        String jabatan = sc.next();
        if (jabatan.equalsIgnoreCase("Boss")) {
            boss Boss = new boss();
            System.out.println("Gaji : " + Boss.potongan(jam));
        } else if (jabatan.equalsIgnoreCase("Manager")) {
            manager Manager = new manager();
            System.out.println("Gaji : " + Manager.potongan(jam));
        } else if (jabatan.equalsIgnoreCase("Cleaning Service")) {
            cleaningservice CS = new cleaningservice();
            System.out.println("Gaji : " + CS.potongan(jam));
        } else if (jabatan.equalsIgnoreCase("Cleaning Service")) {
            cleaningservice CS = new cleaningservice();
            System.out.println("Gaji : " + CS.potongan(jam));
        } else if (jabatan.equalsIgnoreCase("Internship")) {
            Internship IS = new Internship();
            System.out.println("Bonus : " + IS.potongan(jam));
        }
    }
}
