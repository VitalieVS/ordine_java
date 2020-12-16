import org.junit.Test;

import java.util.Arrays;

public class Main {
    @Test
    public void ordine() {
        solve(new int[]{12, 49, 36});
    }

    public void solve(int[] array) {
        Arrays.sort(array);
        System.out.print(array[2]);
        System.out.print(array[1]);
        System.out.print(array[0]);
    }
}
