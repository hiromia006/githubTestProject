package abstraction;

public class Variable {
    protected String lastName;
    static public double amount;

    public void printSomething() {
        String someThings = "Some Things";
        System.out.println(someThings);
    }

    public void doSomeThings() {
        System.out.println("Static : "+amount);
    }

}
