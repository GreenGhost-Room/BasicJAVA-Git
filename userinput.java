
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) 
        
    {
        System.out.println("user input");
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter String");
           // boolean b=sc.hasNextInt();
           // System.out.println(b);
            //System.out.println("Enter number 2");
           // int b=sc.nextInt();
           // int sum=a+b;
           // System.out.println("sum of number");
           // System.out.println(sum);
           String s=sc.nextLine();
           System.out.println(s);
           sc.close();
        }
    
}
