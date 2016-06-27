package com.miratech;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinkedListTest {


    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void finished(long nanos, Description description) {
            logInfo(description, "finished", nanos);
        }
    };
    private int listSize = 6 * 100000;

    private static void logInfo(Description description, String status, long nanos) {
        String testName = description.getMethodName();
        System.out.println(String.format("Test %s %s, spent %d microseconds",
                testName, status, TimeUnit.NANOSECONDS.toMicros(nanos)));
    }

    private static void doSmth(List list) {
        list.add("new");
    }

    @Test
    public void ListTest() {
        List<String> list = new LinkedList<String>() {{
            add("test1");
            add("test2");
            add("test3");
        }};

        doSmth(list);

        System.out.println(list);
    }

}
