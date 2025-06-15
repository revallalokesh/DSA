public class practice{
    public static void main(String[] args) {
       int[] arr = {1,2,4,5};
       if(fun(arr,0,0)){
        System.out.println("hii");
       }else{
        System.out.println("bii");
       }
    }
    public static boolean fun(int[] arr,int start,int c) {
        if(c==arr.length-1){
            return true;
        }
        if(c>arr.length-1){
            return false;
        }
        if(arr[start] < arr[start+1]){
            return fun(arr,start+1,c+1);
        }
       return false;
    }

}
