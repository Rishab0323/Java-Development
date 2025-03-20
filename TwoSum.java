//leecode problem name Two sum"

Class TwoSum{
    public static void main(String [] args){
    int nums[]={2,7,11,15};
    int target = 9;
    System.out.println(twoSum(nums,target));

    }
 /***    public int[] twoSum(int[] nums, int target) {
     for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
            return new int[]{i,j};
         }
        }   
    }
    return new int[]{-1};
}***/

//optimised approach
public static int[] optimisedApproach(int [] nums,int target){
    Arrays.sort(nums);

    int left =0 , right = nums.length-1;
    while(left < right){
        int result = nums[left] + nums[right];

        if(target == result){
            return new int[]{left,right};
        }

        else if( result < target){
            left++;
        }

        else //if(result > target)
        {
            right--;
        }
    }
    return new int[]{left,right};
}
}