import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        double aa[]={5.6,7.8,9.2};
        int expected=3;
        AverageDoubleArrays obj=new AverageDoubleArrays();
        assertEquals(expected, obj.count(aa));
    }

    @Test
    void sum() {
        double aa[]={5.6,7.8,9.2};
        int expected=23;
        AverageDoubleArrays obj=new AverageDoubleArrays();
        assertEquals(expected, obj.sum(aa));
    }

    @Test
    void average() {
        double aa[]={5.6,7.8,9.2};
        int expected=7;
        AverageDoubleArrays obj=new AverageDoubleArrays();
        assertEquals(expected, obj.average(aa));
    }
}