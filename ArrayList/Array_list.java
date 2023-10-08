package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_list {

    public static void main(String[] args) {
        
        ArrayList<Integer> subMarks =new ArrayList<Integer>();

        subMarks.add(50);
        subMarks.add(34);
        subMarks.add(45);
        subMarks.add(85);
        subMarks.add(64);

        System.out.println(subMarks);

        Collections.sort(subMarks);
        System.out.println(subMarks);

        Iterator itr=subMarks.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        subMarks.remove(4);
        System.out.println(subMarks);



        

    }

    
}
