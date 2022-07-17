package OverloadingAbstractClassesInterfaces.ScopeExample;

///*
//    Области видимости:
//
//    private - доступ разрешен только в том же классе, или посредством геттеров и сетторов
//    package - доступ в том же пакете (иерархия пакетов не работает, пакет-наследник не имеет доступа к package полям)
//    protected - доступ в том же пакете + классы наследники
//    public - доступ открыт для всех
//*/

public class BaseClass {

    private int privateField;
    int packageField;
    protected int protectedField;
    public int publicField;

    public void method() {
        System.out.println(privateField);
        System.out.println(packageField);
        System.out.println(protectedField);
        System.out.println(publicField);
    }
}

class AnotherClass {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.packageField);
        System.out.println(baseClass.protectedField);
        System.out.println(baseClass.publicField);
    }
}
