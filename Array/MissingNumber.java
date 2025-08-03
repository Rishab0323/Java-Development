class MissingNumber {

    //brute force
    public int missingNumber(int[] nums) {
        int n = nums.length+1;
        int missingValue = 0;
        for(int i=0;i<n;i++){
            boolean found = false;
            for(int j=0;j<nums.length;j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                missingValue = i;
            }
        }
        return missingValue;

        //optimized approach

        public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)/2);
        int partialSum = 0;
        for(int i=0;i<n;i++){
            partialSum += nums[i];
        }
        int missingValue = totalSum - partialSum;
        return missingValue;
    }
    }
}