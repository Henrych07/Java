//Java programm to demonstrate the usage of the super keyword
//Ch.Henry
//17-10-2023
//SuperMethodDemo2.java
import java.io.*;
class Animal
{
    public void display()
    {
        System.out.println("I am an Animal");
    }
}
class Dog extends Animal
{
    public void display()
    {
        System.out.println("I am Dog");
    }
public void printMessage()
    {
        display();
        super.display();
    }
}
public class SuperMethodDemo2
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.printMessage();
    }
}
