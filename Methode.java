// // // Method with Parameters and Return Value:
// // import java.util.*;
// // public class Methode {
// //     // Method to add two numbers
// //     public static int add(int num1, int num2) {
// //         return num1 + num2;
// // // 
// //     public static void main(String[] args) {
// //         int result = add(5, 3); // Calling the add method
// //         System.out.println("Result of addition: " + result);
// //     }
// //}

// // // 2)Method with No Parameters and Void Return Type:
// // public class Loki {
// //     // Method to greet the user
// //     public static void greet() {
// //         System.out.println("Hello, there! Welcome to our program.");
// //     }

// //     public static void main(String[] args) {
// //         greet(); // Calling the greet method
// //     }
// // }

// // // 3)Method with Control Statements:
// // public class EvenOdd {
// //     // Method to check if a number is even or odd
// //     public static void checkEvenOdd(int num) {
// //         if (num % 2 == 0) {
// //             System.out.println(num + " is even.");
// //         } else {
// //             System.out.println(num + " is odd.");
// //         }
// //     }
// //     public static void main(String[] args) {
// //         checkEvenOdd(7); // Calling the checkEvenOdd method
// //         checkEvenOdd(12);
// //     }
// // }

// // // 4)Method with Loops:
// // import java.util.Scanner;

// // public class SumOfNumbers {
// //     // Method to calculate the sum of numbers up to a given limit
// //     public static int calculateSum(int limit) {
// //         int sum = 0;
// //         for (int i = 1; i <= limit; i++) {
// //             sum += i;
// //         }
// //         return sum;
// //     }

// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);
// //         System.out.print("Enter the limit: ");
// //         int limit = scanner.nextInt();
// //         int sum = calculateSum(limit); // Calling the calculateSum method
// //         System.out.println("Sum of numbers up to " + limit + " is: " + sum);
// //         scanner.close();
// //     }
// // }

// // // 5) recursion in methodes in java
// // public class FactorialExample {
// //     // Recursive method to calculate factorial
// //     public static int factorial(int n) {
// //         // Base case: factorial of 0 is 1
// //         if (n == 0) {
// //             return 1;
// //         }
// //         // Recursive case: factorial of n is n * factorial(n-1)
// //         return n * factorial(n - 1);
// //     }

// //     public static void main(String[] args) {
// //         int n = 5;
// //         int result = factorial(n);
// //         System.out.println("Factorial of " + n + " is: " + result);
// //     }
// // }

// // // 6)Calling a Static Method from Another Method in the Same Class:
// // public class MyClass {
// //     // Static method 1
// //     public static void method1() {
// //         System.out.println("Method 1");
// //     }

// //     // Static method 2
// //     public static void method2() {
// //         System.out.println("Method 2");
// //         method1(); // Calling method1 from method2
// //     }

// //     public static void main(String[] args) {
// //         method2(); // Calling method2 from main
// //     }
// // }

// // // 7)Calling a Static Method from Another Class:
// // public class MyClass2 {
// //     // Static method
// //     public static void myMethod() {
// //         System.out.println("Hello from MyClass2");
// //     }
// // }
 
// // public class AnotherClass {
// //     public static void main(String[] args) {

// //         MyClass2.myMethod(); // Calling static method from another class
// //     }
// // }

// // // 8)Calling an Instance Method from Another Instance Method:
// // public class MyClass3 {
// //     // Instance method 1
// //     public void method1() {
// //         System.out.println("Method 1");
// //     }

// //     // Instance method 2
// //     public void method2() {
// //         System.out.println("Method 2");
// //         method1(); // Calling method1 from method2
// //     }

// //     public static void main(String[] args) {
// //         MyClass3 obj = new MyClass3();
// //         obj.method2(); // Calling instance method2 from main
// //     }
// // }

// // // 9)Calling an Instance Method from Static Method using Object:
// // public class MyClass4 {
// //     // Instance method
// //     public void myMethod() {
// //         System.out.println("Hello from myMethod");
// //     }

