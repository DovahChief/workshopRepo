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
        assertEquals(23 , result);
    }
}
