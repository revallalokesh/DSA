

public class Animal {

    public static int Pradeppage = 20;
    public int Lokiage = 21;
    public static void Pradeep(){
        System.out.println("Pradeep");
    }
    public void Loki(){
        System.out.println("Loki");
    }
    public static void main(String[] args) {
       Pradeep();
       Animal obj = new Animal();
       obj.Loki();
       System.out.println(Pradeppage);
       System.out.println(obj.Lokiage);
       
    }
}
