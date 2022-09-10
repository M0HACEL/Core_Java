package Demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        float num1,num2;
        char operation;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        num1 = input.nextFloat();

        System.out.print("Enter Second Number: ");
        num2 = input.nextFloat();
        System.out.print("Enter the operation (+ - * / ^) : ");
        operation = input.next().charAt(0);


        calculate(num1, num2, operation);

        input.close();
    }
    public static void calculate(float num1, float num2, char operation){
        if(operation=='+'){
            System.out.println(num1+" + "+num2+" = "+(num1+num2));
        } else if (operation=='-') {
            System.out.println(num1+" - "+num2+" = "+(num1-num2));
        } else if (operation=='*') {
            System.out.println(num1+" * "+num2+" = "+(num1*num2));
        } else if (operation=='/') {
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        } else if (operation=='%') {
            System.out.println(num1+" % "+num2+" = "+(num1%num2));
        } else if (operation=='^') {
            System.out.println(num1+" ^ "+num2+" = "+(Math.pow(num1,num2)));
        }else {
            System.out.println("Invalid Input");
        }
    }

}