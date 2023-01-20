package Collections;

import java.io.*;
import java.util.*;
public class Numbers {
        public static void main(String[] args)
        {


            Collection<Integer> arrlist = new ArrayList<Integer>(5);


            arrlist.add(15);
            arrlist.add(20);
            arrlist.add(25);


            for (Integer number : arrlist) {
                System.out.println("Number = " + number);
            }
        }
    }

