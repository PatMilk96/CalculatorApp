package ie.atu.calculatorapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
@RestController
public class CalculatorController {

    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public Calculator calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation){
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
        else if(Objects.equals(operation, "divide")){
            result = num1 / num2;
        }

        return new Calculator(operation, result);
    }
}
