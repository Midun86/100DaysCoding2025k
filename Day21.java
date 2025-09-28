public class Main {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //1.simpan nila 'a' ke variabel sementara 'temp'
        int temp =a;
        //2.simapan nila 'b'ke 'a'
        a=b;
        //3.simpan nilai 'temp' ( nilai asli 'a' ) ke 'b' 
        b=temp;
        
        System.out.println("\nsetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
    
}
