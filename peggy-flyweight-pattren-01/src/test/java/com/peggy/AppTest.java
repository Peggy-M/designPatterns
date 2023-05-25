package com.peggy;


import com.peggy.flyweight.example01.BigChar;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {
    @Test
  public void BigCharTest(){
        BigChar a = new BigChar('1');
        a.print();
    }
}
