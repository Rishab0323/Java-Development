class BuySell{
    public static void main(String[] args){
        int arr[] ={7,1,5,3,6,4};
        System.out.println(max_profit_stock(arr));


    }
    public static int max_profit_stock(int arr[]){
        int max_profit = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j] - arr[i]) > max_profit){
                    max_profit = arr[j] - arr[i];
                }
            }
        }
        return max_profit;
    }
}