//Java programme to demonstrate the importance of using this keyword
//25-09-2023

class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
rollno=rollno;  
name=name;  
fee=fee;  
}  
void display(){
    System.out.println(rollno+" "+name+" "+fee);}  
}  
public class TestThis1{  
public static void main(String args[]){  
Student s1=new Student(4264,"Henry",45700);  
Student s2=new Student(4204,"Ajay",45700);  
s1.display();  
s2.display();  
}
}  
