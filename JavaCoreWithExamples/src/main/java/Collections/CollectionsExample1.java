package Collections;

/*        Коллекции - это хранилища,поддерживающие различные способы накопления и упорядочения объектов
с целью обеспечения эффективного доступа к ним.
        Коллекции в языке Java объединены в библиотеке классов java.util и предстовляют собой контейнеры, т.е. объекты,
которые группируют несколько элементов в отдельный модуль.
        Коллекции используются для хранения, поиска, манипулирования и передачи данных.
        Коллекции - это динамические массивы, связные списки, деревья, хэш-таблицы, стэки, очереди.

        Collections framework - это унифицированная архитектура для представления и манипулирования коллекциями.
        Collections framework содержит:
                -Интерфейсы
                -Классы - реализации (implementations)
                -Алгоритмы

       Важнейшие интерфейсы коллекций:
       Collection<E> - вершина иерархии типов коллекции
       List<E> - тип коллекции для обработки списков
       Set<E> - тип коллекции для обработки множеств
       Map<K,V> - тип коллекции - карта отображения вида "ключ-значение"

       Интерфейсы позволяют использовать коллекции независимо от деталей конкретной реализации,
       реализуя тем самым принци полиморфизма.

       Все конткретные классы Java Collections Framework реализуют Cloneable и Serializable интерефейсы,
       следовательно, их экземпляры могут быть клонированы и сериализованы.

       Реализации (Implementations)

       Конкретные реализации интерфейсов могут быть следующих типов:
            -General-purpose implementations
                    (Sets: HashSet, TreeSet, LinkedHasSet. Lists: ArrayList, LinkedList. Maps: HashMap, TreeMap, LinkedHashMap. Queue: PriorityQueue)

            -Special-purpose implementations
                    (Sets: EnumSet, CopyOnWriteArraySet. Lists: CopyOnWriteArrayList. Maps: EnumMap, WeakHashMap, IdentityHashMap)

            -Concurrent implementations
                    (ConcurrentHashMap, LinkedBlockingQueue, ArrayBlockingQueue, PriorityBlockingQueue, DelayQueue, SynchronousQueue, LinkedTransferQueue)

            -Wrapper implementations - реализации-обертки, чтобы предоставить добавленную или ограниченную функциональность, находятся в классе Collections
                    (synchronizedCollection(Collection<T> c), synchronizedSet(Set<T> s), synchronizedList(List<T> list), synchronizedMap(Map<T> map), и др.)

            -Convenience implementations - удобные реализации, выполнены обычно с использованием реализаций общего назначения и применением static factory methods
                для предоставления альтернативных путей создания (например, единичной коллекции)
                    (Arrays.asList(), Collections.nCopies(), Collections.singleton(), emptySet(), emptyList(), emptyMap() (из Collections)

            -Abstract implementations - основа всех реализаций коллекций, которая облегчает создание собственных коллекций.
                    (AbstractCollection, AbstractSet, AbstractList, AbstractSequentialList, AbstractQueue, AbstractMap)

       Алгоритмы - это методы которые выполняют некоторые вычисления, такие как поиск, сортировка объектов, реализующих интерфейс Collection.
       Они также реализуют принцип полиморфизма, таким образом один и тот же метод может быть использован в различных реализациях Colletion интерфейса.
       По существу алгоритмы представляют универсальную функциональность.

*/

public class CollectionsExample1 {
    public static void main(String[] args) {

    }
}
