class MinElement {
    public int findMin(int[] nums) {
      int les =  Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        if(les > nums[i]){
            les = nums[i];
        }
      }
      return les;
    }
