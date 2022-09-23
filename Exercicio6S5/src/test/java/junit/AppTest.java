package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    Calculadora test = new Calculadora(12, 12, "Multiplicação");
    Calculadora test2 = new Calculadora(1, 12, "Soma");
    Calculadora test3 = new Calculadora(14, 12, "Subtração");
    Calculadora test4 = new Calculadora(0, 12, "Divisão");
    Calculadora test5 = new Calculadora(24, 12, "Divisão");

    @Test
    void testCalc1() {
        assertEquals(144, test.choiceOperation());
    }

    @Test
    void testCalc2(){
        assertEquals(13, test2.choiceOperation());
    }

    @Test
    void testCalc3(){
        assertEquals(-11, test3.choiceOperation());
    }

    @Test
    void testCalc4(){
        assertEquals(0, test4.choiceOperation());
    }
    
}
