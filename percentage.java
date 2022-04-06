import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("Percentage calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Physics Marks");
        float Physics=sc.nextFloat();
        System.out.println("Chemistry marks");
        float Chemistry=sc.nextFloat();
        System.out.println("Math marks");
        float Math=sc.nextFloat();
        float Total=Physics+Chemistry+Math;
        float Percentage = (float)((Total/300)*100);
        System.out.println("Total percentage");
        System.out.println(Percentage);
        sc.close();

        
    }
    
}
