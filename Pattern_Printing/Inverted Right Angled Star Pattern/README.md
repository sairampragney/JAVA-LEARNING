# Inverted Right-Angled Star Pattern

A simple Java program that takes the number of rows as input and prints an inverted right-angled triangle using stars.

## 📌 Problem

Given an integer `n`, print an inverted right-angled triangle pattern containing `n` rows.

The number of stars starts at `n` and decreases by one in each row.

## 💻 Example

### Input

```text
5
Output
*****
****
***
**
*
⚙️ How It Works

The program uses two nested for loops:

The outer loop controls the rows.
The outer loop starts from n and decreases to 1.
The inner loop prints stars according to the current value of i.
After printing each row, System.out.println() moves to the next line.

For example, when n = 5:

Row 1 → *****
Row 2 → ****
Row 3 → ***
Row 4 → **
Row 5 → *

The number of stars decreases by one after every row.

🧠 Concepts Practiced
Java Scanner
User input
for loops
Nested loops
Pattern printing
Decrementing loop variables
System.out.print()
System.out.println()
⏱️ Complexity
Time Complexity: O(n²)
Space Complexity: O(1)
▶️ How to Run

Compile the program:

javac InvertedRightAngledStarPattern.java

Run the program:

java InvertedRightAngledStarPattern

Enter the number of rows when prompted.

🎯 Learning Goal

This problem helps practice nested loops, decreasing loop conditions, and pattern printing in Java.


### 📂 Folder Structure

```text
InvertedRightAngledStarPattern/
├── InvertedRightAngledStarPattern.java
└── README.md
