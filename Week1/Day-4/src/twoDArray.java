public class twoDArray {

    public static void main(String[] args) {

        int[][] matrix={
                {1,2,3},
                {9,8,9},
                {7,8,9}
        };

        int maxSum=Integer.MIN_VALUE;
         int row_index=-1;

        for (int i = 0; i < matrix.length; i++) {

            int sum=0;
            for (int j = 0; j < matrix[i].length; j++) {

                sum+=matrix[i][j];
                
            }
            if (sum>maxSum){
                maxSum=sum;
                row_index=i+1;
            }
            
        }
        System.out.println("Row with maximum sum: "+row_index);
        System.out.println("Sum: "+maxSum);
    }
}
