package homework_week_9;


import java.util.Arrays;

public class programme3 {
    // creat main method and call instance method
    public static void main(String[] args) {
        Test1();

    }// instance method for write a logic
    public static void Test1(){
        //Arraylist syntax
        int a[]={1,2,3,4,5,6,7,8,9,10};
        //print sequence of number stetement
        System.out.println("sequence of number::"+ Arrays.toString(a));
        for(int i=0;i< a.length;i++){
            int num=a[i];
            a[i]=a[a.length-i-1];
        }
        System.out.println("Reverse number:"+Arrays.toString(a));
    }
}
