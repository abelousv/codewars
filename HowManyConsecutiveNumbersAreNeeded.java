import java.util.Arrays;

public class Kata {
    public static int consecutive(final int[] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        return arr[arr.length-1]-arr[0]-arr.length+1;

    }
}