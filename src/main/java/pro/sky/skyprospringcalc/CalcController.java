package pro.sky.skyprospringcalc;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalculatorService calculatorService;

    public CalcController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello () {
        return calculatorService.hello();
    }

    @GetMapping ("/plus")
    public String plus (@RequestParam("num1") String num1,@RequestParam("num2")  String num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping ("/minus")
    public String minus (@RequestParam("num1") String num1,@RequestParam("num2")  String num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping ("/multiply")
    public String multiply (@RequestParam("num1") String num1,@RequestParam("num2")  String num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping ("/divide")
    public String divide (@RequestParam("num1") String num1,@RequestParam("num2")  String num2) {
        return calculatorService.divide(num1, num2);
    }
}
