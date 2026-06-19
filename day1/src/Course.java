package src;

public class Course {
    private String courseId;
    private String title;
    private int durationHours;
    private String level;
    private Instructor instructor;

    // Add two new fields to Course.java
    private String category; 
    private boolean active;

    // Initialize Category and Active fields
    public Course(String courseId, String title, int durationHours, String level, 
                  String category, boolean active) {
        this.courseId = courseId;
        this.title = title;
        this.durationHours = durationHours;
        this.level = level;
        this.category = category;
        this.active = active;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public String getLevel() {
        return level;
    }

    // Getter for category course
    public String getCategory() {
        return category;
    }

    // Getter for whether course is active or inactive (boolean value)
    public boolean isActive() {
        return active;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void printSummary() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + durationHours + " hours");
        System.out.println("Level: " + level);

        System.out.println("Category: " + category); // print category field

        // print active status field
        if (active) {
            System.out.println("Status: Active");
        } else {
            System.out.println("Status: Inactive");
        }

        if (instructor == null) {
            System.out.println("Instructor: Not assigned yet");
        } else {
            System.out.println("Instructor: " + instructor.getInstructorName());
        }
    }
}

