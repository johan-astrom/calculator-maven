package se.iths;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static Calculator calc;

    @BeforeEach
    void instance(){
        calc=new Calculator();
    }

    @Test
    @DisplayName("Testar add-metoden i calculator")
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

  /*  @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testAdd(int n){
        assertEquals(1+n, calc.add(1, n));
    }*/




}

