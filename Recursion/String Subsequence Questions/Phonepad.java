import java.util.ArrayList;


public class Phonepad {
    public static void main(String[] args){
        System.out.println(padRet("", "89"));

    }
    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> ans = new ArrayList<>();

        if(digit<=1 || digit>9){
            return ans;
        }

        if(digit<=6){
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(padRet(p + ch, up.substring(1)));
            }
        }
    else{
            if(digit == 7){
                for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                    char ch = (char) ('a' + i);
                    ans.addAll(padRet(p + ch, up.substring(1)));
                }
            }

            else if(digit == 8){
                for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                    char ch = (char) ('a' + i);
                    ans.addAll(padRet(p + ch, up.substring(1)));
                }
            }
            else{
                for(int i=((digit-2)*3)+1;i<=((digit-1)*3)+1;i++){
                    char ch = (char)('a'+ i);
                    ans.addAll(padRet(p + ch,up.substring(1)));
                }
            }
    
        }
        return ans;
    }

}
