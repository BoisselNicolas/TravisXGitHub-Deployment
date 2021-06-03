package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
      // Arrange
      final int expected = 4;
  
      // Act
      final int actual = App.add(2, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }    
    @Test
    public void multiply_FourTimesTwo_ReturnsEight() {
      // Arrange
      final int expected = 8;
  
      // Act
      final int actual = App.multiply(4, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }        

    @Test
    public void divide_TenDividedTwo_ReturnsFive() {
      // Arrange
      final int expected = 5;
  
      // Act
      final int actual = App.divide(10, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }           

    @Test
    public void divide_TenDividedZero_ReturnsThrow() {
    
      try {
        App.divide(10, 0);
      }catch(IllegalArgumentException aExp){
        assert(aExp.getMessage().contains("Cannot divide by zero (0)."));
      }
    }   

    @Test
    public void soustraction_TenSoustractByTwo_ReturnsEight() {
      // Arrange
      final int expected = 8;
  
      // Act
      final int actual = App.soustraction(10, 2);
  
      // Assert
      Assert.assertEquals(expected, actual);
    }          
    
    @Test
    public void racine_OfFour_ReturnsTwo() {
      // Arrange
      final int expected = 3;
  
      // Act
      final int actual = App.racine(4);
  
      // Assert
      Assert.assertEquals(expected, actual);
    } 
}