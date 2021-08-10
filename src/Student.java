import java.util.*;
public class Student
{
    static int noOfSubjects;
    public int subjects()
    {
        return noOfSubjects;
    }
    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.print("Kindly enter the number of subjects: ");
        Scanner sc = new Scanner(System.in);
        noOfSubjects = sc.nextInt();
        System.out.println("No. of subjects: "+s.subjects());
    }
}
