public class Firstmisssingpositive {
    public static void main(String[] args){
        int[] arr = {1,2,0};
        System.out.println(missingpositive(arr));
    }

    static int missingpositive(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(int ind = 0; ind < arr.length; ind++){
            if(arr[ind] != ind + 1){
                return ind + 1;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
