//Java programme to demonstrate dynamic method dispatch
//Ch.Henry
//16-10-2023
//DynamicDispatchDemo.java
import java.io.*;
class A
{
    void M1()
    {
        System.out.println("Inside A method M1");
    }
}
    class B extends A
    {
        void M1()
        {
            System.out.println("Inside B method M1");
        }
    }
    class C extends A
    {
        void M1()
        {
            System.out.println("Inside C method M1");
        }
    }
    public class DynamicMethodDispatchDemo
    {
        public static void main(String args[])
        {
            A a=new A();
            B b=new B();
            C c=new C();
            A r;
            r=a;
            r.M1();
            r=b;
            r.M1();
            r=c;
            r.M1();
        }
    }
