## what is lambda expression:
    Nameless,
    without return type,
    without access modifier,
    anonymous function


### Example 1: print hello world

without lambda expression:
```java
public void m1(){
    System.out.println("Hello World");
}
```
with lambda expression:
```java
() -> System.out.println("Hello World");
```
- no need to write access modifier, return type, method name


### Example 2: add two numbers

without lambda expression:
```java
public int add(int a, int b){
    return a+b;
}
```

with lambda expression:
```java
(a,b) -> a + b;
```
#### NO need to write:
  - Access modifier
  - Return type
  - Method name
  - Return keyword when only one statement is there
  - Curly braces when only one statement is there
  - Data types of parameters(Type inference)
  - Parenthesis when only one parameter is there

example:
```java
s -> s.length();
```

