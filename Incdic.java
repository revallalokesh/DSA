public class Incdic {
        public static void main(String[] args) {
            int i = 3;
            int preinc = ++i;
            System.out.println("preinc:"+preinc);
            System.out.println(i);
            int postinc = i++;
            System.out.println("postinc:"+postinc);
            System.out.println(i);
            int predic = --i;
            System.out.println("predic:"+predic);
            System.out.println(i);
            int postdic = i--;
            System.out.println("postdic:"+postdic);
            System.out.println(i);
    
        }
    }
