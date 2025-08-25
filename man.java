import java.util.*;
class man{
   public static void main(String[] args){
    String gg = "aeba";
    System.out.println(fun(gg));
   }
   public static boolean fun(String gg){
    for(int i=0;i<gg.length()/2;i++){
      if(gg.charAt(i)!=gg.charAt(gg.length()-i-1)){
        return false;
      }
    }
    return true;
   }
}