// //     // Static method
// //     public static void main(String[] args) {
// //         MyClass4 obj = new MyClass4();
// //         obj.myMethod(); // Calling instance method using object
// //     }
// // }

// // // 10)Calling a Static Method from Instance Method:
// // public class MyClass5 {
// //     // Static method
// //     public static void myStaticMethod() {
// //         System.out.println("Hello from myStaticMethod");
// //     }

// //     // Instance method
// //     public void myInstanceMethod() {
// //         System.out.println("Inside myInstanceMethod");
// //         myStaticMethod(); // Calling static method from instance method
// //     }

// //     public static void main(String[] args) {
// //         MyClass5 obj = new MyClass5();
// //         obj.myInstanceMethod(); // Calling instance method
// //     }
// // }
// // // 11)Method Chaining:
// // public class MyClass6 {
// //     // Method 1
// //     public static void method1() {
// //         System.out.println("Method 1");
// //     }

// //     // Method 2
// //     public static void method2() {
// //         System.out.println("Method 2");
// //     }

// //     // Method 3
// //     public static void method3() {
// //         System.out.println("Method 3");
// //     }

// //     public static void main(String[] args) {
// //         method1().method2().method3(); // Method chaining
// //     }
// // }

// // example 16)
// import java.util.Scanner;

// public class Methode {
//     public static int reverseNumber(int num) {
//         int rev = 0;
//         while (num > 0) {
//             int last = num % 10;
//             rev = rev * 10 + last;
//             num = num / 10;
//         }
//         return rev;
//     }

//     public static int sumOfDigits(int num) {
//         int sum = 0;
//         while (num > 0) {
//             int last = num % 10;
//             sum = sum + last;
//             num = num / 10;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int reversedNumber = reverseNumber(n);
//         System.out.println("Reversed number: " + reversedNumber);

//         int sum = sumOfDigits(n);
//         System.out.println("Sum of digits: " + sum);
//     }
// }
// // example 18

// public class New {
//     public static int Loki(int num) {
//         int rev = 0;
//         int originalNum = num; // Store the original number for comparison
//         int last;
//         while (num > 0) {
//             last = num % 10;
//             rev = rev * 10 + last;
//             num = num / 10;
//         }
//         if (rev == originalNum) {
//             System.out.println("The given number is a palindrome");
//         } else {
//             System.out.println("The given number is not a palindrome");
//         }
//         return rev; // Return the reversed number
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         int reverse = Loki(n);
       

//         sc.close();
//     }
// }

// // example 19

// public class New {
//     public static void Loki(int num){
//         int rev = 0;
//         int last;
//         while(num > 0){
//             last = num % 10;
//             rev = rev * 10 + last;
//             num = num / 10;
//         }
//         if(rev == num){
//             System.out.println("the given number is a palindrome");
//         }
//         else{
//             System.out.println("the given number is not a palindrome");
//         }
//     }

//         public static void main(String[] args){
//             Scanner sc  = new Scanner(System.in);
//             int n = sc.nextInt();
//             Loki(n);
//             sc.close();
//         }       
//     }

/* best methode calling in static 
 * 
 * import java.util.Arrays;

public class Loki {

    public static void main(String[] args) {

        int[] arr = {12,3,45,123,6789};

        System.out.println(findnumbers(arr));
        System.out.println(digits(6789));
        System.out.println(digits2(45));

        
    }
    static int findnumbers(int[] nums){

        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num){

        int res = digits(num);
        // if(res%2==0){
        //     return true;
        // } 
        // else{
        //     return false;
        // }
        return res%2==0;


    }
    static int digits(int num){
        if(num<0){
            num = num * -1;
        }
        if(num==0){
            return 1;
        }
        int  count = 0;
        while(num > 0){
            count++;
            num = num/10;
           
        }
        return count;

    }
    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }

}
 */



