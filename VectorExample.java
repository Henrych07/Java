//Java programme to demonstrate java vector
//Ch.henry
//16-10-2023
//VectorExample.java
import java.util.*;
public class VectorExample
{
    public static void main(String args[])
    {
        Vector<String>vec = new Vector<String>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        vec.addElement("Rat");
        vec.addElement("cat");
        vec.addElement("Deer");
        System.out.println("Elements are: "+vec);
    }
}
