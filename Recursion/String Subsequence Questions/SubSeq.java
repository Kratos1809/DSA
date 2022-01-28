import java.util.ArrayList;

public class SubSeq{
    public static void main(String[] args){
        // subseq("", "ABC");

        // ArrayList<String>ans = subseqlistarg("", "abc", new ArrayList<>());
        // System.out.println(ans);

        System.out.println(subseqlist("", "abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    //Storing it in an ArrayList, passing it as an argument
    static ArrayList<String> subseqlistarg(String p, String up, ArrayList<String>list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        subseqlistarg(p + ch, up.substring(1), list);
       return subseqlistarg(p, up.substring(1), list);
    }

    //Storing it in an Arraylist, not passing it as an argument
    static ArrayList<String> subseqlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String>left = subseqlist(p + ch, up.substring(1));
        ArrayList<String>right = subseqlist(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}