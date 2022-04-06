import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {
        System.out.println("encrypt&decrypt");
        Scanner gh=new Scanner(System.in);
        char grade='A';
        grade=(char)(grade+8);
        System.out.println("Encrypted:"+grade);
        System.out.println("Decrypted:"+(char)(grade-8));
        gh.close();

    }
    
}
