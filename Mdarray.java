
// class New {
//     public static void main(String[] args) {

//         int[][] nums = new int[3][4];

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 nums[i][j] = (int)(Math.random()*10);
//                 System.out.print(nums[i][j] + "      ");

//             }
//             System.out.println();

//         }

//         // for (int i = 0; i < 3; i++) {
//         //     for (int j = 0; j < 4; j++) {
//         //         System.out.print(nums[i][j] + "      ");
//         //     }
//         //     System.out.println();
//         // }

//     }
// }

/* 
public class Mdarray {
    public static void main(String[] args) {

        int[][] nums = new int[3][4];

        for (int[] row : nums) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) (Math.random() * 10);
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }
}
 */

public class Mdarray {
    public static void main(String[] args) {

        int[][] nums = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] row : nums) {
            for (int m : row) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}

/*
 * printing arrays in one methode
 * 
 * /**
 * Loki
 * 
 * import java.util.*;
 * public class Loki {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * String[] arr = new String[4];
 * for(int i=0;i<arr.length;i++){
 * arr[i] = sc.next();
 * }
 * 
 * System.out.println(Arrays.toString(arr));
 * sc.close();
 * 
 * 
 * }
 * }
 */
/*
 * 
 * /**
 * printing in type arrays dynamically in one step
 * import java.util.*;
 * public class Loki {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int[] arr = new int[4];
 * for(int i=0;i<arr.length;i++){
 * arr[i] = sc.nextInt();
 * }
 * 
 * System.out.println(Arrays.toString(arr));
 * sc.close();
 * 
 * 
 * }
 * }
 * 
 */
/*
 * using for each loop
 * 
 * 
 * import java.util.*;
 * public class Loki {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int[] arr = new int[4];
 * for(int i=0;i<arr.length;i++){
 * arr[i] = sc.nextInt();
 * }
 * 
 * for(int num :arr){
 * System.out.println(num);
 * 
 * }
 * sc.close();
 * 
 * 
 * }
 * }
 */

/*
 * printing array using for loop
 * 
 * 
 * import java.util.*;
 * public class Loki {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int[] arr = new int[4];
 * for(int i=0;i<arr.length;i++){
 * arr[i] = sc.nextInt();
 * System.out.println(arr[i]);
 * }
 * 
 * sc.close();
 * 
 * 
 * }
 * }
 */

 /* 
  * 2d arrays 

  
import java.util.Arrays;
import java.util.Scanner;

public class Loki {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

                System.out.println(arr[i][j] + " ");
            }
            System.out.println();

        }

        sc.close();
    }

}
  */

  /* 

  import java.util.Arrays;
import java.util.Scanner;

public class Loki {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        sc.close();
    }

}
   */

   /* 
    import java.util.Arrays;
import java.util.Scanner;

public class Loki {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr[i]));
                
        }
        sc.close();
    }

}
    */

    /* 
     Array list 

     
     */
     /* 
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 8;
        int[] res = (Fun(arr,target));
        System.out.println(Arrays.toString(res));
        }

        public static int[]  Fun(int[][] arr, int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

        }
    }
*/


/* 
 
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int res = (Fun(arr));
        System.out.println(res);
        }

        public static int Fun(int[][] arr){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
       return max;

        }
    }
 */
