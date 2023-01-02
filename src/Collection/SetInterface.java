package Collection;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("z");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.add("g");
        set.add("h");
        set.add("i");
        set.add("j");
        set.add("a");
        set.add("l");
        System.out.println(set);

        Set<String> lset = new LinkedHashSet<>();
        lset.add("z");
        lset.add("b");
        lset.add("c");
        lset.add("d");
        lset.add("e");
        lset.add("f");
        lset.add("g");
        lset.add("h");
        lset.add("i");
        lset.add("j");
        lset.add("a");
        lset.add("l");
        System.out.println(lset);

        Set<String> tset = new TreeSet<>();
        tset.add("z");
        tset.add("b");
        tset.add("c");
        tset.add("d");
        tset.add("e");
        tset.add("f");
        tset.add("g");
        tset.add("h");
        tset.add("i");
        tset.add("j");
        tset.add("a");
        tset.add("l");
        System.out.println(tset);
    }
}
