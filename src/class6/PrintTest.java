package class6;

public class PrintTest {
    public static void main(String[] args) {
//        // 12
        PrintInteger integer = new PrintInteger(52);
        System.out.println(integer.getInteger());

        PrintDouble aDouble = new PrintDouble(90.56);
        System.out.println(aDouble.getDouble());

        PrintString string = new PrintString("SQA Learning Academy");
        System.out.println(string.getString());

        System.out.println("=====================================================");
        //    BaseType <Type> obj = new BaseType <Type>()
        Print<Integer> integerPrint = new Print<>(52);
        System.out.println(integerPrint.getObj());

        Print<Double> doublePrint = new Print<>(90.56);
        System.out.println(doublePrint.getObj());

        Print<String> stringPrint = new Print<>("SQA Learning Academy");
        System.out.println(stringPrint.getObj());

        Print<Float> floatPrint = new Print<>(987.80f);
        System.out.println(floatPrint.getObj());

        Print<Long> longPrint = new Print<>(9875411l);
        System.out.println(longPrint.getObj());

    }
}
