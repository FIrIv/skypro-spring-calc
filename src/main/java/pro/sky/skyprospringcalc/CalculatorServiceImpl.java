package pro.sky.skyprospringcalc;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }
    @Override
    public String plus(String num1, String num2) {
        try {
        int myNum1 = Integer.parseInt(num1);
        int myNum2 = Integer.parseInt(num2);
        return myNum1 + " + " + myNum2 + " = " + (myNum1+myNum2);
        } catch (NumberFormatException e) {
            return ("Неверный формат данных!");
        }
    }
    @Override
    public String minus(String num1, String num2) {
        try {
        int myNum1 = Integer.parseInt(num1);
        int myNum2 = Integer.parseInt(num2);
        return myNum1 + " - " + myNum2 + " = " + (myNum1-myNum2);
        } catch (NumberFormatException e) {
            return ("Неверный формат данных!");
        }
    }
    @Override
    public String multiply(String num1, String num2) {
        try {
        int myNum1 = Integer.parseInt(num1);
        int myNum2 = Integer.parseInt(num2);
        return myNum1 + " * " + myNum2 + " = " + (myNum1*myNum2);
        } catch (NumberFormatException e) {
            return ("Неверный формат данных!");
        }
    }
    @Override
    public String divide(String num1, String num2) {
        try {
        int myNum1 = Integer.parseInt(num1);
        int myNum2 = Integer.parseInt(num2);
        if (myNum2 == 0) return "На ноль делить нельзя!";
        float divideNum = 0f;
        divideNum = (float)myNum1/(float)myNum2;
        return myNum1 + " / " + myNum2 + " = " + divideNum;
        /*} catch (ArithmeticException e) {
            return "На ноль делить нельзя!"; не ловит, делит на ноль и возвращает бесконечность (Infinity)*/
        } catch (NumberFormatException e) {
            return ("Неверный формат данных!");
        }
    }
}
