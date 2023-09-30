package ie.atu.calculatorapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public Calculator calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        int result = 0;
        if(Objects.equals(operation, "add")){
            result = num1 + num2;
        }
        else if(Objects.equals(operation, "subtract")){
            result = num1 - num2;
        }
        else if(Objects.equals(operation, "multiply")){
            result = num1 * num2;
        }
        else if(Objects.equals(operation, "Divide")){
            result = num1 / num2;
        }

        return new Calculator(operation, result);
    }
}
