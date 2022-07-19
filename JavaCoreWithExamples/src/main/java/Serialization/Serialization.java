package Serialization;
/*
        Сериализация это процесс сохранения состояния объекта в последовательность байт;
        Десериализация это процесс восстановления объекта из этих байт.
        Java Serialization.Serialization API предоставляет стандартный механизм для создания сериализуемых объеектов.
        Процесс сериализации заключается в сериализации каждого поля объекта, но только в том случае,
    если это поле не имеет спецификатора static или transient.
        Поля, помеченные ими не могут быть сериализованы.
*/

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Ivan", "Ivanov");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutput objOutput = new ObjectOutputStream(out);

        objOutput.writeObject(person);
        byte[] bytes = out.toByteArray();
        System.out.println(bytes.length);
        System.out.println(new String(bytes));

        ObjectInputStream objectInput = new ObjectInputStream(new ByteArrayInputStream(bytes));
        Person anotherPerson = (Person)objectInput.readObject();

        System.out.println(person.equals(anotherPerson));
    }
}
class Person implements Serializable {
    String name;
    String lastname;
    Passport password;

    transient String mood = "Im fine";

    public void setPassword(Passport password) {
        this.password = password;
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private class Passport implements Serializable {
        final int number;
        final int serial;

        public Passport(int number, int serial) {
            this.number = number;
            this.serial = serial;
        }
    }
}
