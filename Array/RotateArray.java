class RotateArray{
    public static void main(String [] args){
        int arr[] ={1, 2, 3, 4, 5, 6}
        int d = 2;
        method1(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.println();
        }
        

    }

    static void method 1(int arr[],int d){
        int n = arr.lengh;
        d %= n;         //to check d > n

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    
    
    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}