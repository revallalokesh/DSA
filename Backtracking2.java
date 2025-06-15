import java.util.Arrays;

public class Backtracking2 {
    
public static void main(String[] args) {
        boolean[][] loki = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[loki.length][loki[0].length];
      fun(loki,0,0,"",path,1);
    }
    public static  void  fun(boolean[][] loki,int r,int c,String p,int[][] path,int step){
        if(r == loki.length-1 && c==loki[0].length-1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        //it is already visited when funciton is false that's why i am returning 
        if(loki[r][c]==false){
            return;
        }
        // if it is not visited make it as a false for visiting 
        // i am considering this block in my path;
        
        loki[r][c] = false;
        path[r][c] = step;
        if(r < loki.length-1){
           fun(loki,r+1,c,p+"D",path,step+1);
        }
        
        if(c  < loki[0].length-1){
            fun(loki,r,c+1,p+"R",path,step+1);
        }
        if(r>0){
            fun(loki,r-1,c,p+"U",path,step+1);
        }
        if(c>0){
            fun(loki,r,c-1,p+"L",path,step+1);
        }
        //this line is where the function will be over
        //so before the function gets removed ,also remove the changes that were made by that function 
        loki[r][c] = true;
        path[r][c] = 0;
    }
}
