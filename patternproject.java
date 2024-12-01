//this code is developed by rishav 
//it is basically find your all types of pattern program

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your shape name :");
            System.out.println("1.Rectangle\n2.Right angle triangle\n3.Triangle\n4.Square\n5.I want to exit yet !");
            String shape = sc.nextLine();
            // int choice = sc.nextInt();
            if (shape.equals("Rectangle") || shape.equals("rectangle")){
                rectangle(1);
            } else if (shape.equals("Right angle triangle") || shape.equals("right angle triangle")) {
                rightAngleTriangle(2);
            } else if (shape.equals("Triangle") || shape.equals("triangle")) {
               Triangle(3);
            } else if (shape.equals("Square") || shape.equals("square")) {
               Square(4);
            } else if (shape.equals("I want to exit yet")) {
                System.out.println("Thank you for using rishav's program!");
                return;
            } else {
                System.out.println("Please enter a valid shape name");
            }
            int times = 0;
            int retry = 4;
            for (times = 0; times < retry; times++) {

                System.out.println("Do you want to continue? (yes/no)");
                String input = sc.nextLine();
                if (input.equals("yes")) {
                    break;
                }else if (input.equals("no")) {
                    System.out.println("Thanks for using rishav's pattern program , visit again");
                    return;
                }
                else {
                    System.out.println("Invalid input,try again");
                }
            }

            if (times == retry) {
                System.out.println("Oopsss , Maximum times reached run the program again !");
                return;
            }

        }while(true);
    }public static int getInteger(int rowcol) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        return num;
    }public static void rectangle( int one){
   //rectangle
      System.out.println("Enter the row of the rectangle");
      int row = getInteger(1);
      System.out.println("Enter the column of the rectangle");
      int column = getInteger(2);
      for(int i= 1; i<=row; i++){
          for(int j=1; j<=column; j++) {
              System.out.print(" * ");
          }
          System.out.println();
      }
        System.out.println("Star printing");
      for(int i =1 ; i<=row; i++) {
          for (int j = 1; j <= column; j++) {
              System.out.print(" " + i + " ");
          }
          System.out.println();
      }
        System.out.println("Increasing in row");

        for(int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
        System.out.println("Increasing in column");
        int digit =1; //digit print
        for(int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(" " + digit + " ");
                digit++;
            }
            System.out.println();
        }
        System.out.println("Digit print");
        //squares printing in row
        for (int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(" " + i*i + " ");
            }
            System.out.println();
        }
        System.out.println("Squares printing in row");
        //squares printing in column
        for(int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(" " + j*j + " ");
            }
            System.out.println();
        }
        System.out.println("Squares printing in column");
        //cube printing in row
        for (int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(" " + i*i*i + " ");
            }
            System.out.println();
        }
        System.out.println("Cube printing in row");
        //cube printing in column
        for(int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(" " + j*j*j + " ");
            }
            System.out.println();
        }
        System.out.println("Cube printing in column");
       //Hollow rectangle
        for(int i=1; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("Hollow rectangle");
       //alphabet printing
        for(int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                char c = 'a';
                     c = (char) (c+i-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Alphabet printing in row");
        //alphabet printing
        for (int i =1 ; i<=row; i++) {
            for (int j = 1; j <= column; j++) {
                char c='a';
                 c = (char) (c+j-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Alphabet printing in column");
        System.out.println("All types of rectangle are printed");

    }public static void rightAngleTriangle(int two){
        System.out.println("Enter the number of triangle");
        int row = getInteger(1);

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
             }
            System.out.println();
        }
        System.out.println("Triangle printing in 1st way");
        for (int i = 1; i<=row; i++) {
            for (int j = row; j>=row-i+1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j<=row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println("Triangle printing in 2nd way");

       for (int i=1; i<=row; i++) {
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 3rd way");

        for (int i=1; i<=row; i++) {
            for (int j = 1; j<=row-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 4th way");
        for (int i=1; i<=row; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 5th way");
        for (int i=1; i<=row; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 6th way");
        for (int i=1; i<=row; i++) {
            for (int j = 1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 7th way");
        for (int i=1; i<=row; i++) {
            for (int j = 1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 8th way");
        for (int i=1; i<=row; i++) {
            for (int j = 1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 9th way");
        for (int i=1; i<=row; i++) {
            for (int j = row; j>=row-i+1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j<=row; j++) {
                System.out.print(" "+j);

            }
            System.out.println();
        }
        System.out.println("Triangle printing in 10th way");
        for (int i=1; i<=row; i++) {
            for (int j = row; j>=row-i+1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j<=row; j++) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 11th way");
        for (int i=row; i>=1; i--) {
            for (int j = row; j>=row-i+1; j--) {
                System.out.print("  ");
            }
            for (int j = row; j>=i; j--) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 12th way");
        for (int i=1; i<=row; i++) {
            for (int j = row; j>=row-i+1; j--) {
                System.out.print("  ");
            }
            for (int j = row; j>=i; j--) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 13th way");
        for (int i=1; i<=row; i++) {
            for(int j= 1; j<=i; j++) {
                char c = (char) ('a' + i - 1);
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 14th way");
        for (int i = 1; i<=row; i++) {
            for (int j = 1; j<=i; j++) {
                char c = (char) ('a' + j - 1);
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 15th way");
        for (int i=1; i<=row; i++) {
            for(int j = 1; j<=row-i+1; j++) {
                char c = (char) ('a'+i-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 16th way");
        for (int i=1; i<=row; i++) {
            for(int j = 1; j<=row-i+1; j++) {
                char c = (char) ('a'+j-1);
                System.out.print(c+" ");

            }
            System.out.println();
        }
        System.out.println("Triangle printing in 17th way");
        for(int i=1; i<=row; i++){
            for(int j=row; j>=row-i+1; j--) {
             System.out.print("  ");
            }
            for (int j = i; j<=row; j++) {
                char c = (char) ('a'+i-1);
                System.out.print(" " +c);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 18th way");
        for (int i=1; i<=row; i++) {
            for(int j=row; j>=row-i+1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j<=row; j++) {
                char c = (char) ('a'+i-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 19th way");
        for (int i=1; i<=row; i++) {
            for(int j=1; j<=row-i+1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                char c = (char)('a'+i-1);
                System.out.print(" "+c);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 20th way");
        for (int i=1; i<=row; i++) {
            for(int j=1; j<=row-i+1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                char c = (char) ('a'+j-1);
                System.out.print(" "+c);
            }
            System.out.println();
        }
        System.out.println("Triangle printing in 21th way");
        System.out.println("\nFrom my side, All types of right angle triangle are printed");
    }public static void Triangle(int three) {
        System.out.print("Enter the number for your triangle :");
        int row = getInteger(1);
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i-1; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 1st way");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in Palindrome way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(i+" ");
            }
            for (int j = i-1; j>=1; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 3rd way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                char c = (char) ('a'+j-1);
                System.out.print(c+" ");
            }
            for (int j = i-1; j>=1; j--) {
                char c = (char) ('a'+j-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 4th way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                char c = (char) ('a'+i-1);
                System.out.print(c+" ");
            }
            for (int j = i-1; j>=1; j--) {
                char c = (char) ('a'+i-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 5th way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j<=i-1; j++){
                System.out.print("  ");
            }
            for (int j = 1; j<=(2*row)-(2*i-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("This is reverse triangle");
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=(2*row)-(2*i-1); j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 6th way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=(2*row)-(2*i-1); j++) {
                char c = (char) ('a'+i-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 7th way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=row-i+1; j++) {
                System.out.print(j+" ");
            }
            for (int j = row-i; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 8th way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = row; j>=i; j--) {
                System.out.print(j+" ");
            }
            for (int j = i+1; j<= row; j++) {
               System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 9th way");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=row-i+1; j++) {
                char c = (char) ('a'+j-1);
                System.out.print(c+" ");
            }
            for (int j = row-i; j>=1; j--) {
               char c = (char) ('a'+j-1 );
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("Triangle in 10th way");
    }
    public static void Square(int four){
        System.out.println("Enter the side of square :");
        int side = getInteger(1);
        for (int i = 1; i <= side; i++){
            for (int j = 1; j <= side; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("This is your first square");

        for (int i = 1; i <= side; i++){
            for (int j = 1; j <= side; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("This is your second square");

        for (int i = 1; i <= side; i++){
            for (int j = 1; j <= side; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("This is your third square");
        for (int i = side; i >= 1; i--){
            for (int j = side; j >= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("This is your fourth square");
        for (int i = side; i >= 1; i--){
            for (int j = side; j >= 1; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("This is your fifth square");
        for (int i = 1; i <= side; i++){
            for (int j = 1; j <= side; j++){
                char c = (char) ('a'+i-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("This is your sixth square");
        for (int i = side; i >= 1; i--){
            for (int j = side; j >= 1; j--){
                char c = (char) ('a'+j-1);
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("This is your sixth square");
        for (int i = side; i >= 1; i--){
            for (int j = side; j >= 1; j--){
                char c = (char) ('a'+i-1);
                System.out.print(c+" ");

            }
            System.out.println();
        }
        System.out.println("This is your sixth square");
    }

}
