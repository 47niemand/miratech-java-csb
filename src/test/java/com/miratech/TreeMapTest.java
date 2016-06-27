package com.miratech;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class TreeMapTest {

    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void finished(long nanos, Description description) {
            logInfo(description, "finished", nanos);
        }
    };
    private int listSize = 10 * 100000;

    private static void logInfo(Description description, String status, long nanos) {
        String testName = description.getMethodName();
        System.out.println(String.format("Test %s %s, spent %d microseconds",
                testName, status, TimeUnit.NANOSECONDS.toMicros(nanos)));
    }


    @Test
    public void arrayTest() {
        Map<Object, String> tree = new TreeMap<Object, String>();

        tree.put(2, "a");
        tree.put(3, "c");
        tree.put(1, "b");

        for(Map.Entry e : tree.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }


}
