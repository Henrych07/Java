//Java programme to demonstrate multilevel inheritance
//Ch.Henry
//3-10-2023
//MultilevelInheritanceDemo1.java
import java.io.*;
class Animal
{
    void eat()
    {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog can bark");
    }
}
class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("BabyDog can weep");
    }
}
public class MultilevelInheritanceDemo1
{
    public static void main(String args[])
    {
        BabyDog d = new BabyDog();
        d.eat();
        d.bark();
        d.weep();
    }
}
