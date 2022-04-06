public class reversearray {
    public static void main(String[] args) {
        int []num={67,89,90,34,23};
     /*   int []num2=new int[5];
        for(int i=4;i<=4;i--){
            num2[i]=num[i];
            System.out.println(num2[i]); 
           
        } */
        for(int i=0;i<(num.length)/2;i++){
            int temp;
            temp=num[i];
            num[i]=num[num.length-i-1];
            num[num.length-i-1]=temp;
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
    
}
