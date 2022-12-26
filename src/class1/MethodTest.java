package class1;

public class MethodTest {

    public MethodTest() {

    }

    public int sum(int a, int b) {
        return a + b;
    }

    public void printSomeThing() {
        System.out.println("Some Things");
    }

    public static void main(String[] args) {
        MethodTest methodTest = new MethodTest();
        System.out.println(methodTest.sum(10, 25));
        methodTest.printSomeThing();

    }
}
