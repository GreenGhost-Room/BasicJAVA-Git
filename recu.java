/*public class recu {
    static int fac(int x){
        if(x==0||x==1){
            return 1;
        }
        else{
            return (x*fac(x-1));
        }
    }
    public static void main(String[] args) {
        int r=4;
        System.out.println(fac(r));
    }
    
}*/
public class recu {
    static int sum(int x){
        if(x==1){
            return 1;
        }
        else{
            return (x+sum(x-1));
        }
    }
    public static void main(String[] args) {
        int r=5;
        System.out.println(sum(r));
    }
    
}
