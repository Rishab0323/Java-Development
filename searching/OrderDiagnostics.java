class OrderDiagnostics{
    public static void main(String [] args){
       int arr[] = {2,3,4,5,6,7,8,9};
       int target = 3;
       System.out.println(incBinary(arr,target)); 
    }

    static int incBinary(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
        int mid = start + (end - start)/2;

         boolean isAsc = arr[src] < arr[end];

        if(arr[mid == target]){
            return mid;
        }

        if(isAsc){
            if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
                } 
                    }
            else{
                if(target > arr[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
                } 
            }
        }

        return -1;
    }
}