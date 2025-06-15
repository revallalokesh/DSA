
    public class reversenumber {
    public static void main(String[] args) {

        int kk = fun(8765);
        System.out.println(kk);

    }
    static int sum = 0;
    public static int fun(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    public static int helper(int n,int digits){//return type + variables for future call
       if(n==0){
        return 0;
       }
       int rem = n%10;
       return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}

/* 
 * 
 * import java.util.Arrays;


public class man {
    public static void main(String[] args) {

        int kk = fun(1342);
        System.out.println(sum);

    }
    static int sum = 0;
    public static int fun(int n){//return type + variables for future call
       if(n==0){
        return 0;
       }
       int rem = n%10;
       sum = sum * 10 + rem;
       return fun(n/10);
    }
}


 */

 /* 
  * public class Main {
    public static void main(String[] args) {
        int number = 1342;
        int reversedNumber = reverseNumber(number, 0);
        System.out.println(reversedNumber); // Output: 2431
    }

    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int rem = n % 10;
        reversed = reversed * 10 + rem;
        return reverseNumber(n / 10, reversed);
    }
}

  */