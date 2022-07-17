package Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericsExample4 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();

        Person person1 = new Person(75, 25);
        Person person2 = new Person(90, 35);
        Person person3 = new Person(20, 7);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        Comparator<PhysicalObject> weightComparator = new WeightComparator();

        getGreatestWeight(persons, weightComparator);
    }

    private static <T> T getGreatestWeight(List<? extends T> list, Comparator<? super T> comparator) {
        // реализация метода
        return null;
    }
}

class WeightComparator implements Comparator<PhysicalObject> {
    @Override
    public int compare(PhysicalObject o1, PhysicalObject o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}

abstract class PhysicalObject {
    private int weight;
    public PhysicalObject(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Person extends PhysicalObject {
    private int age;
    public Person(int weight, int age) {
        super(weight);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
