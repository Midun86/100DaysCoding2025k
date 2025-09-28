public class Main {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);

        // Proses penukaran nilai
        a = a + b; // a menjadi 15
        b = a - b; // b menjadi 15 - 10 = 5
        a = a - b; // a menjadi 15 - 5 = 10

        System.out.println("Setelah ditukar: a = " + a + ", b = " + b);
    }
}
        
        
        
    
    

