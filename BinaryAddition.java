package Demo;

import java.util.Scanner;

public class BinaryAddition{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first binary Number: ");
        Integer a = input.nextInt();

        System.out.print("Enter the second binary Number: ");
        Integer b = input.nextInt();

        /*----------------------calculate the length using String.valueOf()  method---------------*/
        int lengthA = String.valueOf(a).length();
        int lengthB = String.valueOf(b).length();

        int size = lengthA>lengthB ? lengthA+1:lengthB+1;
        System.out.println("Array size = "+size); //maxLength+1

        int sum=0,carry=0;
        int[] res = new int[size];

        /*---------------------------take the last digit--------------*/


        System.out.println("First Number = "+a);
        System.out.println("Second Number= "+b);

        for (int i=size-1; i>=0;i--){
            int digit1= a%10; // take the last (number%10)
            int digit2 = b%10;

            sum = digit1 + digit2 + carry;

            a= a/ 10; //remove last digit (number/10)
            b = b/ 10;
            if(sum==0){
                res[i] = 0;
                carry = 0;
            }
            else if(sum==1){
                res[i] = 1;
                carry = 0;
            }
            else if(sum==2){
                res[i] = 0;
                carry = 1;
            }
            else if(sum==3){
                res[i] = 1;
                carry = 1;
            }
        }

        for (int i:res
        ) {
            System.out.print(i+" ");
        }

    }
}