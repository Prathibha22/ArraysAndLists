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
        assertEquals(null, "");
    }

    @Test
    void loaddoubleArrayFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadDoubleArrayListFromFile() {
        assertEquals(null, "");
    }

    @Test
    void loadStringArrayFromFile() {
        assertEquals(null, "");
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