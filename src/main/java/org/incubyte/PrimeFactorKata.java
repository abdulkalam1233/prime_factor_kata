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

    int num = input;
    for (int idx = 2; idx <= num; idx += 1) {
      num = calculatePrimeFactor(primeFactors, num, idx);
    }
    return primeFactors;
  }

  private int calculatePrimeFactor(List<Integer> primeFactors, int num, int idx) {
    while (num % idx == 0) {
      primeFactors.add(idx);
      num = num / idx;
    }
    return num;
  }

  public void validateInput(int input) {
    if (input <= 0) {
      throw new ArithmeticException();
    }
  }
}
