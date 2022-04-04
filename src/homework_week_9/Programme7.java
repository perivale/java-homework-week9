package homework_week_9;

import java.util.ArrayList;

public class Programme7 {
    //create main method and call instance method
    public static void main(String[] args) {
        Programme7 obj = new Programme7();
        obj.method1();
    }

    //create instance method and write logic with using arraylist
    public void method1() {
        ArrayList<String> name = new ArrayList();
        name.add("Alprton station");
        name.add("wembley central station");
        name.add("perivale station");
        name.add("harrow-on-the hill station");
        name.add("hengerlane station");
        name.add("kenton station");
        for (String Stationname : name) {
            System.out.println(Stationname.isEmpty());
        }
    }
}
