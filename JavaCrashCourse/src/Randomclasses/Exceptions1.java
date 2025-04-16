package Randomclasses;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            int number1 = 5;
            int number2 = 0;
            int result = number1 / number2;
            System.out.println(result);
        } catch (Exception a) {

            System.out.println("don't divide a number by zero");
        }
    }
}

