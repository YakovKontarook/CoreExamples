package OverloadingAbstractClassesInterfaces.ScopeExample.ScopeExampleSubpackage;

import OverloadingAbstractClassesInterfaces.ScopeExample.BaseClass;

///*
//    Области видимости:
//
//    private - доступ разрешен только в том же классе, или посредством геттеров и сетторов
//    package - доступ в том же пакете (иерархия пакетов не работает, пакет-наследник не имеет доступа к package полям)
//    protected - доступ в том же пакете + классы наследники
//    public - доступ открыт для всех
//*/

public class AnotherClass {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();

        System.out.println(baseClass.publicField);
    }
}
