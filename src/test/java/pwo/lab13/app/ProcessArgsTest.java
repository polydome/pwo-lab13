package pwo.lab13.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pwo.lab13.app.ProcessData.Action.*;

public class ProcessArgsTest {
    static double[] NUMBERS = {1, 2, -3, 5, 7, -2};
    static double[] EMPTY = {};
    static String[] ARGS0 = {}, ARGS1 = {"1", "2", "-3", "5", "7", "-2", "sum"}, ARGS2 = {"1", "2", "-3", "5", "7", "-2", "max"}, ARGS3 = {"1", "2", "-3", "5", "7", "-2"}, ARGS4 = {"Ala", "kot", "to", "Max"};

    @Test
    public void testGetAction0() {
        System.out.println("test get action 0");
        assertEquals(UNDEFINE, ProcessArgs.getAction(ARGS0));
    }

    @Test
    public void testGetAction1() {
        System.out.println("test get action 1");
        assertEquals(SUM, ProcessArgs.getAction(ARGS1));
    }

    @Test
    public void testGetAction2() {
        System.out.println("test get action 2");
        assertEquals(MAX, ProcessArgs.getAction(ARGS2));
    }

    @Test
    public void testGetAction3() {
        System.out.println("test get action 3");
        assertEquals(UNDEFINE, ProcessArgs.getAction(ARGS3));
    }

    @Test
    public void testGetAction4() {
        System.out.println("test get action 4");
        assertEquals(MAX, ProcessArgs.getAction(ARGS4));
    }

    @Test
    public void testGetNumbers0() {
        System.out.println("test get numbers 0");
        assertArrayEquals(EMPTY, ProcessArgs.getNumbers(ARGS0));
    }

    @Test
    public void testGetNumbers1() {
        System.out.println("test get numbers 1");
        assertArrayEquals(NUMBERS, ProcessArgs.getNumbers(ARGS1));
    }

    @Test
    public void testGetNumbers2() {
        System.out.println("test get numbers 2");
        assertArrayEquals(NUMBERS, ProcessArgs.getNumbers(ARGS2));
    }

    @Test
    public void testGetNumbers3() {
        System.out.println("test get numbers 3");
        assertArrayEquals(NUMBERS, ProcessArgs.getNumbers(ARGS3));
    }

    @Test
    public void testGetNumbers4() {
        System.out.println("test get numbers 0");
        assertArrayEquals(EMPTY, ProcessArgs.getNumbers(ARGS4));
    }
}