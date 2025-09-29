import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();
        
        int luas = sisi * sisi;
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas + " cm persegi.");
        
    }
    
}
