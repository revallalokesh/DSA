
// class Stringsinjava {
//     public static void main(String args[]) {

//         String name = "loki";
//         char target = 'k';

//         if (Fun(name, target)) {
//             System.out.println("charcter is here ");
//         } else {
//             System.out.println("No such name");
//         }

//     }

//     public static boolean Fun(String name, char target) {

//         if (name.length() == 0) {
//             return false;
//         }

//         for (int c = 0; c < name.length(); c++) {
//             if (target == name.charAt(c)) {
//                 return true;
//             }
//         }
//         return false;

//     }
// }


// 

// import java.util.Arrays;

// class Stringsinjava {
//     public static void main(String args[]) {

//         String name = "loki";
//         char target  = 'k';

//         System.out.println(Fun(name,target));
//         System.out.println(Fun1(name,target));
//         System.out.println(Arrays.toString(name.toCharArray()));
//         // priting an string  using arrays methode 
//         }
//         public static boolean Fun1(String name,char target) {

//         if(name.length()==0){
//             return false;
//         }
//         for(char ch : name.toCharArray()){
//             if(ch==target){
//                 return true;
//             }
//         }
//         return false;
//         }
//         public static boolean Fun(String name, char target){

//         if(name.length()==0){
//             return false;
//         }

//         for(int c=0;c<name.length();c++){
//             if(target == name.charAt(c)){
//                 return true;
//             }
//         }
//         return false;

//         }
//     }

class Stringsinjava {
    public static void main(String args[]) {

        String name = "lokesh";
        char target  = 'e';
        int start = 2;
        int end = 4;

        System.out.println(Fun(name,target,start,end));

        }

        public static boolean Fun(String name, char target,int start,int end){

        if(name.length()==0){
            return false;
        }

        for(int c=start;c<=end;c++){
            if(target == name.charAt(c)){
                return true;
            }
        }
        return false;

        }
    }



