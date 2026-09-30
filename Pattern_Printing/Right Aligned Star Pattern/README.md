# Right-Aligned Right-Angled Star Pattern

A simple Java program that prints a right-aligned right-angled triangle pattern using spaces and stars.

## 📌 Problem

Given an integer `n`, print a right-angled triangle where the stars are aligned to the right side.

For each row:
- The number of leading spaces decreases by one.
- The number of stars increases by one.

## 💻 Example

### Input

```text
4
Output

   *
  **
 ***
****

⚙️ How It Works

The program uses nested for loops to create the pattern.

1. Outer Loop

The outer loop controls the number of rows:

for(int i = 1; i <= n; i++)

It runs from 1 to n.

2. Space Loop

The first inner loop prints the spaces before the stars:

for(int j = 1; j <= n - i; j++)

The number of spaces is n - i, so the spaces decrease as the row number increases.

3. Star Loop

The second inner loop prints the stars:

for(int j = 1; j <= i; j++)

The number of stars is equal to the current row number.

🧠 Concepts Practiced
Java for loops
Nested loops
Pattern printing
Leading spaces
Loop variables
System.out.print()
System.out.println()
⏱️ Complexity
Time Complexity: O(n²)
Space Complexity: O(1)
▶️ How to Run

Compile the program:

javac RightAlignedStarPattern.java

Run the program:

java RightAlignedStarPattern
🎯 Learning Goal

This problem helps practice nested loops and understand how spaces and stars can be combined to create different patterns in Java.


### 📂 Folder Structure

```text
RightAlignedStarPattern/
├── RightAlignedStarPattern.java
└── README.md
