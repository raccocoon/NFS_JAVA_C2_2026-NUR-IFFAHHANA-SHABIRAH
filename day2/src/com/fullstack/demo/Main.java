package com.fullstack.demo;

import java.util.ArrayList;

import com.fullstack.demo.model.Course;
import com.fullstack.demo.model.Instructor;
import com.fullstack.demo.model.Student;
import com.fullstack.demo.model.CourseOffering;

public class Main {

    public static void main(String[] args) {

        // COURSE LIST
        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course("C001", "Java Fundamentals", 14, "Beginner", "Programming", true));
        courses.add(new Course("C002", "React Frontend Development", 21, "Intermediate", "Frontend", true));
        courses.add(new Course("C003", "MongoDB Basics", 14, "Beginner", "Database", true));

        // INSTRUCTOR LIST
        ArrayList<Instructor> instructors = new ArrayList<>();

        Instructor i1 = new Instructor("I001", "Alice Johnson", "Java Development");
        Instructor i2 = new Instructor("I002", "Bob Smith", "Frontend Development");

        instructors.add(i1);
        instructors.add(i2);

        // STUDENT LIST
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("S001", "Charlie Brown", "charlie@gmail.com"));
        students.add(new Student("S002", "Daisy Duck", "daisy@gmail.com"));
        students.add(new Student("S003", "Ethan Lee", "ethan@gmail.com"));

        // COURSE OFFERINGS
        ArrayList<CourseOffering> offerings = new ArrayList<>();

        offerings.add(new CourseOffering(
                "O001",
                "Java Intake 1",
                courses.get(0),
                instructors.get(0),
                "2026-01-10",
                "2026-02-10",
                30,
                "Online"
        ));

        offerings.add(new CourseOffering(
                "O002",
                "Frontend Intake 1",
                courses.get(1),
                instructors.get(1),
                "2026-02-15",
                "2026-03-15",
                25,
                "In-Person"
        ));

        // PRINT COURSES
        for (Course course : courses) {
            course.printSummary();
        }

        // PRINT INSTRUCTORS
        for (Instructor instructor : instructors) {
            instructor.printProfile();
            System.out.println("----------------------------");
        }

        // PRINT STUDENTS
        for (Student student : students) {
            student.printProfile();
        }

        // PRINT OFFERINGS
        for (CourseOffering offering : offerings) {
            offering.printSummary();
            System.out.println("----------------------------");
        }
    }
}