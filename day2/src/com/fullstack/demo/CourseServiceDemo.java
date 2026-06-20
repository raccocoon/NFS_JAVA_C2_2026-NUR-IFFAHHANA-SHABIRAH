package com.fullstack.demo;

import java.lang.reflect.Field;
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

        Course course1 = new Course("C001", "Java Fundamentals", 14, "Beginner", "Programming", true);
        Course course2 = new Course("C002", "React Frontend Development", 21, "Intermediate", "Frontend", true);
        Course course3 = new Course("C003", "MongoDB Basics", 14, "Beginner", "Database", true);
        Course course4 = new Course("C004", "Advanced Java Backend", 28, "Advanced", "Programming", true);

        courseService.createCourse(course1);
        courseService.createCourse(course2);
        courseService.createCourse(course3);
        courseService.createCourse(course4);

        System.out.println("=== Search by Title: java ===");
        courseService.searchByTitle("java").forEach(course ->
                System.out.println(course.getCourseId() + " - " + course.getTitle()));

        System.out.println();
        System.out.println("=== Search by Title: react ===");
        courseService.searchByTitle("react").forEach(course ->
                System.out.println(course.getCourseId() + " - " + course.getTitle()));

        System.out.println();
        System.out.println("=== Filter by Level: Beginner ===");
        courseService.filterByLevel("Beginner").forEach(course ->
                System.out.println(course.getCourseId() + " - " + course.getTitle()));

        System.out.println();
        System.out.println("=== Filter by Level: Advanced ===");
        courseService.filterByLevel("Advanced").forEach(course ->
                System.out.println(course.getCourseId() + " - " + course.getTitle()));
    }

}
