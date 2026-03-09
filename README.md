# TaskS106 - Generics

## Description
This project was created for academic purposes as part of the IT Academy Java & Spring specialization.
The goal is to test the generic parameters and the varargs in methods.

The project is structured in three levels of increasing complexity.

## 🛠 Technologies
- Java

##    Project Structure
````bash
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            ├── level1Exercise1
            │   ├── Main.java
            │   └── NoGenericMethods.java
            ├── level1Exercise2
            │   ├── GenericMethods.java
            │   ├── Main.java
            │   └── Person.java
            ├── level2
            │   ├── GenericMethods.java
            │   ├── Main.java
            │   └── Person.java
            └── level3
                ├── GenericUtils.java
                ├── Main.java
                ├── Phone.java
                └── Smartphone.java

````

## 🚀 Instal.lation and Execution
1. Clone the repository:
````bash
git clone https://github.com/ArturViaderdev/TaskS106-Generics
cd TaskS106-Generics
````
You can do cd into the exercise folder you want to execute and execute with:
````
java Main.java
````
The projects are inside src/main/java.

## Task Description

In this task, you’ll dive deeper into one of the most powerful and flexible concepts in the Java language: **Generics**.  
Generics allow us to write more reusable, safe, and clean code by avoiding manual type casting and reducing runtime errors.  
You will work with generic classes and methods, learn how to restrict generic types using interfaces or superclasses, and practice with varargs and bounded types.  
All exercises are designed to help you understand the power of this feature in real-world scenarios.

### What You Will Learn

- Create generic methods that accept arguments of any type.
- Combine generic objects with specific types, including restricting them via interfaces or classes.
- Use generic varargs and understand their implications.
- Apply restrictions (`bounded types`) to control which object types can be passed to a generic method.
- Strengthen the relationship between generics, interfaces, and polymorphism.

---

## Level 1

At this level, you’ll be introduced to the fundamental concepts of generics.  
You’ll learn how to create classes and methods that work with any type of data and observe how Java handles flexible yet type-safe programming.

### Exercise 1 — Class Without Generics

Create a class named `NoGenericMethods` that stores three arguments of the same type, along with:
- A constructor that initializes them.
- Methods `getElement1()`, `getElement2()`, `getElement3()` to access them.

Verify that you can pass the arguments to the constructor in any order.  
This exercise will serve as a comparison for the later generic version.

***Answer***

I created a non-generic class with three parameters of the same type.

### Exercise 2 — Generic Method With Multiple Parameters

Create a class `Person` with attributes `name`, `surname`, and `age`.  
Then, create a class named `GenericMethods` with a generic method `printElements()` that accepts three generic arguments and prints them.

In the `main()` method of the main class, call this method with different types of parameters (for example: a `Person` object, a `String`, and a primitive numeric value).

With this exercise, you’ll verify that generic methods can accept any combination of types in any order.

***Answer***

I created a generic method and verified that I can pass parameters of different types in any order.

---

## Level 2

This level focuses on refining the use of generics, learning how to combine generic parameters with concrete types and how to use varargs safely with generics.

### Exercise 1 — Partial Generic

Modify the previous exercise so that one of the generic method’s arguments is not generic but of a fixed type, such as `String`.  
The other two arguments should remain generic.

***Answer***

Now, one of the three parameters of the method is not generic, while the other two remain generic.

### Exercise 2 — Generic Varargs

Adapt the previous exercise so that the method accepts a variable number of generic arguments (varargs).  
The method can be named `printAll()`.

**Important:**  
Remember that using varargs with generics can generate compilation warnings (`unchecked warnings`).  
Research how this affects type safety.

***Answer***

I created a new method that accepts a variable number of generic parameters (varargs).  
Using varargs with generics can cause several issues.  
For example, when returning a varargs array, we should never return a parameterized varargs array. Instead, we should return an array of type `Object`.

The compiler shows a warning when using varargs with generic types.  
By adding the `@SafeVarargs` annotation, we can tell the compiler that the warning is a false positive.  
This annotation requires the method to be declared as `final`.

---

## Level 3

At this level, you’ll combine advanced generics with interfaces, type bounds (`bounded types`), and polymorphism.  
You’ll simulate a real-world example with devices that can make calls and take photos.

### Exercise 1 — Generics With Bounded Types

Create an interface named `Phone` with a `call()` method.  
Then, create three classes:

- `Smartphone`, which implements `Phone` and adds a `takePhoto()` method.
- `GenericUtils`, with two generic methods:
    1. `usePhone()`, which accepts an argument bounded by the `Phone` interface (`T extends Phone`) and calls `call()`.
    2. `useSmartphone()`, which accepts an argument bounded by the `Smartphone` class (`T extends Smartphone`) and calls both `call()` and `takePhoto()`.
- `Main`, containing the `main()` method, which creates a `Smartphone` object and passes it to both methods in the `GenericUtils` class.

**Important:**  
Can the method bounded by the `Phone` interface inside `GenericUtils` call `takePhoto()`?  
Why or why not? Reflect on this and verify it in code.

***Answer***

I developed an interface `Phone` and a class `Smartphone` that implements it.  
`Phone` defines the `call()` method, while `Smartphone` implements `call()` and adds another method, `takePhoto()`.

I also created another class with two generic methods:
- The first method receives a generic parameter that extends `Phone`.
- The second method receives a generic parameter that extends `Smartphone`.

The first method can only execute the `call()` method, even if we pass a `Smartphone` object.  
The second method can execute both `call()` and `takePhoto()`.

This happens because, in the first case, the `Smartphone` object is treated as a `Phone`, and the compiler only allows access to methods defined in the `Phone` interface.