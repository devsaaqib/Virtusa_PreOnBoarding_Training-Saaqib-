import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

class Student{
    int id;
    String name;
    double marks;

    String calculateGrades(){
        if(marks>=90){
            return "A";
        } else if (marks>=75) {
            return "B";
        } else if (marks>=50) {
            return "C";
        }else {
            return "Fail";
        }
    }


    void displayDetails(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Mark: "+marks);
        System.out.println("Grades of the student: "+ calculateGrades());

    }
}

public class studentManagement{
    public static void main(String args[]) {
        Student s1= new Student();
        s1.id=1;
        s1.name="Saaqib";
        s1.marks=45;

        Student s2= new Student();
        s2.id=2;
        s2.name="Sayeed";
        s2.marks=91;

        Student s3= new Student();
        s3.id=3;
        s3.name="Bhupathi";
        s3.marks=89;

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();


    }
}