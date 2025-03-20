class ProductArray{
    public static void main(String [] args){
        int arr[] = {1,2,3,4};
        int hel[] =productExcpetSelf(arr);
        for(int ele: hel){
            System.out.print(ele +" ");
        }

    }

    //brute force
    public static int[] productExcpetSelf(int arr[]){
        int n = arr.length;
        int res[] =new int[n];

        for(int i=0;i<n;i++){
            int res[i] = 1;

            for(int j=0;j<n;j++){
                if(i != j){
                    res[i] = arr[i] *arr[j];
                }
            }
        }

    
    }


    //optiised approach using prefix and suffix

    public int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        int[] ans= new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            suffix[i] = suffix[i+1] *nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            ans[i] = prefix[i] * suffix[i];        
            }
      return ans;
    }
}