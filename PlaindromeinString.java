public class PlaindromeinString {
    public static void main(String[] args) {
        String name = "abcdcba";
        System.out.println(Fun(name));

    }

    public static boolean Fun(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
