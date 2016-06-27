package com.miratech;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HashMapTest {

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

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put(new String("test"), "test");
        System.out.println(map1.get(new String("test")));                           // test
        System.out.println(map1.get(new String(new char[]{'t', 'e', 's', 't'})));   // test
//        char[] t = new char[];
//        t.hashCode();
//
        Map<char[], String> map2 = new HashMap<char[], String>();
        map2.put(new char[]{'t', 'e', 's', 't'}, "test");
        System.out.println(map2.get(new char[]{'t', 'e', 's', 't'}));               // null

        Map<String, String> users = new HashMap<String, String>() {{
            put("rzol", "Roman Zolotarov");
            put("rzol", "Roman Zolotarov");
            put("rzol", "Roman Zolotarov");
            put("rzol", "Roman Zolotarov");
        }};


    }


}
