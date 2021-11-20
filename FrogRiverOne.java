import java.util.ArrayList;
import java.util.List;

public class FrogRiverOne {
    public FrogRiverOne() {
        int K = 5;
        int[] A = new int[]{1, 3, 1, 4, 2, 3 ,4, 5};

        List<Boolean> list = new ArrayList<>();
        for (int i=0; i < K ;i++)
            list.add(false);


        int second = 0;
        int path = 0;
        for (int j=0 ; j<A.length ; j++){

            if(!list.get(A[j]-1)) {
                list.set(A[j]-1, true);
                path++;
            }

            if(path == K) {
                second = j;
                break;
            }
        }

        if(path < K) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }
    }
}
