# Hollow Rectangle Pattern

A simple Java program that prints a **hollow rectangle pattern** using nested `for` loops and conditional statements.

This program creates a rectangle with **4 rows** and **5 columns**. The boundary is made using `*` characters, while spaces are printed inside the rectangle.

---

## 📌 About

The program uses two nested loops:

- The **outer loop** controls the rows.
- The **inner loop** controls the columns.
- An `if` condition checks whether the current position is on the boundary.
- A `*` is printed on the boundary.
- A space is printed inside the rectangle.

---

## ⚙️ How It Works

### 1. Set the Number of Rows and Columns

```java
int n = 4;
int m = 5;
