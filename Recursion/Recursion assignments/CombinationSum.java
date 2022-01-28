import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        List<List<Integer>> ans = combinationSum(arr, 7);
        System.out.println(ans);
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
      List<List<Integer>> list = 
        combinationSum(candidates,0,target);
        return list;
    }
    
    public static List<List<Integer>> combinationSum(int[] candidates, int start, int target) {
        int l = candidates.length;
        List<List<Integer>> mlst = new LinkedList<>();
        for(int i=start;i<l;++i) {
            int diff = target-candidates[i];
            if(diff > 0 ) {
                List<List<Integer>> slst = combinationSum(candidates, i, diff);
                for(List<Integer> llst: slst) {
                  llst.add(0,candidates[i]);
                    mlst.add(llst);
                }
            }
            else if(diff == 0) {
                List<Integer> lst = new LinkedList<>();
                lst.add(candidates[i]);
                mlst.add(lst);
            }
            else return mlst;
        }
        return mlst;
        
    }
    
}
