package homework_week_9;

import java.util.HashMap;
import java.util.Map;
//improt java .util.map and java.util.hashmap

public class Programme9 {
    //creating method with loop
    public void method1(){

        HashMap<String ,Integer>object=new HashMap<>();
        //using value to the map
        object.put("shilpa",10);
        object.put("kinjal",20);
        object.put("jalpa",30);
        object.put("megha",40);
        object.put("neha",50);
        object.put("mira",60);
        object.put("gopi",70);

        for(Map.Entry<String,Integer>people:object.entrySet()){
            System.out.println(people);
        }
    }
//create main method and call method1
    public static void main(String[] args) {
        //create obj
        Programme9 obj=new Programme9();
        obj.method1();
    }
}
