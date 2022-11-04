import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LoadAndStore {

    public int[] loadIntArrayFromFile(String filename) {
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile(filename);
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i);
        return arr;
    }

    public ArrayList<Integer> loadIntegerArrayListFromFile(String filename) {
        // Creating an object of BufferedReader class
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                Integer number = Integer.parseInt(line);
                result.add(number);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    // Build these out:

    // use testDoubleData2.txt to test

    public double[] loaddoubleArrayFromFile(String filename) { return new double[]{}; }

    public ArrayList<Double> loadDoubleArrayListFromFile(String filename) { return null; }

    // use testStringData3.txt to test

    public String[] loadStringArrayFromFile(String filename) { return null; }

    public ArrayList<String> loadStringArrayListFromFile(String filename) {
        // Creating an object of BufferedReader class
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<String> result = new ArrayList<String>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                String str = line;
                result.add(str);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
         for(String k :result)
             System.out.println(k);
        return result;

    }

    //
    // Finally:
    //
    // Is there some way to re-factor these routines so that
    // loadStringArrayListFromFile() becomes the general case routine
    // and is the only one with IO code in it?
    // All the others become like loadIntArrayFromFile(),
    // where it calls the general case routine?
}

