package com.miratech;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.concurrent.TimeUnit;

public class CapacityTest {

    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void finished(long nanos, Description description) {
            logInfo(description, "finished", nanos);
        }
    };

    private static void logInfo(Description description, String status, long nanos) {
        String testName = description.getMethodName();
        System.out.println(String.format("Test %s %s, spent %d microseconds",
                testName, status, TimeUnit.NANOSECONDS.toMicros(nanos)));
    }

    @Test
    public void testCapacity() {
        int oldCapacity = 10;

        for (int i = 0; i < 10; i++) {
            oldCapacity *= i + 1;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            double rate = (double) newCapacity / (double) oldCapacity;
            System.out.println("oldCapacity = " + oldCapacity + ",  newCapacity = " + newCapacity + " rate = " + rate);
        }
    }
}
