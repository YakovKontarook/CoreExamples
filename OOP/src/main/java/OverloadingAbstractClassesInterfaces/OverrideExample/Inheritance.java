package OverloadingAbstractClassesInterfaces.OverrideExample;
///*
//final и static методы не переопределяются
//final классы не наследуются
//При переопределении метода в наследнике, мы имеем возможность изменить (сузить) тип возвращаемого значения вниз по иерархии.
//*/
public class Inheritance {
}

class Course{}
class BaseCourse extends Course{}

class CourseHelper {
    public Course getCourse() {
        System.out.println("Course");
        return new Course();
    }
}

class BaseCourseHelper extends CourseHelper {
    public BaseCourse getCourse() {
        System.out.println("BaseCourse");
        return new BaseCourse();
    }
}
