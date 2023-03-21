import java.util.*;

public class sheetFour {
  public static void main(String[] args) {
    // EXERCISE 4 - 5
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your line:");
    String str = input.next();
    StringBuilder output = new StringBuilder();
    int count = 1;

    for (int i = 1; i <= str.length(); i++) {
        if (i == str.length() || str.charAt(i) != str.charAt(i - 1)) {
            output.append(count);
            output.append(str.charAt(i - 1));
            count = 1;
        } else {
            count++;
        }
    }

    System.out.println(output.toString()); // Output: 12W1B12W3B24W1B14W


    // EXERCISE 4 - 6
    int rolls = 0;
    int die1, die2;
    
    do {
      die1 = (int)(6 * Math.random()) + 1;
      die2 = (int)(6 * Math.random()) + 1;
      rolls++;
    } while (die1 != 1 && die2 != 1);
    
    System.out.println("It took " + rolls + " rolls to get snake eyes.");


    // EXERCISE 4 - 7
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();
    
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=n; j++) {
        if (i==1 || i==n || j==1 || j==n) {
          System.out.print("* ");
        }
        else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }


    // EXERCISE 4 - 8
    int maxDivisors = 0;
    int numberWithMaxDivisors = 0;
    
    for (int i = 1; i <= 10000; i++) {
      int divisors = 0;
      
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          divisors++;
        }
      }
      
      if (divisors > maxDivisors) {
        maxDivisors = divisors;
        numberWithMaxDivisors = i;
      }
    }
    
    System.out.println("The number between 1 and 10000 with the largest number of divisors is " + numberWithMaxDivisors + " with " + maxDivisors + " divisors.");

    input.close();
  }
}