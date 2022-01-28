public class CeilingNumber {

    public static int Ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start ) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start; // If asked ceiling of a number
        //return end;   returns floor of a number     
    }
    
    public static void main(String[] args) {
        int[]arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 18;
        int ans = Ceiling(arr, target);
        System.out.println(arr[ans]);
    }
}