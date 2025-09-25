class  git ProductExecptOf{
    public int[] productExceptSelf(int[] nums) {
        int product [] = new int[nums.length];
        int i = 0;
        int j = 0;
        product[i] = 1;
        while(i < nums.length){
            if(j == nums.length){
                i++;
                if(i < nums.length){
                    product[i] = 1;
                    j = 0;
                }
                else{
                    if( i != j ){
                        product[i] *= nums[j];
                    }
                    j++;
                }
            }
        }
        return product;
    }
}