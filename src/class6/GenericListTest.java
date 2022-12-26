package class6;

import java.util.ArrayList;
import java.util.List;

public class GenericListTest {
    public static void main(String[] args) {
        //Press Ctrl
        List<Integer> integers = new ArrayList<>();
        integers.add(58);
        integers.add(984);
        integers.add(8794);
        integers.add(984);
        integers.add(null);
        integers.add(null);

        integers.remove(2);
        integers.add(1, 369);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Mango");
        stringList.add("Orage");
        stringList.add("Banana");
        stringList.add("Apple");
        //Ctrl + alt +l
        stringList.add(0, "SQA");
        stringList.remove(0);
        System.out.println(stringList.get(2));
        for (String s : stringList) {
            System.out.println(s);
        }

    }
}
