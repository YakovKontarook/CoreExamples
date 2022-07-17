package Annotations;

/*
            Использование аннотаций
        Аннотации используются для различных целей, среди них:
    -Information for the compiler - аннотаций могут использоваться компилятором, чтобы обнаружить ошибку или подавить предупреждение.
    -Compiler-time and deployment-time processing - программные инструменты могут обрабатывать информацию из аннотаций, чтобы
    сгенирировать код, XML-файл или что-то другое.
    -Runtime processing - некоторые аннотации доступны во время выполнения программы.

            Ограничения накладываемые на аннотации:
    -Объявляемый метод-аннотация не должен иметь параметров
    -Объявление метода не должно содержать ключевое слово throws
    -метод должен возвращать одно из следующих типов:
        Любой примитивный тип, String, Class, Enum либо массив указанных типов
*/

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MyAnnotation
public class AnnotationExample {
    public static void main(String[] args) {
        System.out.println(AnnotationExample.class.isAnnotationPresent(MyAnnotation.class));
    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

}
