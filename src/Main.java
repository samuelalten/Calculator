import java.util.Scanner;


class Calculator{

    double a = 0;
    double b = 0;

    Calculator(double x, double y){
        a = x;
        b = y;
    }

    double add(){
        return a + b;
    }

    double sub(){
        return a-b;

    }

    double mul(){
        return a * b;
    }

    double div(){
        return a/b;
    }





}
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my Calculator !!!");
//        System.out.println("Calculator can do these following operations :-");
//        System.out.println("(1) Addition");
//        System.out.println("(2) Substraction");
//        System.out.println("(3) Multiplication");
//        System.out.println("(4) Division");
//        System.out.println("(5) Square Root");
//        System.out.println("(6) Power raise to");
//        System.out.println();
        Scanner sc = new Scanner(System.in);
//        System.out.print("Choose an option (Serial number) : ");
//        int choice = sc.nextInt();
//
//        switch(choice){
//
//            case 1 :
//
//
//        }

        System.out.print("Enter number 1 : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter number 2 : ");
        double num2 = sc.nextDouble();

        Calculator algebra = new Calculator(num1,num2);

        System.out.println();

        System.out.println("Calculator can do these following operations :-");
        System.out.println("(1) Addition");
        System.out.println("(2) Substraction");
        System.out.println("(3) Multiplication");
        System.out.println("(4) Division");

        System.out.println();

        System.out.print("Choose an option (Serial number) : ");
        int choice = sc.nextInt();

        double result = 0;
        switch(choice){

            case 1 :
                result = algebra.add();
                break;

            case 2 :
                result = algebra.sub();
                break;
            case 3 :
                result = algebra.mul();
                break;

            case 4:
                result = algebra.div();
                break;
            default:
                System.out.println("Operation not found !!!");
        }

        System.out.println("Result : "+result);

     }
}