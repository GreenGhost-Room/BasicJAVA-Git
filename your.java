import java.util.Scanner;

public class your {
    public static void main(String[] args) {
        System.out.println("Y*X^n");
        Scanner sq=new Scanner(System.in);
        System.out.println("X: ");
        double x=sq.nextDouble();
        System.out.println("N: ");
        int n=sq.nextInt();
        double y=1;
        for(int i=1;i<=n;i++){
            y=y*x;
            System.out.println("Y: "+y);
        }
        System.out.println("Final Y: "+y);
        sq.close();

    }
    
}
