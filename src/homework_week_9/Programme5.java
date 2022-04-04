package homework_week_9;

import javafx.beans.binding.ListExpression;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5 {
    //create main method and instance method
    public static void main(String[] args) {
    Programme5 obj=new Programme5();
    obj.m1();
    }
    //write method to write in logic with array list
    public void m1() {
        //Array synteax
        ArrayList<Integer>number=new ArrayList();
        number.add(01);
        number.add(02);
        number.add(03);
        number.add(04);
        number.add(05);
        number.add(06);
        number.add(07);

        Iterator obj= number.listIterator();
        while ((obj.hasNext()));
        System.out.println(obj.next());




    }
}
