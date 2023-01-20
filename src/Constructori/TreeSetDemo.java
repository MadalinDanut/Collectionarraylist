package Collections;

import java.util.*;

public class TreeSetDemo {

    // Main Method
    public static void main(String args[])
    {

        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Car");
        ts.add("For");
        ts.add("Car");
        ts.add("Is");
        ts.add("Very helpful");


        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}