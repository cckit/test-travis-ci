package org.nwoedf;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClassForTestingTest {

    private ClassForTesting objectForTesting;
    
    @Before
    public void setUp() {
        objectForTesting = new ClassForTesting();
    }

    @Test
    public void test() {
        assertEquals(4, objectForTesting.returnFour());
    }
}
