package fr;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdditionTest {
    @Test
    public void one_plus_zero_return_one() {
        String result = ReversePolishNotation.calculate("1 0 +");
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void two_plus_zero_return_two() {
        String result = ReversePolishNotation.calculate("2 0 +");
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void three_plus_zero_return_three() {
        String result = ReversePolishNotation.calculate("3 0 +");
        assertThat(result).isEqualTo("3");
    }

    @Test
    public void twelve_plus_zero_return_twelve() {
        String result = ReversePolishNotation.calculate("12 0 +");
        assertThat(result).isEqualTo("12");
    }

    @Test
    public void zero_plus_one_return_one() {
        String result = ReversePolishNotation.calculate("0 1 +");
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void zero_plus_twelve_return_twelve() {
        String result = ReversePolishNotation.calculate("0 12 +");
        assertThat(result).isEqualTo("12");
    }

    @Test
    public void one_plus_one_return_two() {
        String result = ReversePolishNotation.calculate("1 1 +");
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void one_hundred_and_ten_plus_20_return_130() {
        String result = ReversePolishNotation.calculate("110 20 +");
        assertThat(result).isEqualTo("130");
    }

    @Test
    public void twenty_plus_110_return_130() {
        String result = ReversePolishNotation.calculate("20 110 +");
        assertThat(result).isEqualTo("130");
    }
}