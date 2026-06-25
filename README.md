# Java Learning Journey

Tracking my daily progress, notes, and exercises as I learn Java for my Higher Technical Certificate (DAM).

## Environment

* **Java:** 21 (Eclipse Temurin LTS)
* **IDE:** IntelliJ IDEA 2026.1
* **VCS:** Git & GitHub

---

## Daily Log

## Day 2: Variables, Arithmetic Operators, and String Concatenation

In this session, the focus was placed on exploring variable manipulation in Java, analyzing arithmetic operators, type
promotion rules, and precise string formatting.

### Core Concepts Mastered

* **Mutability and Data Flows:** Practiced value reassignment over existing variables throughout the execution flow,
  implementing standard increment (`++`) and decrement (`--`) operators.
* **Arithmetic Operators and Precision:**
    * Handled the modulus operator (`%`) to extract division remainders.
    * Evaluated integer types (`int`, `byte`) against floating-point types (`double`) to guarantee precise decimal
      outcomes and prevent accidental data truncation.
* **Compound vs. Traditional Assignment:** Analyzed compound assignment syntax (`+=`, `-=`) versus traditional
  assignment (`variable = variable + value`). Understood how the JVM handles implicit type-narrowing during compound
  operations.
* **String Concatenation and Spacing:** Constructed dynamic messages by blending `String` objects with primitive types.
  Managed explicit whitespace within string literals to ensure seamless text separation in the console output.

### Implementation Details

The code was structured and tested inside the `main` method of the `dev.guzman.fundamentals.UseVariables` class:

1. **Numeric Operations Block:** Performed arithmetic operations crossing different numeric data types (`num1` through
   `num4`) to monitor casting behaviors.
2. **Output Formatting Block:** Combined structural strings with runtime variables to display human-readable statements
   dynamically.

### Key Takeaways

* **Strict Compilation Constraints:** Java variables are bound to their original data type for their entire scope;
  re-declaring an alternative type for an existing identifier is blocked by the compiler.
* **Under-the-Hood Operations:** Compound operators like `+=` serve a functional purpose beyond readability; they
  enforce an automatic implicit cast on the resulting data.
* **Quotation Literalism:** Whitespace within quotation marks (`" "`) is processed as tangible character data; interface
  readability requires precise positioning within the literals.

### Day 1: June 24, 2026

* **Theory:** Studied Java's history, its core philosophy ("Write Once, Run Anywhere"), and the differences between JDK,
  JRE, and JVM.
* **Environment:** Configured IntelliJ IDEA, explored the project structure, and linked the local repository to GitHub.
* **Variables:** Covered primitive data types (`int`, `double`, `boolean`, `char`) and Java's strong typing system.
* **Code:** Wrote and executed the classic `Hello World` program.