package class1;

public class UnaryOperator {
    public static void main(String[] args) {
        //Unary Operator
        int a = 10, b = 20, c = 30, d = 40;
        System.out.println("a " + a++); //10  a++ a=a+1; a=10+1=11
        System.out.println("a " + a); //10  10+1=11 a=11
        System.out.println("a2 " + ++a); // a=11, a=11+1=12
        System.out.println("a3 " + --a); // --a a=a-1; a=12-1=11
        System.out.println("a4 " + a--); // a=a-1=11-1=10
        System.out.println("a5 " + a); //a++ a=a+1   11

    }
}
