//Java programme to demonstrate the usage of the super keyword with constructor
//Ch.Henry
//17-10-2023
//SuperConstructorDemo.java
import java.io.*;
class Animal
{
Animal()    //Default constructor
    {
        System.out.println("I am Animal");
    }
}
class Dog extends Animal
{
    Dog()                   //child class constructor
    {
        System.out.println("I am dog");  //invoking default constructor
    }
}
public class SuperConstructorDemo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
    }
}
