
import java.util.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);\
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // System.out.println(list);
        // or below methode
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        sc.close();
    }
}

/* 
 * import java.util.ArrayList;

public class Loki {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.get(1));
        System.out.println(list);

        

    }
    
}
 */

 /* multi dimetional array list  */

 /* import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

       for (int i = 0; i < 3; i++) {
           list.add(new ArrayList<>());
       }

       for(int i = 0; i < 3; i++) {
           for(int j = 0; j < 3; j++) {
               list.get(i).add(sc.nextInt());
           }
       }

       System.out.println(list);
    }
} */

/* swapping two arrays
 * 
 * import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        Swap(arr,1,2);
        /*for(int num : arr){
            System.out.println(num);
        }*/
        /*for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }*/
       /*  System.out.println(Arrays.toString(arr));
    }

    public static void Swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

} */
/* 
 * max number 
 * 
 * import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        Swap(arr);

    }

    public static void Swap(int[] arr){

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

}
 */

 /* 
  *reversing an array
  import java.util.*;


public class Loki {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }    
       Reverse(arr);
       System.out.println(Arrays.toString(arr));
        sc.close();  
    }

    public static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]  = temp;
    }
}

*/

/* 
 *reversing an array

 import java.util.*;

public class Loki {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
        sc.close();
    }

    public static void Reverse(int[] arr){
        int start = 0;
        int end  = arr.length - 1;
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
 */
/* 
 array duplicates and frequencies 

 import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int [] arr =  {1, 2, 3, 4, 2, 7, 8, 8, 3};

        Arrays.sort(arr);
//System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int count = 1;

            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]+" ");
                while(i<arr.length-1 && arr[i] == arr[i+1]){
                    i++;
                    count++;
                }
                System.out.print(count);
                System.out.println();

            }

            else{
                System.out.println(arr[i]+" "+count);
            }
        }

    }
}


 */

 /* 
  *asscending order

  import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[ ] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int temp  = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}
*/

/* 
 desecending order

 import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[ ] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int temp  = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
*/

/*
remove duplicates 

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            } else {
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}

 */

