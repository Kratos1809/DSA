public class Stringpattern2 {
    public static void main(String[] args){
        // System.out.print(skipstringnotrequire("bcdadappldfg"));
        System.out.print(skipstring("apple a day!"));
    }
    static String skipstring(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipstring(s.substring(5));
        }
        else{
            return s.charAt(0) + skipstring(s.substring(1));
        }
    }

    static String skipstringnotrequire(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipstringnotrequire(s.substring(3));
        }
        else{
            return s.charAt(0) + skipstringnotrequire(s.substring(1));
        }
    }
}
