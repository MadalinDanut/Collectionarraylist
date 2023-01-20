package Collections;
import java.util.*;

public class HashMapDemo {


    public static void main(String args[])
    {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Apple");
        hm.put(2, "For");
        hm.put(3, "Apple");

        System.out.println("Value for 1 is " + hm.get(1));

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
