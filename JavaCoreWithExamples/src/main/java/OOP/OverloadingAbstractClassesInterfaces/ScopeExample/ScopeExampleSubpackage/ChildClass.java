package OOP.OverloadingAbstractClassesInterfaces.ScopeExample.ScopeExampleSubpackage;

import OOP.OverloadingAbstractClassesInterfaces.ScopeExample.BaseClass;

///*
//    Области видимости:
//
//    private - доступ разрешен только в том же классе, или посредством геттеров и сетторов
//    package - доступ в том же пакете (иерархия пакетов не работает, пакет-наследник не имеет доступа к package полям)
//    protected - доступ в том же пакете + классы наследники
//    public - доступ открыт для всех
//*/

public class ChildClass extends BaseClass {
    @Override
    public void method() {
        System.out.println(protectedField);
        System.out.println(publicField);
    }

    public void method(BaseClass ref) {
        System.out.println(ref.publicField);
    }

    public void method(ChildClass ref) {
        System.out.println(ref.publicField);
        System.out.println(ref.protectedField);
    }

    public static void main(String[] args) {
        BaseClass anotherChildClass = new AnotherChildClass();

        ChildClass child = new ChildClass();
        child.method(child);
    }
}

class AnotherChildClass extends BaseClass {

}
