public class RemoveConsecutiveDuplicates {
    public static void main(String[] args){
        remove("", "aaaabbbbb");
        System.out.println(removeConsecutiveDuplicates("aabcbba"));
    }

    static void remove(String p, String up){
        if(up.length()<=1){
            p = p + up.charAt(0);
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == up.charAt(1)){
            remove(p, up.substring(1));
        }
        else{
            remove(p + ch, up.substring(1));
        }
    }

    //alternate code from GFG

    static String removeConsecutiveDuplicates(String input) {
        if(input.length()<=1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            return removeConsecutiveDuplicates(input.substring(1));
        else
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
    }
}
