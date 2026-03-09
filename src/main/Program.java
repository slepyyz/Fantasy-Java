package main;


public class Program {
    
    public static void main(String[] args) {
        Sarkany s1 = new Sarkany(100,"Tűz",300);
        Sarkany s2 = new Sarkany(80,"Jég",200);
        Sarkany s3 = new Sarkany(50,"Jég",100);
        
        System.out.println(s1.allapot());
        System.out.println("");
        System.out.println(s2.allapot());
        System.out.println("");
        System.out.println(s3.allapot());
        System.out.println("");
        
        System.out.println("s2.egyformaElem(s3) --> "+ s2.egyformaElem(s3));
        
        //tesztek
        HaHiba(!(s2.egyformaElem(s3)), "HIBA!");
        HaHiba(!s2.egyformaElem(s2), "HIBA!");
        
        s3.varazslas("Föld");
        HaHiba(s2.egyformaElem(s3), "HIBA!");
        System.out.println("\n");
        System.out.println(s3.allapot());
        
    }
    
    public static void HaHiba(boolean feltetel, String uzenet){
        if (feltetel) {
            System.out.println(uzenet);
        }
    }
}