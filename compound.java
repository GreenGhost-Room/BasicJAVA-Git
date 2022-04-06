
import java.util.Scanner;
public class compound{
    public static void main(String[] args) {
        System.out.println("power of compunding");
        Scanner Sc=new Scanner(System.in);
        System.out.println("Invested");
        float invested=Sc.nextFloat();
        System.out.println("Time");
        int time=Sc.nextInt();
        System.out.println("Rate");
        float rate=Sc.nextFloat();
        float Rate=rate/100;
        for(int i=0; i<time; i++){
         Float   compound=invested+invested*Rate;
         invested=(Float)compound;
         System.out.println("compound");
         System.out.println(compound);
        
        }
        Sc.close();
    }
}