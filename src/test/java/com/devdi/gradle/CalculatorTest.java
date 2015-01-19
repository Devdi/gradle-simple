package com.devdi.gradle;

public class CalculatorTest {

   @org.junit.Test
   public void test() {
      Calculator calculator = new Calculator();
      int three = calculator.add(1, 2);
      org.junit.Assert.assertEquals(three, 3);
   }

}