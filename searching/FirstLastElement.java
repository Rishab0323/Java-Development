class FirstLastElement{
    public static void main(String[] args){
        int nums[] = {5,7,7,8,8,10};

        public int[] searchRange(int[] nums, int target) {
         int low=0,high=nums.length-1;
        int mid;
        int first_occ=-1,last_occ=-1;
        //binary searching..
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(target>nums[mid]) {
                low=mid+1;
            }
            else if(target< nums[mid]){
                high=mid-1;
            }
            else {
                first_occ=last_occ=mid;
                //search for left elements.
                while(first_occ>0 && nums[first_occ]==nums[first_occ-1]) {
                    first_occ--;
                }
                //Search for right elements.
                while(last_occ<nums.length-1 && nums[last_occ]==nums[last_occ+1]) {
                    last_occ++;
                }
                return new int[] {first_occ,last_occ};
            }
        }
        return new int[] {-1,-1};
    }
    }
}