# 🔄 For Loop - Hello World

This Java program demonstrates the basic use of a **`for`**** loop** by printing `"Hello world"` **100 times**.

## 📌 Program

```java
public class for_loop {

    public static void main(String[] args) {

        for (int counter = 0; counter < 100; counter = counter + 1) {
            System.out.println("Hello world");
        }


    }
}
```

## 🧠 How It Works

The `for` loop has three main parts:

```java
for (initialization; condition; update)
```

In this program:

* **Initialization:** `int counter = 0`

  * Creates a variable named `counter` and starts it at `0`.

* **Condition:** `counter < 100`

  * The loop continues as long as `counter` is less than `100`.

* **Update:** `counter = counter + 1`

  * Increases `counter` by `1` after every iteration.

* **Loop Body:**

  ```java
  System.out.println("Hello world");
  ```

  * Prints `"Hello world"` during every iteration.

## 🔢 Number of Iterations

The counter starts at `0` and goes up to `99`.

Therefore:

**100 iterations = 100 ****`"Hello world"`**** outputs**

## 📚 Key Concepts

* `for` loop
* Initialization
* Condition
* Increment
* Iteration
* `System.out.println()`

## 🎯 Learning Objective

This program helps understand the basic structure and execution of a `for` loop in Java.
