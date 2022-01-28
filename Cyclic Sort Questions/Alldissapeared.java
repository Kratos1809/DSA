import java.util.ArrayList;

public class Alldissapeared {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.print(dissapear(arr));

    }
    static ArrayList<Integer> dissapear(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int ind = 0; ind < arr.length; ind++){
            if(arr[ind] != ind + 1){
                ans.add(ind + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
