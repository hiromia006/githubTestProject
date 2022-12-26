package class6;

public class ForEachTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Some things " + i);
//        }

        int[] numbers = {10, 12, 15, 16, 50};
        //for each
        for (int num : numbers) {
            System.out.println("Number : " + num);
        }

        String[] names = {"Ershad", "Rishaed", "zakir", "saima apu"};
        //
        for (String str : names) {
            System.out.println("Name is : " + str);
        }

        double[] amounts = {100.5, 500.9, 984.0, 987.9};
        for (double am : amounts) {
            System.out.println("Taka is : " + am);
        }

        for (int i = 0; i < amounts.length; i++) {
            System.out.println(amounts[i]);
        }

    }
}
