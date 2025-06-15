/**
 * rotatedsearchrecursion
 */
public class rotatedsearchrecursion {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 1;
        int start = 0;
        int end = arr.length-1;
        int kk = Search(arr,target,start,end);
        System.out.println(kk);
    }
    public static int Search(int[] arr,int target ,int s,int e){

        if(s > e){
            return -1;
        }
        
        int mid = s + (e-s)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[s]<=arr[mid]){

            if(target>=arr[s] && target<=arr[mid]){
                return Search(arr,target,s,mid-1);
            }else{
                return Search(arr,target,mid+1,e);
            }
        }
        if(arr[mid]<=arr[e]){
            if(target >=arr[mid] && target <=arr[e]){
                return Search(arr,target,mid+1,e);
            }
            else{
                return Search(arr,target,s,mid-1);
            }
        }
        return -1;
    }
}