package homework_week_9;

import java.util.ArrayList;

public class Programme6 {
    public static void main(String[] args) {
//to call inmain method
        Programme6 obj = new Programme6();
        obj.method1();
    }
    //create a method and write logic with arraylist
    public void method1() {
        ArrayList<Integer> x = new ArrayList();
        x.add(01);
        x.add(02);
        x.add(03);
        x.add(04);
        x.add(05);
        x.add(06);
        //for each loop to get all index number
        for (Integer Y : x) {
            System.out.println(Y);
        }
        System.out.println("Retrieve the number of given index");
        System.out.println(x.get(06));
    }
}
