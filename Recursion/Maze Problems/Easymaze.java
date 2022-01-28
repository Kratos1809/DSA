import java.util.ArrayList;

//counting paths in a maze

public class Easymaze {
    public static void main(String[] args){
        System.out.println(maze(3, 3));

        printmaze("", 3, 3);

    System.out.println(printmazediag("", 3, 3));
    }

    static int maze(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = maze(r - 1, c);
        int right = maze(r, c - 1);

        return left + right;
    }


    // printing paths in a maze
    
    static void printmaze(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            printmaze(p + "D", r - 1, c);
        }

        if(c > 1){
            printmaze(p + "R", r, c - 1);
        }
    }


    //considering Diagonal paths

    static ArrayList<String> printmazediag(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(printmazediag(p + "D", r - 1, c - 1)); //Diagonal
        }

        if(r > 1){
            list.addAll(printmazediag(p + "V", r - 1, c)); //Vertical
        }

        if(c > 1){
            list.addAll(printmazediag(p + "H", r, c - 1)); //Horizontal
        }
        return list;
    }
}