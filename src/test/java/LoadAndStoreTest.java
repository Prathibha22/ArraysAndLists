import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        int[] expected={4,5,6,11,13,8,9,7,14,18};
        LoadAndStore obj=new LoadAndStore();
               String fileName="testIntegerData1.txt";
               assertArrayEquals(expected, obj.loadIntArrayFromFile(fileName));
    }

    @Test
    void loadIntegerArrayListFromFile() {
        ArrayList<Integer> expected=new ArrayList<Integer>(Arrays.asList(4,5,6,11,13,8,9,7,14,18));
        String fileName="testIntegerData1.txt";
        LoadAndStore obj=new LoadAndStore();
        assertEquals(expected, obj.loadIntegerArrayListFromFile(fileName));
    }

    @Test
    void loaddoubleArrayFromFile() {
        double[] expected={4.4,5.5,6.34,11.0001,13.004,8.7,9.97060,7.4532,14.5,18.00023132123};
        String filename="testDoubleData2.txt";
        LoadAndStore obj=new LoadAndStore();
        assertArrayEquals(expected, obj.loaddoubleArrayFromFile(filename));
    }

    @Test
    void loadDoubleArrayListFromFile() {
        ArrayList<Double> expected=new ArrayList<>(Arrays.asList(4.4,5.5,6.34,11.0001,13.004,8.7,9.97060,7.4532,14.5,18.00023132123));
       String filename="testDoubleData2.txt";
       LoadAndStore obj=new LoadAndStore();
        assertEquals(expected, obj.loadDoubleArrayListFromFile(filename));
    }

    @Test
    void loadStringArrayFromFile() {
        String[] expected={"4.4","5.5","Foo","11.0001","Bar","Lost in Space","Lido Shuffle",
                "How much data was destroyed?","I think therefore I compute","0","NaN","ZipCode Rocks!"};
        String fileName="testStringData3.txt";
        LoadAndStore obj=new LoadAndStore();
        assertArrayEquals(expected, obj.loadStringArrayFromFile(fileName));
    }

    @Test
    void loadStringArrayListFromFile() {
        ArrayList<String> expected=new ArrayList<String>(Arrays.asList("4.4","5.5","Foo","11.0001","Bar","Lost in Space","Lido Shuffle",
                "How much data was destroyed?","I think therefore I compute","0","NaN","ZipCode Rocks!"));
        String fileName="testStringData3.txt";
        LoadAndStore obj=new LoadAndStore();

        assertEquals(expected, obj.loadStringArrayListFromFile(fileName));
    }
}