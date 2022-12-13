import java.io.*;
import java.util.LinkedList;
  

public class GFG {
    public static void main(String args[])
    {    
        LinkedList list = new LinkedList();        
        list.add("adding");
        list.add("words");
        list.add("in");
        list.add("linked");
        list.add("list");
        System.out.println("The list is:" + list);
        list.add("New");
        list.add("Words");        
        System.out.println("The new List is:" + list);
    }
}
