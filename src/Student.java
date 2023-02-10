import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rollNo;
    private  String name;
    private  int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
         this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

     public Student(){}

     public Student(int rollNo, String name, int marks){
           this.rollNo = rollNo;
           this.name=name;
           this.marks=marks;
     }




     public static void main(String[] args) {
          Student s1=new Student();
          s1.rollNo=1;
          s1.name="abc";
          s1.marks=35;

         System.out.println("Roll no before : " + s1.getRollNo());

         s1.setRollNo(20);
         System.out.println("Roll no after : " + s1.getRollNo());


         Student s2 = new Student(2, "gef", 55);

         ArrayList<Student> studentsList = new ArrayList<>();
         studentsList.add(s1);
         studentsList.add(s2);

         System.out.println(studentsList);
     }

    public String toString(){//overriding the toString() method
        return rollNo+" "+name+" "+marks;
    }
}
