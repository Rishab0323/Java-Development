import java.util.*;

class Zero{
    public static void main(String[] args){
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        // System.out.println(Arrays.toString(bruteForce(arr)));
        System.out.println(optimise(arr));

        for(int ele:arr){
            System.out.print(ele +" ");
        }

    }

    // public static int [] bruteForce(int arr[]){
    //     int n = arr.length;
    //     int temp[] = new int[n];
    //     int j=0;

    //     for(int i=0;i<n;i++){
            
    //         if(arr[i] != 0){
    //             temp[j++] = arr[i];
    //         }
    //     }
    //     while(j<n){
    //         temp[j++] = 0;
    //     }

    //     for(int i=0;i<n;i++){
    //         arr[i] = temp[i];
    //     }

    // return arr;
    // }

    public static void optimise(int arr){

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;

            count++;
            }
        }
    }
}