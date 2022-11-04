import java.util.Arrays;

public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        return Arrays.stream(aa).sum();
    }

    public int average(int[] aa) {
        if(aa.length>0) {
            return Math.round(sum(aa) / aa.length);
        }
        else
            return 0;
    }

}
