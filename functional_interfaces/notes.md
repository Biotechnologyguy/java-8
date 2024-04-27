## Functional Interfaces:
- Functional interfaces are interfaces with **single abstract method(SAM)**.
- They can have multiple **default methods**.
- They can have multiple **static methods**.
- They are used to call lambda expressions.
- Functional Interfaces acts as a **target type** for lambda expressions.
- **e.g.** 
  - Runnable => `run()`
  - Callable => `call()`
  - ActionListener => `actionPerformed()`
  - Comparator => `compare()`
  - Predicate => `test()`
  - Function => `apply()`
  - Supplier => `get()`
  - Consumer => `accept()`
  - BiFunction => `apply()`
  - BiPredicate => `test()`
  - BiConsumer => `accept()`
  - UnaryOperator => `apply()`
  - BinaryOperator => `apply()`
  - etc.


## Functional interfaces wrt inheritance:

### Case 1: 
If an interface extends functional interface and child interface does not contain any abstract method, then child interface is always Functional interface.

```java
// Both are functional interfaces

@FunctionalInterface
public interface P{
    void m1()
}

@FunctionalInterface
public interface C extends P{
    
}
```

### Case 2:

If an interface extends functional interface and child interface contains exactly one abstract method but not same as parent, then child interface is not a Functional interface.

```java

//java: Unexpected @FunctionalInterface annotation
//        Test.C is not a functional interface
//multiple non-overriding abstract methods found in interface Test.C


@FunctionalInterface
public interface P{
    void m1()
}

@FunctionalInterface
public interface C extends P{
    void m2()
}
```

### Case 3:

If an interface extends functional interface and child interface contains exactly 
one abstract method but same as parent, then child interface is a Functional interface.

```java

// Both are functional interfaces

@FunctionalInterface
public interface P{
    void m1()
}

@FunctionalInterface
public interface C extends P{
    void m1()
}

```

### Case 4:

If an interface extends functional interface and child interface contains abstract method having different name as that of parent SAM, then child interface is not a Functional interface.


```java

// NO ERROR : As NO @FunctionalInterface annotation is given on child interface


@FunctionalInterface
public interface P{
    void m1()
}

public interface C extends P{
    void m2()
}
```

## Invoking lambda expressions using functional interfaces:

### Without lambda expressions:
```java

interface Interf{
    void m1();
}

public class Demo implements Interf{
    public void m1(){
        System.out.println("m1 method implementation");
    }
}

public class Test{
    public static void main(String[] args){
        Interf i = new Demo();
        i.m1();
    }
}


```

### With lambda expressions:
```java

interface Interf{
    void m1();
}

public class Test{
    public static void main(String[] args){
        Interf i = () -> System.out.println("m1 method implementation");
        i.m1();
    }
}

```


## Runnable interface:

### Without lambda expressions:

```java
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Child Thread" + i);
        }
    }

```

### With lambda expressions:

```java

Runnable r = () -> {
    for(int i=0; i<10; i++){
        System.out.println("Child Thread" + i);
    }
};

Thread t = new Thread(r);
t.start();

for (int k = 0; k < 10; k++) {
        System.out.println("Main Thread");
}
```   

### why functional interface should have only one abstract method?

- If functional interface has more than one abstract method, then lambda expression can't be used to call that interface.

```java

//java: incompatible types: Test.Interf2 is not a functional interface
//multiple non-overriding abstract methods found in interface Test.Interf2

interface Interf2{
    void m1();
    void m2();
}

public class Test{
    public static void main(String[] args){
        Interf2 i = () -> System.out.println("m1 method implementation");
        i.m1();
    }
}

```


