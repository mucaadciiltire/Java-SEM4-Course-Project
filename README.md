# Java Course Project

## Student Information
- *Name*: Maxamed Yuusuf Maxamed
- *ID*: C1220167
- *Class*: CA2213

## Project Overview
This project is a basic Java program to manage a classroom, its subjects, and students. The program uses classes and objects, arrays, loops, control flow, mathematical operations, and all primitive data types wherever possible.

## Project Structure
The project consists of the following Java classes:
1. *Subject*: Represents a subject with a name and credit hours.
2. *Student*: Represents a student with an ID, name, age, subjects, and marks.
3. *Fasal*: Represents a classroom with a name, array of subjects, and array of students.
4. *Main*: The main class to run the program and demonstrate its functionality.

## Classes and Implementation

### Subject Class
- *Attributes*: 
  - String name
  - int creditHours
- *Methods*:
  - determineGrade(int marks): Determines the grade based on marks.

### Student Class
- *Attributes*: 
  - int id
  - String name
  - int age
  - Subject[] subjects
  - int[] marks
- *Methods*:
  - calculateTotalCreditHours(): Calculates the total credit hours of the student.
  - calculateGPA(): Calculates the GPA of the student.

### Fasal Class
- *Attributes*: 
  - String name
  - Subject[] subjects
  - Student[] students
- *Methods*:
  - displayFasalDetails(): Displays the details of the classroom.
  - findStudentById(int id): Finds a student by their ID.
  - calculateAverageGPA(): Calculates the average GPA of the classroom.

### Main Class
- Contains the main method to run the program and demonstrate the functionality of the other classes.

## How to Run
1. Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed.
2. Clone this repository.
3. Open a terminal in the project directory and navigate to the src directory.
4. Compile the Java files using the following command:
   ```sh
   javac *.java
