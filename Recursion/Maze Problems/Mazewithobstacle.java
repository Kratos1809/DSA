import java.util.ArrayList;
// import java.util.List;

public class Mazewithobstacle {
    public static void main(String[] args){

        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };

        System.out.println(mazerestriction("", board, 0, 0));
    }

    static ArrayList<String> mazerestriction(String p, boolean[][]maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(maze[r][c] == false){
            return ans;
        }

        if(r < maze.length - 1){
            ans.addAll(mazerestriction(p + "D", maze, r + 1, c));
        }

        if(c < maze[0].length - 1){
            ans.addAll(mazerestriction(p + "R", maze, r, c + 1));
        }
        return ans;
    }
    
}
