class ProductArray{
    public static void main(String [] args){
        int arr[] = {1,2,3,4};
        productExcpetSelf(arr);
        for(int ele: arr){
            System.out.print(ele +" ");
        }

    }

    public static int[] productExcpetSelf(int arr[]){
        int n = arr.length;

        int  res[] = new int[n];
        // for(int i=0;i<arr.length;i++){
        //     res[i] = 1;
        // }


        for(int i=0;i<n;i++){
            int prod = 1;
        for(int j=0;j<arr.length;j++){
            if (i != j){
                prod *= arr[j];
            }
        }
        res[i] = prod;
    }
     return res;
    }
}