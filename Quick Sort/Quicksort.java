import java.util.Arrays;

class Quicksort{
    
    public static void main(String[] args){
        int[]arr = {21,89,16,9,78,61,12,8};
        Quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void Quick(int[]arr, int low, int high){
        if(low > high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            Quick(arr, s, high);
            Quick(arr, low, e);
        }

                
    }
}