public class MountainArray {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // first divide arr with peak element than do a binary search with for asc and dec order array;
            int peak = findPeak(target, mountainArr);  // to find the peak of the array in the ascending side 
            int index = binarysearch(target, mountainArr, true, 0, peak); // to perform the binary search in the array to find the target in the asc side
            if(index != -1){
                return index;
            }
            return  binarysearch(target, mountainArr, false, peak, mountainArr.length() - 1); //to perform search on the descending side if target is not found on asc side
        }
        public int findPeak(int target , MountainArray mountainArr){
            int start =0, end = mountainArr.length()-1;
            while(start<end){
                int mid = start + (end-start)/2;
                if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                    end = mid;
                }else{
                    start = mid + 1;
                }
                }
            return start;
        }
        
         public int binarysearch(int target , MountainArray mountainArr, boolean isAsc, int start, int end){
         // Binary search with Loop.
         // is Asc boolean to change the flow for the ascending and desc. array.
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target< mountainArr.get(mid)){
                    if(isAsc){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }else if(target > mountainArr.get(mid)){
                    if(isAsc){
                       start = mid+1; 
                    }else{
                        end = mid-1;
                    }
                }else{
                    return mid;
                }
            }
             return -1;
        }
}
