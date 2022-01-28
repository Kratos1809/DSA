import java.util.ArrayList;
public class Mazeincludeallpaths {
    public static void main(String[] args){
        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };

        System.out.println(maze("", board, 0, 0));
    }

    static ArrayList<String> maze(String p, boolean[][]maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(maze[r][c] == false){
            return ans;
        }
        maze[r][c] = false;

        if(r < maze.length - 1){
            ans.addAll(maze(p + "D", maze, r + 1, c));
        }

        if(c < maze[0].length - 1){
            ans.addAll(maze(p + "R", maze, r, c + 1));
        }

        if(r > 0){
            ans.addAll(maze(p + "U", maze, r - 1, c));
        }

        if(c > 0){
            ans.addAll(maze(p + "L", maze, r, c - 1));
        }
        maze[r][c] = true;
        
        return ans;
    }

}
