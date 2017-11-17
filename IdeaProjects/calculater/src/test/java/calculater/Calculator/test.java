package calculater.Calculator;

import org.junit.Test;

import java.util.Calendar;

public class test {

    @Test
    public void add_2_더하기_4는_6(){
        calculater.Calculator.Calculator calculator = new calculater.Calculator.Calculator();
    
    int result = calculator.add(2,4);
    assertTrue( condition:result == 6);
    
    
    }

    private void assertTrue(Object p0) {
    }


    @Test
    public void add_마이너스_3_더하기_5는_8(){
        calculater.Calculator.Calculator = new Calculator();
        int result = calculator.addTwoInteger(-3,5);
        assertTrue(result == 3);


    }

    @Test
    public void 나누기_0_실패(){

        Calculator calculator = Calculator();
        double result

    }

    @Test







}
