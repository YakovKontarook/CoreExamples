package OOP.OverloadingAbstractClassesInterfaces.Interfaces;

public interface MyInterface {
    public static final double PI = Math.PI;

    int getValue();
}

interface MyInterface2 extends MyInterface {
    int getAnotherValue();
}
