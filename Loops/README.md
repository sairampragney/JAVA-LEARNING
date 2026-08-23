# 🔄 Loops in Java

Loops in Java are used to **execute a block of code repeatedly** as long as a specified condition is satisfied.

They help reduce code repetition and make programs more efficient and easier to maintain.

## 📚 Types of Loops

Java provides three main types of loops:

### 1. `for` Loop

The `for` loop is commonly used when you know how many times you want to repeat a block of code.

**Syntax:**

```java
for (initialization; condition; update) {
    // code to execute
}
```

**Example:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 2. `while` Loop

The `while` loop executes a block of code as long as the given condition is `true`.

**Syntax:**

```java
while (condition) {
    // code to execute
}
```

**Example:**

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### 3. `do-while` Loop

The `do-while` loop executes the code **at least once**, because the condition is checked after the code runs.

**Syntax:**

```java
do {
    // code to execute
} while (condition);
```

**Example:**

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

## 🆚 Difference Between Loops

| Loop       | Condition Checked | Minimum Executions |
| ---------- | ----------------- | ------------------ |
| `for`      | Before execution  | 0                  |
| `while`    | Before execution  | 0                  |
| `do-while` | After execution   | 1                  |

## 🎯 When to Use Each Loop

* **`for` loop** → When the number of iterations is known.
* **`while` loop** → When the number of iterations depends on a condition.
* **`do-while` loop** → When the code must execute at least once.

## 📂 Programs in This Folder

This folder contains Java programs for practicing:

* `for` loops
* `while` loops
* `do-while` loops
* Nested loops
* Pattern-based programs
* Loop-based calculations
* Practical problems using loops

## 🚀 Learning Goal

The goal of these programs is to understand how loops work in Java and build a strong foundation for **problem-solving and DSA**.

> **Practice is the best way to understand loops.** Repeating code manually is apparently one of humanity's oldest ways of suffering, so we invented loops.
