public class vararg {
    static int average(int ...arr){
        int sum=0;
        for(int element:arr){
            sum+=element;
        }
        int p=arr.length;
        return sum/p;
    }
    public static void main(String[] args) {
       System.out.println("average: "+average(67,78,56,23,56,7,8));
        
    }
    
    
}
