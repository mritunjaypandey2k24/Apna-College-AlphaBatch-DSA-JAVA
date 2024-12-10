public class max_subarray_sum_kadanes_algorithm {

    public static void kadanes( int num []){

        int currSum = 0;
        int maxSum  = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            currSum = currSum + num[i];
            
            maxSum = Math.max(currSum , maxSum); 
            //writing above line before making the currsum = 0; This ensures that the maxsum get the value of currsum even if it negative
            // eg for test case num = [-1]
            //with this approach we can get the maxsum = -1

            if (currSum < 0){
                currSum = 0;
            }
            System.out.println(maxSum);
        }
        System.out.println("Max sum is : " + maxSum);
    }

    public static void main(String args[]) {

        int num[] = {-1,-2,-3,4};


        kadanes(num);


        
    }
    
}
