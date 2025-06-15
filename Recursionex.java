// // 1) Example 1: Fibonacci Series

// public class Fibonacci {
//     // Recursive method to calculate the nth Fibonacci number
//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("Fibonacci series up to " + n + ":");
//         for (int i = 0; i < n; i++) {
//             System.out.print(fibonacci(i) + " ");
//         }
//     }
// }

// // 2)Example 2: Factorial Calculation
// public class Factorial {
//     // Recursive method to calculate factorial
//     public static int factorial(int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println("Factorial of " + n + " is: " + factorial(n));
//     }
// }
// // 3)Example 3: Tower of Hanoi

// public class TowerOfHanoi {
//     // Recursive method to solve Tower of Hanoi problem
//     public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
//         if (n == 1) {
//             System.out.println("Move disk 1 from " + source + " to " + destination);
//             return;
//         }
//         towerOfHanoi(n - 1, source, destination, auxiliary);
//         System.out.println("Move disk " + n + " from " + source + " to " + destination);
//         towerOfHanoi(n - 1, auxiliary, source, destination);
//     }

//     public static void main(String[] args) {
//         int n = 3; // Number of disks
//         towerOfHanoi(n, 'A', 'B', 'C'); // 'A' is source, 'B' is auxiliary, 'C' is destination
//     }
// }
