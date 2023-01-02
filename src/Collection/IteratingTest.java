package Collection;

import java.util.List;
import java.util.ArrayList;

public class IteratingTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int b = 11;
        for (int a : list
        ) {
            list.add(b); // Fail fast
        }
    }
}
