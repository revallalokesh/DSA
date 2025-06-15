// Source code is decompiled from a .class file using FernFlower decompiler.
class Mobile {
   String brand;
   int price;
   static String name;

   Mobile() {
   }

   public void show() {
      System.out.println("brand : " + this.brand + "price : " + this.price + " name : " + name);
   }

   public static void show1(Mobile var0) {
      System.out.println("brand : " + var0.brand + " price : " + var0.price + "name : " + name);
   }
}
