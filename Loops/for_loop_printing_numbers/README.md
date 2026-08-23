# 🔢 For Loop - Print Numbers

This Java program demonstrates the use of a **`for` loop** to print numbers from **0 to 10**.

## 📌 Program

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {

        for (int counter = 0; counter < 11; counter = counter + 1) {
            System.out.println(counter);
        }

    }
}
```

## 🧠 How It Works

The `for` loop consists of three main parts:

```java
for (initialization; condition; update)
```

In this program:

* **Initialization:** `int counter = 0`

  * Creates the `counter` variable and starts it at `0`.

* **Condition:** `counter < 11`

  * The loop continues while `counter` is less than `11`.

* **Update:** `counter = counter + 1`

  * Increases the value of `counter` by `1` after each iteration.

* **Loop Body:**

  ```java
  System.out.println(counter);
  ```

  * Prints the current value of `counter`.

## 🔢 Output

```text
0
1
2
3
4
5
6
7
8
9
10
```

The loop runs **11 times**, because the counter starts at `0` and ends at `10`.

## 📚 Key Concepts

* `for` loop
* Initialization
* Condition
* Increment
* Iteration
* `System.out.println()`

## 🎯 Learning Objective

This program helps understand how a `for` loop can be used to **repeat an operation while changing the value of a counter**.
