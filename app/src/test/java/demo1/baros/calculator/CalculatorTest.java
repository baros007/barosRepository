package demo1.baros.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    //Arrange
    Calculator calculator = new Calculator();

    @Test
    public void หนึ่งบวกสองเท่ากับสาม(){
        //Act
        double actualResult = calculator.addplus(1, 2);
        //Assert
        // assertEquals([expected result], [actual result]);
        assertEquals(3.0, actualResult);
    }

    @Test
    public void ลบ(){
        assertEquals(3.0, calculator.minus(6, 3));
        assertEquals(5.0, calculator.minus(6, 1));
        assertEquals(-3.0, calculator.minus(6, 9));
    }

//    @Test
//    public void หกลบสามเท่ากับสาม(){
//        //Act
//        double actualResult = calculator.minus(6, 3);
//        //Assert
//        // assertEquals([expected result], [actual result]);
//        assertEquals(3.0, actualResult);
//    }

    @Test
    public void สองคูณสามเท่ากับหก(){
        //Act
        double actualResult = calculator.kun(2, 3);
        //Assert
        // assertEquals([expected result], [actual result]);
        assertEquals(6.0, actualResult);
    }

    @Test
    public void หกหารสามเท่ากับสอง(){
        //Act
        double actualResult = calculator.divide(6, 3);
        //Assert
        // assertEquals([expected result], [actual result]);
        assertEquals(2.0, actualResult);
    }

    @Test(expected = DivideByZeroException.class)
    public void หกหารศูนย์จะเกิดข้อผิดพลาด_DivideByZeroException(){
        //Act
        double actualResult = calculator.divide(2, 0);
    }

//    @Test
//    public void หกหารศูนย์จะเกิดข้อผิดพลาด2_DivideByZeroException(){
//        //Act
//        try {
//            calculator.divide(2, 0);
//            fail("Fail Test...");
//        }catch(DivideByZeroException e){
//
//        }
//    }

}
