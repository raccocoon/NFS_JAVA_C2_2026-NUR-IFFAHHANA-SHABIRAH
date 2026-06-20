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

        System.out.println("=== Valid Course Test ===");
        try {
            Course valid = new Course("V001", "Valid Course", 10, "Beginner", "Programming", true);
            courseService.createCourse(valid);
            System.out.println("Course saved successfully.");
        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
        }

        System.out.println();
        System.out.println("=== Invalid Course Test ===");

        // Prepare base course for mutation
        Course base = new Course("B001", "Base Course", 10, "Beginner", "Cat", true);

        // Invalid: empty ID
        Course invalidId = mutateField(copyCourse(base), "courseId", "");
        testInvalid(courseService, invalidId);

        // Invalid: empty title
        Course invalidTitle = mutateField(copyCourse(base), "title", "");
        testInvalid(courseService, invalidTitle);

        // Invalid: duration 0
        Course invalidDuration = mutateField(copyCourse(base), "durationHours", 0);
        testInvalid(courseService, invalidDuration);

        // Invalid: empty level
        Course invalidLevel = mutateField(copyCourse(base), "level", "");
        testInvalid(courseService, invalidLevel);
    }

    private static Course copyCourse(Course source) {
        return new Course(source.getCourseId(), source.getTitle(), source.getDurationHours(), source.getLevel(), source.getCategory(), source.isActive());
    }

    private static Course mutateField(Course course, String fieldName, Object newValue) {
        try {
            Field f = Course.class.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.set(course, newValue);
            return course;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void testInvalid(CourseService service, Course course) {
        try {
            service.createCourse(course);
            System.out.println("ERROR: invalid course was saved: " + course.getCourseId());
        } catch (InvalidCourseException ex) {
            System.out.println("Validation error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Other error: " + ex.getMessage());
        }
    }
}
