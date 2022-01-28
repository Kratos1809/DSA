import java.util.ArrayList;

public class SubSeqAscii {
    public static void main(String[] args){
        Seqascii("", "abc");
        System.out.println(subseqlist("", "abc"));
    }

    static void Seqascii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);

        Seqascii(p + ch, up.substring(1));
        Seqascii(p, up.substring(1));
        Seqascii(p + (ch+0), up.substring(1));
    }

    //Storing it in an array list, without passing it as an argument
    static ArrayList<String> subseqlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String>first = subseqlist(p + ch, up.substring(1));
        ArrayList<String>second = subseqlist(p, up.substring(1));
        ArrayList<String>third = subseqlist(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
