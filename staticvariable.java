//Java programm to demonstrate static variable by using counter
//25-09-2023
//StaticVariableDemo1.java
public class Counter{  
int count=0;
Counter(){  
count++;  
System.out.println(count);  
}  
public static void main(String args[]){  
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter();  
}  
}  
