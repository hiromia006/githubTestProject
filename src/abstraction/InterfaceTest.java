package abstraction;

public class InterfaceTest {
    public static void main(String[] args) {
        BracBank bracBank = new BracBank();
        System.out.println(5000* bracBank.getInterest());

        Bank bank = new BracBank();
        System.out.println(5000* bank.getInterest());
    }
}
