package www.stepashka.myproject.utils;

public class Time {

    public static final long second = 1000000000l;

    public static long get() {
        return System.nanoTime();
    }

}
