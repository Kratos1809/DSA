public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2};
        System.out.println(rotationcount(arr));
    }
    
    private static int rotationcount(int[]arr){
        int pivot = Findpivot(arr);
        return pivot + 1;
    }

    public static int Findpivot(int[]arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int FindpivotwithDuplicates(int[]arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
           if(arr[start] == arr[mid] && arr[end] == arr[mid]){
               //check whether start is pivot 
               if(arr[start] > arr[start + 1]){
                   return start;
               }
               start++;
               //check whether end is pivot
               if(arr[end] < arr[end - 1]){
                   return end-1;
               }
               end--;
           }
           else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
               start = mid + 1;
           }
           else{
               end = mid - 1;
           }
        }
        return -1;
    }
    
}
