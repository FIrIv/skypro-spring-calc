package pro.sky.skyprospringcalc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static pro.sky.skyprospringcalc.CalcTestsConstants.*;

public class CalculatorServiceImplTest {

    @Test
    public void plus () {
        CalculatorServiceImpl calc = new CalculatorServiceImpl();

        List<String> expected = new ArrayList<>();
        String expected1 = calc.plus(""+A1, ""+A2);
        String expected2 = calc.plus(""+A2, ""+A3);
        expected.add(expected1);
        expected.add(expected2);

        List<String> actual = new ArrayList<>();
        String actual1 = A1 + " + " + A2 + " = " + (A1 + A2);
        String actual2 = A2 + " + " + A3 + " = " + (A2 + A3);
        actual.add(actual1);
        actual.add(actual2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus () {
        CalculatorServiceImpl calc = new CalculatorServiceImpl();

        List<String> expected = new ArrayList<>();
        String expected1 = calc.minus(""+A1, ""+A2);
        String expected2 = calc.minus(""+A2, ""+A3);
        expected.add(expected1);
        expected.add(expected2);

        List<String> actual = new ArrayList<>();
        String actual1 = A1 + " - " + A2 + " = " + (A1 - A2);
        String actual2 = A2 + " - " + A3 + " = " + (A2 - A3);
        actual.add(actual1);
        actual.add(actual2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiply () {
        CalculatorServiceImpl calc = new CalculatorServiceImpl();

        List<String> expected = new ArrayList<>();
        String expected1 = calc.multiply(""+A1, ""+A2);
        String expected2 = calc.multiply(""+A2, ""+A3);
        expected.add(expected1);
        expected.add(expected2);

        List<String> actual = new ArrayList<>();
        String actual1 = A1 + " * " + A2 + " = " + (A1 * A2);
        String actual2 = A2 + " * " + A3 + " = " + (A2 * A3);
        actual.add(actual1);
        actual.add(actual2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divide () {
        CalculatorServiceImpl calc = new CalculatorServiceImpl();

        List<String> expected = new ArrayList<>();
        String expected1 = calc.divide(""+A1, ""+A2);
        String expected2 = calc.divide(""+A2, ""+A3);
        expected.add(expected1);
        expected.add(expected2);

        List<String> actual = new ArrayList<>();
        String actual1 = A1 + " / " + A2 + " = " + ((float)A1 / (float)A2);
        String actual2 = A2 + " / " + A3 + " = " + ((float)A2 / (float)A3);
        actual.add(actual1);
        actual.add(actual2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideToZero () {
        CalculatorServiceImpl calc = new CalculatorServiceImpl();

        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.divide(""+A1, ""+A4));
    }
}
