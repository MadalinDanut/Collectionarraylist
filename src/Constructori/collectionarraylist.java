package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class collectionarraylist {

        public static void main(String args[])
        {


            Collection<String> list = new ArrayList<String>();


            System.out.println("The ArrayList is: " + list);

            try {

                list.add(null);
            }


            catch (Exception e) {

                System.out.println("Exception: " + e);
            }
        }
    }

