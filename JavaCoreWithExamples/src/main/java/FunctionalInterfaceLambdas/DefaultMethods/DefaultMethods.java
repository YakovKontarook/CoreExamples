package FunctionalInterfaceLambdas.DefaultMethods;

public class DefaultMethods {
    public static void main(String[] args) {
        Callable ref = new ExternalCallable() {

            @Override
            public void call() {
                //
            }
        };
    }
}

interface Callable {
    void call();

    static void callOn(Callable ref) {
        ref.call();

    }
}
interface ExternalCallable extends Callable {
    @Override
    void call();
}