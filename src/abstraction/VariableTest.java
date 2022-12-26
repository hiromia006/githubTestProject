package abstraction;

public class VariableTest {
    public static void main(String[] args) {
        Variable.amount = 10;
        Variable variable = new Variable();
        variable.lastName = "Mia";
        variable.printSomething();
    }
}
