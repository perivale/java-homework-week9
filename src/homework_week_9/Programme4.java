package homework_week_9;

import java.util.ArrayList;
//java .util.arraylist is for creating the Arraylist syntax
public class Programme4 {
    public static void main(String[] args) {
        //by using Arraylist colour printout
        ArrayList<String>colourlist =new ArrayList();
        colourlist.add("Yellow");
        colourlist.add("Black");
        colourlist.add("White");
        colourlist.add("Pink");
        colourlist.add("Black");
        colourlist.add("Brown");
        colourlist.add("Green");
        colourlist.add("Red");

        //printout the collectiob by using each loop
        for(String colour:colourlist){
            //now collection of colours
            System.out.println(colour);
            System.out.println();

        }

    }
}
