import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PermCheck {
    public PermCheck() {
        int A[] = new int[]{5, 4, 1, 6, 2, 3, 10, 8, 7};
        Arrays.sort(A);
        boolean ifPerm = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                ifPerm = false;
            }
        }
        System.out.println(ifPerm);
    }
}
