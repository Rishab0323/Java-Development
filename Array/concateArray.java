class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*(nums.length)];
        int j = 0;
        for(int i=0;i<2*(nums.length);i++){
            ans[i] = nums[j];
            j++;
            if(j == nums.length){
                j = 0;
            }

        //optimizes technique
        int n = nums.length;
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;

    }
}