package com.fullstack.demo;

import java.util.List;

import com.fullstack.demo.exception.InvalidCourseException;
import com.fullstack.demo.model.Course;
import com.fullstack.demo.repository.CourseRepository;
import com.fullstack.demo.repository.InMemoryCourseRepository;
import com.fullstack.demo.service.CourseService;

public class CourseServiceDemo {

    public static void main(String[] args) {
        CourseRepository courseRepository = new InMemoryCourseRepository();
        CourseService courseService = new CourseService(courseRepository);

        System.out.println("=== Create Courses ===");

        Course course1 = new Course("C001", "Java Fundamentals", 14, "Beginner", "Programming", true);
        Course course2 = new Course("C002", "React Frontend Development", 21, "Intermediate", "Frontend", true);
        Course course3 = new Course("C003", "MongoDB Basics", 14, "Beginner", "Database", true);

        saveCourse(courseService, course1);
        saveCourse(courseService, course2);
        saveCourse(courseService, course3);

        System.out.println();
        System.out.println("=== All Courses ===");
        List<Course> allCourses = courseService.getAllCourses();
        for (Course course : allCourses) {
            System.out.println(course.getCourseId() + " - " + course.getTitle());
        }

        System.out.println();
        System.out.println("=== Null Course Test ===");
        try {
            courseService.createCourse(null);
        } catch (InvalidCourseException ex) {
            System.out.println("Invalid course: " + ex.getMessage());
        }
    }

    private static void saveCourse(CourseService courseService, Course course) {
        Course savedCourse = courseService.createCourse(course);
        System.out.println("Course saved: " + savedCourse.getCourseId());
    }
}
