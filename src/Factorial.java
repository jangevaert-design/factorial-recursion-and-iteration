public class Factorial {

  public static void main(String[] args) {
    System.out.println("factorial of 7 using recursion is " + factorial(7));
    System.out.println("factorial of 6 using iteration is " + fact(7));
  }

  public static int factorial(int number) {
    if (number == 0) {
      return 1;
    }
    return number*factorial(number - 1);
  }

  public static int fact(int number) {
    int result = 1;
    while (number != 0) {
      result *= number;
      number--;
    }
    return result;
  }

}
