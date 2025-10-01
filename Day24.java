import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double jariJari, luas;
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = input.nextDouble();
        
        luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);

    }
    
}
