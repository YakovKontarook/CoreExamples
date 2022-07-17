package EqualsAndHashCode;
/*
    При переопределениии должны выполняться следущие условия:
    Рефлексивность - объект равен самому себе
    Симметричность - если x.equals(y) возвращает значение true, то и y.equals(x) всегда возвращает true
    Транзитивность - если метод equals() возвращает значение true при сравнении объектов x и y, а также y и z, то и при
сравнении x и z будет возвращено значение true;
    Непротиворечивость - при многократном вызове метода для двух не подвергшихся изменению за это время объектов
возвращаемое значение всегда должно быть одинаковым
    Ненулевая ссылка при сравнении с литералом null всегда возвращает false

    при переопределении метода equals() в производных классах хорошим тоном является вызов equals из базового класса
 */

public class ExampleEquals {

}

class Pen {
    private int price;
    private String producerName;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; // сравнение на самого себя
        }

         if (o == null) {
             return false; // проверка на null
         }


        if (!(o instanceof Pen)) {
            return false; // в отличие от getClass(), проверяет иерархию вниз
        }

/*
//        if (getClass() != o.getClass()) {
//            return false; проверка на getClass() (getClass проверяет на точное совпадение по классу)
//        }
*/
        Pen pen = (Pen) o;

        if (price != pen.price) return false; // Если сравниваем double используем Double.compare() или (Math.abs(price - pen.price) < 0.00001)
                                              // также можно использовать Objects.equals по каждому полю
        return producerName != null ? producerName.equals(pen.producerName) : pen.producerName == null;
    }
}