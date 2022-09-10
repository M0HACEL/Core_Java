public class Calculator {
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


       float result = calculate(num1, num2, operation);
       System.out.println(num1+" "+operation+" "+ num2+" = "+result);

        input.close();
    }
        public static float calculate(float num1, float num2, char operation){
            float result=0;

            switch (operation){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                case '%':
                    result = num1%num2;
                    break;
                case '^':
                    result = (float) Math.pow(num1,num2);
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
            return result;
        }
}
