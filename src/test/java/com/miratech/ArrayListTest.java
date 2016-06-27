package com.miratech;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArrayListTest {

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
    public void addIntoMidTest() {
        List<String> list = new ArrayList<String>() {{
            add("first");
            add("second");
            add("last");
        }};

        for (int i = 0; i < listSize; i++) {
            list.add(list.size() / 2, "test");
        }
    }

    @Test
    public void addToTheEndTest() {
        List<String> list = new ArrayList<String>() {{
            add("first");
            add("second");
            add("last");
        }};

        for (int i = 0; i < listSize; i++) {
            list.add("test");
        }
    }

    @Test
    public void arrayTest() {

        List list = new ArrayList();

    }


}
