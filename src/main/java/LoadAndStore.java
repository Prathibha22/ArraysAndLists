import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadAndStore {

    public int[] loadIntArrayFromFile(String filename) {
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile(filename);
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i);
        return arr;
    }

    public ArrayList<Integer> loadIntegerArrayListFromFile(String filename) {
//Refactored the code to use loadStringArrayListFromFile to all types.
        ArrayList<Integer> alInt=new ArrayList<Integer>();
        ArrayList<String> alString=loadStringArrayListFromFile(filename);
        for(String str:alString)
            alInt.add(Integer.parseInt(str));

        return alInt;
//        // Creating an object of BufferedReader class
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(filename));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String line ="";
//        ArrayList<Integer> result = new ArrayList<Integer>();
//
//        while (true) {
//            try {
//                if ((line = br.readLine()) == null) break; // break loop at end of file
//                if (line.startsWith("//")) continue; // ignore "//" comment lines
//                Integer number = Integer.parseInt(line);
//                result.add(number);
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return result;
    }

    // Build these out:

    // use testDoubleData2.txt to test

    public double[] loaddoubleArrayFromFile(String filename) {
        ArrayList<Double> alDouble=loadDoubleArrayListFromFile(filename);
        double[] arrDouble=new double[alDouble.size()];
        for(int i=0;i<arrDouble.length;i++)
            arrDouble[i]=alDouble.get(i);

        return arrDouble;
    }

    public ArrayList<Double> loadDoubleArrayListFromFile(String filename) {

       ArrayList<String> alString= loadStringArrayListFromFile(filename);
       ArrayList<Double> alDouble=new ArrayList<Double>();
       for(String str:alString)
           alDouble.add(Double.parseDouble(str));

        return alDouble;
    }

    // use testStringData3.txt to test

    public String[] loadStringArrayFromFile(String filename) {
        ArrayList<String> alStr=loadStringArrayListFromFile(filename);
        String[] arrStr=new String[alStr.size()];
        for(int i=0;i<arrStr.length;i++)
            arrStr[i]=alStr.get(i);
        return arrStr;
    }

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

