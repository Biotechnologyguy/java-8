## Collection :

Collection is a group of objects.

## Type of Collections :

### List :

- Insertion order is preserved.
- Duplicates are allowed.
- List is an interface.
- ArrayList, LinkedList, Vector, Stack are the classes that implements List interface.
- **ArrayList** is used to store elements in random order.
- **LinkedList** is used to store elements in insertion order.
- **Vector** is used to store elements in random order.
- **Stack** is used to store elements in LIFO order.
    
```java
import java.util.ArrayList;
import java.util.List;

ArrayList<Integer> list = new ArrayList();
list.add(10);
list.add(20);
list.add(30);

for(Object obj : list) {
    System.out.println(obj);
}
```




### Set :

- Insertion order is not preserved.
- Duplicates are not allowed.
- Set is an interface.
- HashSet, LinkedHashSet, TreeSet are the classes that implements Set interface.
- **TreeSet** is used to store elements in sorted order.
- **LinkedHashSet** is used to store elements in insertion order.
- **HashSet** is used to store elements in random order.

```java
import java.util.HashSet;
import java.util.Set;

HashSet<Integer> set = new HashSet();
set.add(10);
set.add(20);
set.add(30);
set.add(10);

set.forEach(System.out::println);
```

### Map :

- Map is a key-value pair.
- Insertion order is not preserved.
- Duplicates are not allowed.
- Map is an interface.
- HashMap, LinkedHashMap, TreeMap, HashTable are the classes that implements Map interface.
- **HashMap** is used to store elements in random order.
- **LinkedHashMap** is used to store elements in insertion order.
- **TreeMap** is used to store elements in sorted order.
- **HashTable** is used to store elements in random order.

```java
import java.util.HashMap;
import java.util.Map;

HashMap<Integer, String> map = new HashMap();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");

map.forEach((k, v) -> System.out.println(k + " : " + v));
```

