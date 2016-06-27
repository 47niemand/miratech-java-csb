package com.miratech;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.Assert.assertEquals;

public class StopwatchTest {

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
    public void performanceTest() throws InterruptedException {
        long delta = 30;

        Thread.sleep(400L);
        assertEquals(300d, stopwatch.runtime(MILLISECONDS), delta);

        Thread.sleep(500L);
        assertEquals(800d, stopwatch.runtime(MILLISECONDS), delta);
    }

    @Test(timeout = 200)
    public void testWithTimeout() throws InterruptedException {
        Thread.sleep(100L);
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

    @Test
    public void testArrayList() {
        List list = new ArrayList();

        for (int i = 0; i < 10000000; i++) {
            list.add(list.size() / 2, "test");
        }

    }
}
