package com.sixdelta;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by jose on 18/12/17.
 */
public class MultiplesTest {

    @Test
    public void firstTest(){
        Multiplos m = new Multiplos();
        int result =  m.calculateFor(10);
        System.out.println("valor para 1000 : " + m.calculateFor(1000));
        assertEquals(23 , result);

    }
}
