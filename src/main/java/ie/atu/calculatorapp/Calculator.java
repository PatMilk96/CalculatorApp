package ie.atu.calculatorapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {
    private String operation;
    private int result;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
