class Student{

    int rollno;
    String name;
    float marks;
    
}
public class Enhancedforloop {
    public static void main(String[] args){

        Student s1 = new Student();
        
        s1.rollno = 1;
        s1.name = "loki";
        s1.marks = 90;

        Student s2 = new Student();
        
        s2.rollno = 2;
        s2.name = "man";
        s2.marks = 100;

        Student s3 = new Student();
        
        s3.rollno = 1;
        s3.name = "fear";
        s3.marks = 80;

        Student[] arr = new Student[3];

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i].name + " : " + arr[i].marks);
        // }
        for(Student m : arr){
            System.out.println(m.name);
        }
    }
}
