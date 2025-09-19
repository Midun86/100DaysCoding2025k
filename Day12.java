import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String nama;
        int usia;
        String alamat;
        
        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine(); 
        System.out.print("Masukkan Usia Anda: ");
        usia = input.nextInt(); 
        input.nextLine();
        System.out.print("Masukkan Alamat Anda: ");
        alamat = input.nextLine(); 
        
        System.out.println("\n--- Data Biodata ---");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Alamat: " + alamat);
        
    }
}
