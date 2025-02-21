import java.util.Arrays;

class SecondLargestElement{
    public static void main(String [] args){
        int arr[] = { 12, 35, 1, 10, 34, 1};
        System.out.println(method2(arr));
    }

    // public static int secLargeElement(int arr[]){
    //     int n = arr.length;
    //     Arrays.sort(arr);

    //     for(int i=n-2;i>=0;i++){
    //         if(arr[i] != arr[n-1]){
    //             return arr[i];
    //         }
    //     }

    //     return -1;
    // }

    public static int method2(int arr []){
        int largestEle = -1, secondEle = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largestEle){
                largestEle = arr[i];
            }
            // for(int j=0;j<arr.length;j++){
                else if(arr[i] > secondEle && arr[i] != largestEle){
                    secondEle = arr[i];
                }
            // }
        }

        return secondEle;
    }
}