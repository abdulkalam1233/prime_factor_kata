import org.assertj.core.api.ListAssert;
import org.incubyte.PrimeFactorKata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class PrimeFactorTest {

  PrimeFactorKata primeFactorkata;

  @BeforeEach
  void init() {
    primeFactorkata = new PrimeFactorKata();
  }

  @Test
  void should_return_empty_list_for_input_1() {
    List<Integer> result = primeFactorkata.getPrimeFactors(1);

    assertThat(result).asList().isEmpty();
  }

  @Test
  void should_throw_error_for_negative_numbers_and_zero() {
    assertThatThrownBy(() -> {
      List<Integer> result = primeFactorkata.getPrimeFactors(0);
    }).isInstanceOf(ArithmeticException.class);
  }

  @Test
  void should_return_empty_list_for_input_3() {
    List<Integer> result = primeFactorkata.getPrimeFactors(3);

    assertThat(result).asList().hasSize(1);
    List<Integer> expectedResult = new ArrayList<>(){
      {
        add(3);
      }
    };
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_4() {
    List<Integer> result = primeFactorkata.getPrimeFactors(4);

    assertThat(result).asList().hasSize(2);
    List<Integer> expectedResult = new ArrayList<>(Arrays.asList(2, 2));
    assertThat(result).isEqualTo(expectedResult);
  }

  @Test
  void should_return_non_empty_list_for_input_18() {
    List<Integer> result = primeFactorkata.getPrimeFactors(18);

    assertThat(result).asList().hasSize(3);
    List<Integer> expectedResult = new ArrayList<>(Arrays.asList(2, 3, 3));
    assertThat(result).isEqualTo(expectedResult);
  }
}
