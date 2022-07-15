package InnerNestedEnum.Inner;

/*
        Класс объявленный в интерфейсе является вложенным (static) по умолчанию
*/

public interface InterfaceWithClass {
    int x = 10;

    class InnerInInterface {
        public void meth() {
            System.out.println("x = " + x);
        }
    }
}
