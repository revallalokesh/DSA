public class backtrackingAllPaths {

    public static void main(String[] args) {
        boolean[][] loki = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        fun(loki, 0, 0, "");
    }

    public static void fun(boolean[][] loki, int r, int c, String p) {
        if (r == loki.length - 1 && c == loki[0].length - 1) {
            System.out.println(p);
            return;
        }
        // it is already visited when funciton is false that's why i am returning
        if (loki[r][c] == false) {
            return;
        }
        // if it is not visited make it as a false for visiting
        // i am considering this block in my path
        loki[r][c] = false;
        if (r < loki.length - 1) {
            fun(loki, r + 1, c, p + "D");
        }

        if (c < loki[0].length - 1) {
            fun(loki, r, c + 1, p + "R");
        }
        if (r > 0) {
            fun(loki, r - 1, c, p + "U");
        }
        if (c > 0) {
            fun(loki, r, c - 1, "L");
        }
        // this line is where the function will be over
        // so before the function gets removed ,also remove the changes that were made
        // by that function
        loki[r][c] = true;
    }
}
