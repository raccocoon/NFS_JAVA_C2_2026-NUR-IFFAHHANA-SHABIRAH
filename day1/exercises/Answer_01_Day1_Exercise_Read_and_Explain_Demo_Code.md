## Day 1 Exercise 01 - Code Explanation

### 1. What is the purpose of `Course.java`?

`Course.java` is a class used to represent a course in the system.

From `Main.java`, it is used to create a `Course` object :

```java
Course course1 = new Course(
    "C001",
    "Java Fundamentals",
    14,
    "Beginner");
```

It stores course information:
* Course ID  
* Course title  
* Duration in hours  
* Course level  
* Assigned instructor

It also contains methods to assign an instructor and print course details.

---

### 2. What is the purpose of `Instructor.java`?

`Instructor.java` represents an instructor in the system.

From `Main.java`, it is used to create `Instructor` object :
```java
Instructor instructor1 = new Instructor(
    "I001", 
    "Alice Johnson", 
    "Java Development");
```

It stores instructor information:
* Instructor ID
* Instructor name
* Area of expertise

It also contains methods to get the instructor's information and print the instructor's profile.

---

### 3. What is the purpose of `Student.java`?

`Student.java` represents a student object.

From `Main.java` :
```java
Student student1 = new Student(
    "S001", 
    "Charlie Brown", 
    "cFq0l@example.com");
```

It stores student information:
* studentId
* studentName
* email

It also contains methods to print student's profile.

---
### 4. What does the constructor do?

A constructor gives starting values to a new object when the object is created. Constructor name must match class name.

For example, the constructor in `Course.java` is :

```java
public Course(String courseId, String title, int durationHours, String level) {
    this.courseId = courseId;
    this.title = title;
    this.durationHours = durationHours;
    this.level = level;
    }
```

* Uses `this` to refer to current object. 
* When a new course is created, the constructor saves the course ID, title, duration, and level inside the object.

---
### 5. Why are the fields marked as `private`?

The fields are marked as `private` so that they cannot be changed directly from outside the class.

For example, from `Student.java` :
```java
private String studentId;
private String studentName;
private String email;
```

Access is controlled using methods to protect the object's data. This practice is known as ***encapsulation***.

---

### 6. What does `course1.assignInstructor(instructor1);` mean?

It means the instructor object called `instructor1` is assigned to the course object called `course1`.

It creates a relationship between the two objects:

```text
course1 → instructor1
```

This means the course now has an assigned instructor.

---

### 7. What does `student1.printProfile();` do?

It prints the student’s details to the console.

The details from `Student.java`:
```java
public void printProfile() {
System.out.println("Student ID: " + studentId);
System.out.println("Name: " + studentName);
System.out.println("Email: " + email);
}
```

## AI-Assisted Task

### Prompt given to AI

```text
Explain this Java class to someone who already knows Python or C++.
```

### 1. One explanation from AI that helped me

The explanation that helped me was that a Java constructor is similar to the `__init__()` method in Python.

Both are used to give starting values to an object when the object is created.

### 2. One part I still needed the trainer or my own reading to understand

I still needed my own reading to understand how the `this` keyword works. At first, I was confused because the same variable name appears twice in this statement :

```java
this.title = title;
```

After reading the Oracle Java Tutorials, I learned that this refers to the current object being created. In this statement :
- `this.title` refers to the ***title field belonging to the current object*** while
`title` refers to the ***parameter received by the constructor***

- The `this` keyword is needed here because the ***constructor parameter*** and the ***object's field*** have the same name

---
Source : Oracle Java Tutorials, Using the this Keyword. https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html?utm_source=chatgpt.com
