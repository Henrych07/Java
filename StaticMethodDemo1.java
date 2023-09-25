//Java programm to demostrate the usage of static method
//25-09-2023
//StaticMethodDemo1.java
import java.io.*;
class Student
{
    int rollno;
    String name;
    static String college="SITE";
     Student(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+"   "+name+"     "+college);
    }
}
public class StaticMethoDemo
{
    public static void main(String args[])
    {
        Student s1=new Student(4264,"Henry");
        Student s2=new Student(4204,"Ajay");
        System.out.println("Student details are : ");
        s1.display();
        s2.display();
    }
}
