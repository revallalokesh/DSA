public class block {
public static void main(String[] args) {

        int num = 20;
        String name = "loki";
        {
             num = 10;/*we can access and the ouside declared element in inside  of the same class*/
            //  int c = 20;
             name = "man";
            System.out.println(num);
            System.out.println(name);
        }
       /*System.out.println(c);  we cant access the inside declared element in outside the class */ 
        System.out.println(num);
        System.out.println(name);

    }
}
