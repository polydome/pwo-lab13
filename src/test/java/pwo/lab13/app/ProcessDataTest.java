package pwo.lab13.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessDataTest {
    static double[] NUMBERS = {1, 2, -3, 5, 7, -2};
    static Double SUM = new Double(1 + 2 - 3 + 5 + 7 - 2);
    static Double MAX = new Double(7);
    static double[] EMPTY = {};

    @Test
    public void sumTest1() {
        System.out.println("sum test 1");
        ProcessData.Action action = ProcessData.Action.SUM;
        Double expResult = SUM;
        ProcessData instance = new ProcessData();
        Double result = instance.process(action, NUMBERS);
        assertEquals(expResult, result);
    }

    @Test
    public void sumTest2() {
        System.out.println("sum test 2");
        ProcessData.Action action = ProcessData.Action.SUM;
        ProcessData instance = new ProcessData();
        Double result = instance.process(action, EMPTY);
        assertNull(result);
    }

    @Test
    public void maxTest1() {
        System.out.println("max test 1");
        ProcessData.Action action = ProcessData.Action.MAX;
        Double expResult = MAX;
        ProcessData instance = new ProcessData();
        Double result = instance.process(action, NUMBERS);
        assertEquals(expResult, result);
    }

    @Test
    public void maxTest2() {
        System.out.println("max test 2");
        ProcessData.Action action = ProcessData.Action.MAX;
        ProcessData instance = new ProcessData();
        Double result = instance.process(action, EMPTY);
        assertNull(result);
    }
}