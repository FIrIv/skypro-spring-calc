package pro.sky.skyprospringcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.skyprospringcalc.CalcTestsConstants.*;

public class CalculatorServiceImplParametrizedTests {

    private final CalculatorServiceImpl calc = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(A1, A2),
                Arguments.of(A2, A3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void plus (int a1, int a2) {
        String result = calc.plus(""+a1, ""+a2);
        assertEquals(a1+" + "+a2+" = "+(a1 + a2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void minus (int a1, int a2) {
        String result = calc.minus(""+a1, ""+a2);
        assertEquals(a1+" - "+a2+" = "+(a1 - a2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void multiply (int a1, int a2) {
        String result = calc.multiply(""+a1, ""+a2);
        assertEquals(a1+" * "+a2+" = "+(a1 * a2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void divide (int a1, int a2) {
        String result = calc.divide(""+a1, ""+a2);
        assertEquals(a1+" / "+a2+" = "+((float)a1 / (float)a2), result);
    }

    @Test
    public void divideToZero () {
        CalculatorServiceImpl calc = new CalculatorServiceImpl();

        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.divide(""+A1, ""+A4));
    }
}
