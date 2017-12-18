package com.sixdelta;

import java.util.stream.IntStream;

/**
 * Created by jose on 18/12/17.
 */
public class Multiplos {

    int calculateFor(int n) throws RuntimeException {
        if(n <= 0){
            throw new RuntimeException();
        }

        return IntStream.range(1, n)
                .filter(i -> i%3 == 0 || i%5 == 0)
                .sum();
    }
}
