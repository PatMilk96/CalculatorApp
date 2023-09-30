package ie.atu.calculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
public class CalculatorAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorAppApplication.class, args);
    }

}
