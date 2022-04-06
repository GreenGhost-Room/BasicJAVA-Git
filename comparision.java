import java.util.Scanner;

public class comparision {
    public static void main(String[] args) {
        byte num=12;
        Scanner gh=new Scanner(System.in);
        System.out.println("type numper");
        byte num1=gh.nextByte();
        if(num1>num){
            System.out.println("greater");
        }
        else{
            System.out.println("less");
        }
        gh.close();

    }
    
}
