package com.teste;

import org.junit.Test;

public class CalculadoraTest {

   @Test
   public void testeSomar(){
      Calculadora calc = new Calculadora();
      int soma = calc.somar("1+1+3");

   }
}
