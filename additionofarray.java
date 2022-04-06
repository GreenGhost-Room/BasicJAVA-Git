public class additionofarray {
    public static void main(String[] args) {
        int [][] matrix1={
            {2,3,4},
            {7,8,9}
        };
        int [][] matrix2={
            {4,8,9},
            {8,5,10}
        };
        int [][]result={
            {0,0,0},
            {0,0,0}
        };
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
                
            }
            System.out.println("");
        }
        
    }
    
}
