//Java programme to demonstrate super keyword with variables/Attributes
//Ch.Henry
//17-10-2023
//SuperVariableDemo.java
import java.io.*;
class Animal
{
    protected String type="Domestic";
}
class Dog extends Animal
{
    public String type="Hammel"; 
public void printtype()
    {
    System.out.println("I am "+type);
    System.out.println("I am "+super.type);
    }
}
public class SuperVariableDemo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.printtype();
    }
}
