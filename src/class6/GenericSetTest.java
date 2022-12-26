package class6;

import java.util.HashSet;
import java.util.Set;

public class GenericSetTest {
    public static void main(String[] args) {
        Set<Long> longSet=new HashSet<>();
        longSet.add(9877l);
        longSet.add(9877l);
        longSet.add(987451l);
        longSet.add(311456l);

        longSet.remove(311456l);
        longSet.add(98l);

        for (Long aLong: longSet){
            System.out.println(aLong);
        }

    }
}
