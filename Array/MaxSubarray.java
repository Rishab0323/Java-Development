class MaxSubarray{
    public static void main(String[] args){
        int arr[] ={2, 3, -8, 7, -1, 2, 3};
        //.out.println(maxSum(arr));
        System.out.println(maxSubArray(arr));
    }

//brute force approach
//    public static int maxSum(int arr[]){
//         int max = 0;
//         for(int i=0;i<arr.length;i++){
//             int currSum = 0;
//             for(int j=i;j<arr.length;j++){
//                 currSum += arr[j];
//             }
//             if(currSum > max){
//                 max = currSum;
//             }
//         }
//         return max;   
//     }

    //optimised approach kadane algorithm
    public static int maxSubArray(int[] arr) {
        int max_sum = 0;
        int cur_sum = 0;
        for(int i=0;i<arr.length;i++){
            cur_sum += arr[i];
            if(cur_sum < 0){
                cur_sum = 0;
            }
            
            if(cur_sum > max_sum){
            max_sum = cur_sum;
            }
        }
        return max_sum;
    }
}