import org.incubyte.PrimeFactorKata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class PrimeFactorTest {

  PrimeFactorKata primeFactorkata;

  @BeforeEach
  void init() {
    primeFactorkata = new PrimeFactorKata();
  }

  @Test
  void should_return_empty_list_for_input_1() {
    List<Integer> result = primeFactorkata.getPrimeFactors(1);

    assertThat(result.size()).isZero();
  }

  @Test
  void should_throw_error_for_negative_numbers_and_zero() {
    assertThatThrownBy(() -> {
      List<Integer> result = primeFactorkata.getPrimeFactors(0);
    }).isInstanceOf(ArithmeticException.class);
  }

  @Test
  void should_return_non_empty_list_for_input_2() {
    List<Integer> result = primeFactorkata.getPrimeFactors(2);

    assertThat(result.size()).isOne();
  }

  @Test
  void should_return_empty_list_for_input_3() {
    List<Integer> result = primeFactorkata.getPrimeFactors(3);

    assertThat(result.size()).isEqualTo(1);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(3));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_4() {
    List<Integer> result = primeFactorkata.getPrimeFactors(4);

    assertThat(result.size()).isEqualTo(2);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 2));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_5() {
    List<Integer> result = primeFactorkata.getPrimeFactors(5);

    assertThat(result.size()).isEqualTo(1);
    List<Integer> expectedResult = new ArrayList<Integer>(List.of(5));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_6() {
    List<Integer> result = primeFactorkata.getPrimeFactors(6);
    assertThat(result.size()).isEqualTo(2);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 3));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_8() {
    List<Integer> result = primeFactorkata.getPrimeFactors(8);
    assertThat(result.size()).isEqualTo(3);
  }

  @Test
  void should_return_non_empty_list_for_input_9() {
    List<Integer> result = primeFactorkata.getPrimeFactors(9);
    assertThat(result.size()).isEqualTo(2);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(3, 3));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_18() {
    List<Integer> result = primeFactorkata.getPrimeFactors(18);
    assertThat(result.size()).isEqualTo(3);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 3, 3));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_25() {
    List<Integer> result = primeFactorkata.getPrimeFactors(25);
    assertThat(result.size()).isEqualTo(2);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(5, 5));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_64() {
    List<Integer> result = primeFactorkata.getPrimeFactors(64);
    assertThat(result.size()).isEqualTo(6);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2,2,2,2,2,2));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_74() {
    List<Integer> result = primeFactorkata.getPrimeFactors(74);
    assertThat(result.size()).isEqualTo(2);
    List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 37));
    assertThat(result).isEqualTo(expectedResult);
  }
}
