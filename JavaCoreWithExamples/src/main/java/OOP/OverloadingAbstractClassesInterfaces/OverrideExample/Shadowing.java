package OOP.OverloadingAbstractClassesInterfaces.OverrideExample;

/*
Shadowing - унаследованный метод вызывается у ближайшего родителя, скрывая реализацию метода у GrandParent
*/

public class Shadowing {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getValue());
    }
}

class GrandParent {
    public static int getValue() {
        return 55;
    }
}
    class Parent extends GrandParent {
        public static int getValue() {
            return 1;
        }
}

class Child extends Parent {

}

