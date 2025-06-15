public class Loki {
   public static void main(String[] args) {

    String str = "Hello";
    String str1 = "hello";

    char ch = 'o';

    String ss = "abcde";
    String gg = "deabc";

    String sss = ss+gg;

    System.out.println(str.equalsIgnoreCase(str1));
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.length());
    System.out.println(str.charAt(0));
    System.out.println(str.lastIndexOf(ch));
    System.out.println(str.substring(2,4 ));
    System.out.println(str.substring(2));
    System.out.println(str.indexOf(str1));
    System.out.println(sss.contains(gg));
   
   }
}
