import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Choose an operation(+,-,*,/,%) : ");

            String input = sc.nextLine();
            char ch = input.charAt(0);
            if(input.length()!=1){
                System.out.println(" Oops Error ,Try again ");
                break;
            }
            else {
                calculator cal = new calculator();
                cal.operation(ch);
            }
            boolean exit = false;
            int times = 0;
            int retry = 5;
            for (times = 0; times <= retry; times++) {
                System.out.print("Do you want to continue? (y/n): ");
                String ans = sc.nextLine();
                char ch1 = ans.charAt(0);
                if (ch1 == 'n' && ans.length()==1) {
                    exit = true;
                    break;
                }
                if (ch1 == 'y' && ans.length()==1) {
                    break;
                }
                else{
                    System.out.println("Invalid input");
                }
            }

            if (exit==true) {
                break;
            }
            else if(times>=retry) {
                System.out.println("Maximum times reached run the program again ");
                break;
            }
        }while(true);

    }public int getInteger(int n){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
    public void operation(char ch){
        switch(ch){
            case '+':
                System.out.println("Addition");
                System.out.print("Enter the first number : ");
                int num1 = getInteger(1);
                System.out.print("Enter the second number : ");
                int num2 = getInteger(2);
                int sum = num1 + num2;
                System.out.println("Your sum is " + sum);
                break;
            case '-':
                System.out.println("Subtraction");
                System.out.print("Enter the first number : ");
                int a = getInteger(1);
                System.out.print("Enter the second number : ");
                int b = getInteger(2);
                int sub = a - b;
                System.out.println("Your subtraction is " + sub);
                break;
            case '*':
                System.out.println("Multiplication");
                System.out.print("Enter the first number : ");
                int c = getInteger(1);
                System.out.print("Enter the second number : ");
                int d = getInteger(2);
                int mul = c * d;
                System.out.println("Your product is " + mul);
                break;
            case '/':
                System.out.println("Division");
                System.out.print("Enter the first number : ");
                int m = getInteger(1);
                System.out.print("Enter the second number : ");
                int n = getInteger(2);
                int div = m / n;
                System.out.println("Your quotient is " + div);
                break;
            case '%':
                System.out.println("Percentage");
                System.out.print("Enter the number for percentage :");
                int no = getInteger(1);
                System.out.print("Enter the percent :");
                float p = getInteger(2);
                float per = no*p/100;
                System.out.println("After calculatig "+no+ " of " + p +"% is " + per +"%");
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}