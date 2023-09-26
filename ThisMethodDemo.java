//Java programm to demonstrate this method demo
//25-09-2023
//ThisMethodDemp.java
class A{
    void m(){
        System.out.println("Inside method m");
    }
    void n()
    {
        System.out.println("Inside method n");
        this.m();
    }
}
public class ThisMethodDemo
{
    public static void main(String args[])
    {
        A a=new A();
        a.n();
    }
}
