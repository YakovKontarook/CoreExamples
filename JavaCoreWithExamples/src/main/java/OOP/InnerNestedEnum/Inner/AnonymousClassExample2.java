package OOP.InnerNestedEnum.Inner;

public class AnonymousClassExample2 {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass(10) {
            @Override
            public int getValue() {
                return super.getValue() + 1;
            }
        };
    }
}

abstract class AbstractClass {
    private final int value;
    protected AbstractClass(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
