

public class sorted {
    public static void main(String[] args) {
        int []num={10,2,3,4,5,6};
        boolean isInArray=true;
        for(int i=0;i<6-1;i++){
            if(num[i]>num[i+1]){
                isInArray=false;
                break;
            }

        }
        if(isInArray){
             System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
      
    }
    
}
