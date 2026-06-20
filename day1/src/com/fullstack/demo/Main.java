package com.fullstack.demo;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(
                "C001",
                "Java Fundamentals",
                14,
                "Beginner",
                "Programming",
                true
        );

        Instructor instructor1 = new Instructor(
                "I001",
                "Alice Johnson",
                "Java Development"
        );

        Student student1 = new Student(
                "S001",
                "Charlie Brown",
                "charlie@example.com"
        );

        // Prints the exact course output shown in the assignment example.
        course1.printSummary();

        instructor1.printProfile();
        student1.printProfile();
    }
}
