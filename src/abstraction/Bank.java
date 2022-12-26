package abstraction;

public interface Bank extends BangladeshBank {
    double getInterest();

    default void print() {
        System.out.println("askldnnaslk");
    }

    private void doDot() {

    }
}
