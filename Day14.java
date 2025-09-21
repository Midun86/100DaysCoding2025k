public class Main {
    
    public static void main(String[] args) {
        
        String strInt = "235";
        int angka = Integer.parseInt(strInt);
        System.out.println(angka);
        
        String strDouble = "3.67";
        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("doubleValue= " + doubleValue);
            
        String str_nilai = "18";
        float float_nilai = Float.parseFloat(str_nilai);
        System.out.println(float_nilai); 
        
        String strBoolean = "true";
        boolean booleanValue = Boolean.parseBoolean(strBoolean);
        System.out.println("booleanValue = " + booleanValue);
        
    }
    
}
