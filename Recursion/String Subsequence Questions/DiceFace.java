import java.util.ArrayList;

public class DiceFace {
    public static void main(String[] args){
        System.out.println(dice("", 4));
        
        System.out.println(dicecustomface("", 3, 4));
    }
    static ArrayList<String> dice(String p, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i <=6 && i<=target; i++){
            ans.addAll(dice(p + i, target - i));
        }
        return ans;
    }

    //dice with custom faces
    static ArrayList<String> dicecustomface(String p, int target, int face) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i <=face && i<=target; i++){
            ans.addAll(dicecustomface(p + i, target - i, face));
        }
        return ans;
    }
}
