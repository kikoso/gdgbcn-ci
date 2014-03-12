package com.google.testing.test;

import android.app.Activity;
import android.test.InstrumentationTestCase;

/**
 * Created by Enrique López-Mañas on 08/03/14.
 */
public class ExampleTest extends InstrumentationTestCase {
    public void test() throws Exception {
        final int expected = 5;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}
