package homework_week_9;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Programme8 {
    public void Test1() {
        //setvalue syntax
        Set<Integer> obj = new HashSet<>();
        //check value
        obj.add(4);
        obj.add(7);
        obj.add(8);

        //using for loop and if digit is between1 to 10
        for (int i = 1; i < 11; i++) {
            if (obj.contains(i))
                System.out.println(i + "  :number hase be found");
            else
                System.out.println(i + "  :number is not in list");
        }
    }
//main method and call method1in this method
    public static void main(String[] args) {
        Programme8 obj = new Programme8();
            obj.Test1();
    }

}







