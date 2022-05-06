package org.incubyte;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorKata {
  public List<Integer> getPrimeFactors(int input) {
    this.validateInput(input);
    return generatePrimeFactors(input);
  }

  private List<Integer> generatePrimeFactors(int input) {
    List<Integer> primeFactors = new ArrayList<>();

    int reminder = input;
    for (int divisor = 2; divisor <= reminder; divisor += 1) {
      reminder = calculatePrimeFactor(primeFactors, reminder, divisor);
    }
    return primeFactors;
  }

  private int calculatePrimeFactor(List<Integer> primeFactors, int reminder, int divisor) {
    while (reminder % divisor == 0) {
      primeFactors.add(divisor);
      reminder = reminder / divisor;
    }
    return reminder;
  }

  public void validateInput(int input) {
    if (input <= 0) {
      throw new ArithmeticException();
    }
  }
}
