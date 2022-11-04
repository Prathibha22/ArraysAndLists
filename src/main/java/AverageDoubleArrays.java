import java.util.Arrays;

public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public int sum(double[] aa) {

        return (int) Math.round(Arrays.stream(aa).sum());
    }

    public int average(double[] aa) {
        return 0;
    }

}
