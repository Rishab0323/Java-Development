class ReverseArray{
    public static void main(String[] args){
        int arr[] = {1, 4, 3, 2, 6, 5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}