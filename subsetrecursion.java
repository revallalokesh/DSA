public class subsetrecursion {
    
}
/* 
 * import java.util.ArrayList;
import java.util.List;
public class man {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> loki = fun(arr);
        for(List<Integer> man : loki){
            System.out.println(man);
        }
    }
public static List<List<Integer>> fun(int[] arr){
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());

    for(int num : arr){

        int n = outer.size();

        for(int i=0;i<n;i++){
            List<Integer> inner = new ArrayList<>(outer.get(i));
            inner.add(num);
            outer.add(inner);
        }
    }
    return outer;
}
}
 */