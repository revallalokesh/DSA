public class patternimp {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();

        for (int i = 2; i < n; i++) {
            System.out.printf("%2d ", i);
            for (int s = 1; s <= n - 2; s++) {
                System.out.print("   ");
            }
            System.out.printf("%2d ",n - i + 1);
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
    }
}
