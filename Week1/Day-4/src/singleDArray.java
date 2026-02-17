public class singleDArray {
    public static void main(String[] args){
        int[] arr={12,29,14,15,34,17};

        if (arr.length<2){
            System.out.println("Not Available");
            return;
        }
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];

            } else if (arr[i]> secondLargest && arr[i]!=largest) {
                secondLargest=arr[i];
            }

        }

        if (secondLargest==Integer.MIN_VALUE){
            System.out.println("Not Available");
        }

        else{
            System.out.println("Second Largest element is: "+secondLargest);
        }


    }
}
