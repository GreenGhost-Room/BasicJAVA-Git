public class logic {
    static int brain(int x, int y){
        int z;
        if(x>y){
            z=x*y;
        }
        else{
            z=y-x;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=9;
        int b=45;
       // logic lg=new logic();
      //  int c=lg.brain(a,b);
      int c=brain(a,b);
        System.out.println(c);
    }
    
}
