# Right-Angled Star Pattern

A simple Java program that takes the number of rows as input and prints a right-angled triangle star pattern using nested `for` loops.

## 📌 Problem

Given an integer `n`, print a right-angled triangle pattern containing `n` rows.

The number of stars increases by one in each row.

## 💻 Example

### Input

```text
5
Output
*
**
***
****
*****
⚙️ How It Works

The program uses two nested for loops:

The outer loop controls the rows.
The inner loop controls the number of stars printed in each row.
For row i, the inner loop runs i times.
After printing all stars in a row, System.out.println() moves to the next line.

For example, when n = 5:

Row 1 → *
Row 2 → **
Row 3 → ***
Row 4 → ****
Row 5 → *****
🧠 Concepts Practiced
Java Scanner
User input
for loops
Nested loops
Pattern printing
System.out.print()
System.out.println()
⏱️ Complexity
Time Complexity: O(n²)
Space Complexity: O(1)
▶️ How to Run

Compile the program:

javac RightAngledStarPattern.java

Run the program:

java RightAngledStarPattern

Enter the number of rows when prompted.

🎯 Learning Goal

This problem helps practice nested loops and understand how loop variables can control the number of elements printed in each row.


**Folder structure:**

```text
RightAngledStarPattern/
├── RightAngledStarPattern.java
└── README.md
