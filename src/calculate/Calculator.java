package calculate;

public class Calculator<ifsymbol> {
    //instance method
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    //instance mrthod
    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    //instance method
    public void divison(int a, int b) {
        System.out.println(a / b);
    }

    //instance method
    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    //one more method with 3 parameter
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
          addition( a ,b);
        } else if (symbol == '-') {
           subtraction(a,b);
        }  else if(symbol =='/') {
           divison(a,b);
        } else if(symbol =='*'){
              multiplication(a,b);
        }else {
            System.out.println("invalid symbol");
        }
        }
    }

