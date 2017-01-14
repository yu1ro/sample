package com.sample;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by yu1ro on 2017/01/14.
 */
class IdeaSampleTest {
    @Test
    void sample() {
        IdeaSample ideaSample = new IdeaSample();
        ideaSample.sample(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

}