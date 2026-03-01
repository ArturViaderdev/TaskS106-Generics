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

## Level 1

### Exercise 1

I created a non generic method with three parameters of the same type.

### Exercise 2

I created a generic method and tested that I can pass parameters of different kind in any order.

## Level 2

### Exercise 1
Now one of the three parameters of the method is not generic and the another two are generics.

### Exercise 2
Now I created a new method that accepts a variable number of generic parameters.
A variable number of parameters or varargs can cause diverse problems.
For example if we do a return of the vararg don't ever return a parametrized varargs array and returns of type Object.

The compiler shows a warning when we do a vararg of generic type.

With the annotation @SafeVarargs we can say to the compiler that the warning is a false positive.
This anotation requires the method is final.

## Level 3
I developed a Interface Phone and a class Smartphone that implements Phone.
Phone haves the call method, smartphone implements the call method and another method takePhoto.
I created another class with two methods that receives generic paràmeters. 
One receive a generic parameter that extends phone.
The another receives a generic parameter that extens smartphone.
The first method can only execute the call method if we pass it a smartphone.
The second method can execute call and takePhoto.

This happens because the first class consider the smartphone is a phone.