import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        ArrayList<Double> aa=new ArrayList<Double>(Arrays.asList(5.60,7.80,9.20));
        Double expected=3.00;
        AverageDoubleLists obj=new AverageDoubleLists();
        assertEquals(expected, obj.count(aa));
    }

    @Test
    void sum() {
        ArrayList<Double> aa=new ArrayList<Double>(Arrays.asList(5.60,7.80,9.20));
        Double expected=22.60;
        AverageDoubleLists obj=new AverageDoubleLists();
        assertEquals(expected, obj.sum(aa));
    }

    @Test
    void average() {
        ArrayList<Double> aa=new ArrayList<Double>(Arrays.asList(5.6,7.8,9.2));
        Double expected=7.53;
        AverageDoubleLists obj=new AverageDoubleLists();
        assertEquals(expected, obj.average(aa));
    }
}