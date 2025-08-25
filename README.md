# Tana Take-Home Coding Challenge

This repository contains solutions to a set of five algorithmic and data structure problems written in **Java 17**, with comprehensive **JUnit 5** test coverage and organized using the **Gradle build system**. The project demonstrates strong modular design, usage of modern Java features, and test-driven development principles.

## Language & Tools Used

- **Programming Language:** Java 17
- **Testing Framework:** JUnit 5
- **Build Tool:** Gradle (Kotlin DSL)

## How the Solution Works

### Question 1: Get Longest String
This solution accepts an array of strings and returns the longest one. If multiple strings have the same length, the first one encountered is returned. It uses simple iteration, comparing each string's length while tracking the maximum.

### Question 2: First Unique Product in List
Given a list of product names, this solution returns the first product that appears only once. It uses a `LinkedHashMap` to maintain insertion order while tracking frequencies, ensuring the first unique product is returned accurately.

### Question 3: Calculate Minimum Distance Between Words
The solution computes the shortest distance (in number of words) between two given words in a list. It iterates once through the list while tracking the last seen indices of both target words to update the minimum distance dynamically.

### Question 4: Find Top Three Common Words
This function returns the three most frequent words in a list. It ignores case and punctuation, counts word frequency using a `HashMap`, and then uses a priority queue (or sorting) to determine the top three entries by frequency.

### Question 5: Rotate a List
The solution rotates a list of integers to the right by `k` steps. It handles wrap-around using modulo arithmetic and performs the rotation in linear time by reversing parts of the list in-place, optimizing both space and performance.

## Project Highlights

- **Five Focused, Self-contained Solutions:**  
  Each question is implemented in its own class with a clearly defined responsibility, ensuring readability and single-responsibility compliance.

- **Modular and Reusable Class Designs:**  
  Code is written in a modular way, allowing reuse, easy extension, and minimal coupling. Each algorithm is encapsulated and testable independently.

- **Extensive Use of Java 17 Features:**  
  The project leverages Java 17 enhancements such as `switch` expressions, enhanced type inference with `var`, and pattern matching, where appropriate, for concise yet readable code.

- **Full Test Coverage Using JUnit 5:**  
  Every question has a dedicated JUnit test class with multiple test cases validating correctness, including edge cases and error scenarios.

- **Simple to Run Using Gradle:**  
  You can build, test, and run everything using Gradle with a single command. There's no need for additional setup, ensuring quick onboarding and smooth execution.

- **Readable Code with Clear Naming Conventions:**  
  Method and class names clearly describe their purpose. Code is commented where helpful, and follows consistent formatting and Java best practices.

## How to Run the Project

1. **Clone the Repository:**

```bash
git clone https://github.com/titus-360/take-home-tana-test.git
cd take-home-tana-test
```

2. **Run All Tests with Gradle:**

```bash
./gradlew test
```

> This will compile the code and execute all the test cases for each of the five questions. The test results will be displayed in the console and written to `build/reports/tests/test/index.html`.