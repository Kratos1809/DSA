
import java.io.*;
// import java.util;

class binarysearch {

    public static void main(String[] args)
    {
        int [] arr={2,34,54,67,79,89};
        int target =34;
        int ans=search(arr,target);
        System.out.println(ans);
    }

     static int search(int[] arr,int target )
    {
        int start =0;
        int end=arr.length-1;
        int mid ;

        while(start <= end)
        {
            mid=start + (end-start )/2;
            
            if(target < arr[mid])
            {
                end =mid-1;
            }
            else if( target > arr[mid])
            {
                start =mid+1;
            }
        else{
            return mid;
        }             
        }
        return -1;


    }




}
