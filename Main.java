package  Demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int n = input.nextInt();
//        First Method
//        =======================
        n = ( n%2==0?0:1 );

        switch (n) {
            case 0 -> System.out.println("Even");
            case 1 -> System.out.println("Odd");
        }

//      Second Method
//      ====================

        switch (n%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
        }
    }
}