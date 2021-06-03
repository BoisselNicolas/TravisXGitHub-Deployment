package com.mycompany.app;

public class App 
{
  public static int add(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  public static int multiply(int multiplicand, int multiplier) {
    return multiplicand * multiplier;
  }

  public static int divide(int dividend, int divisor) {
    if (divisor == 0)
      throw new IllegalArgumentException("Cannot divide by zero (0).");

    return dividend / divisor;
  }

  public static int soustraction (int firstNumber, int secondNumber){
      return firstNumber - secondNumber;
  }

  public static int racine(int n) {
    int tmp;
    int d = n / 2;
    do {
       tmp = d;
       d = (tmp + (n / tmp)) / 2;
    } while ((tmp - d) != 0);
    return d;
}

  public static void main( String[] args )
  {
    System.out.println("Hello World");
  }
}