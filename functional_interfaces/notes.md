## Functional Interfaces:
- Functional interfaces are interfaces with **single abstract method(SAM)**.
- They can have multiple **default methods**.
- They can have multiple **static methods**.
- They are used to call lambda expressions.
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

If an interface extends functional interface and child interface contains exactly one abstract method but same as parent, then child interface is a Functional interface.

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


```java

// NO ERROR : NO @FunctionalInterface annotation on child interface


@FunctionalInterface
public interface P{
    void m1()
}

public interface C extends P{
    void m2()
}
```