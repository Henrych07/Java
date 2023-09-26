//Java programm to demonstrate usage of this
//25-09-2023
//ThisDemo2.java
class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);
}
}  
public class ThisDemo2{  
public static void main(String args[])
{  
Student s1=new Student(4264,"Henry",45700);  
Student s2=new Student(4204,"Ajay",45700);  
s1.display();  
s2.display();  
}
}     
