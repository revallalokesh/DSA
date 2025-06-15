import java.util.*;

public class man{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt(); 
        for(int i=0;i<n;i++){
            for(int j=0;j<=2 * i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2 * (n-i)-1;k++){
                System.out.print(k+" ");
            }
            
            System.out.println();
        }
        
        sc.close();
    }

}