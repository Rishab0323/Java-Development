import java.util.*;

class DuplicateElement{
    public static void main(String [] args){
        int arr[] = {1, 2, 3, 6, 3, 6, 1};
        System.out.println(Arrays.toString(duplicate(arr)));

    }


    // brute force approach
    // public int findDuplicate(int[] nums) {
    //     int repeatEle = 0;
    //    for(int i=0;i<nums.length;i++){
    //     int ele1 = nums[i];
    //     for(int j=i+1;j<nums.length;j++){
    //         int ele2 = nums[j];
    //         if(ele1 == ele2){
    //             repeatEle = ele2;
                
    //         }
    //     }
    //    } 
    //    return repeatEle;
    // }
      
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i] == nums[i+1]){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

      //method 2  
    public static int[] duplicate(int arr[]){
        int n =arr.length;
        int[] freq =new int[n];
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]] > 1){
                result.add(arr[i]);
                freq[arr[i]] = 0;
            }
        }


        if(result.isEmpty()){
            result.add(-1);
        }

        return  result.stream().mapToInt(i -> i).toArray();
    }
}