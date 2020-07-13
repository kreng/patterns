package ru;

public class Helper {
    public static void assertEquals(Object expected, Object actual) {
        if(!expected.equals(actual))
            throw new RuntimeException("Not EQUAL");
    }
}
