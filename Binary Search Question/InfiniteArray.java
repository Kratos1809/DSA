public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr = {3,5,7,8,9,19,56,78,90,123,145,158,160,170,180,190};
        int target = 180;
        // System.out.println(ans(arr, target));
        System.out.println(alternate(arr, target));
    }

    // static int ans(int[] arr, int target){
    //     int start = 0;
    //     int end = 1;
        

    //     while(start <= end){
    //         if(arr[end] > target){
    //            return binarySearch(arr, target, start, end);
    //         }
    //         else{
    //             int temp = end + 1;
    //             end  = end + ((end - start) + 1) * 2;
    //             start = temp;
    //         }
    //     }
    //     return -1;
    // }

    static int alternate(int[]arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
