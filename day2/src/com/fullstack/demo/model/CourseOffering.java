package com.fullstack.demo.model;

public class CourseOffering {

    private String offeringId;
    private String offeringName;
    private Course course;
    private Instructor instructor;
    private String startDate;
    private String endDate;
    private int capacity;
    private String deliveryMode;

    public CourseOffering(String offeringId,
                          String offeringName,
                          Course course,
                          Instructor instructor,
                          String startDate,
                          String endDate,
                          int capacity,
                          String deliveryMode) {

        setOfferingId(offeringId);
        setOfferingName(offeringName);
        setCourse(course);
        setInstructor(instructor);
        setStartDate(startDate);
        setEndDate(endDate);
        setCapacity(capacity);
        setDeliveryMode(deliveryMode);
    }

    // =========================
    // GETTERS
    // =========================

    public String getOfferingId() {
        return offeringId;
    }

    public String getOfferingName() {
        return offeringName;
    }

    public Course getCourse() {
        return course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    // =========================
    // SETTERS (WITH VALIDATION)
    // =========================

    public void setOfferingId(String offeringId) {
        this.offeringId = requireText(offeringId, "Offering ID");
    }

    public void setOfferingName(String offeringName) {
        this.offeringName = requireText(offeringName, "Offering Name");
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setStartDate(String startDate) {
        this.startDate = requireText(startDate, "Start Date");
    }

    public void setEndDate(String endDate) {
        this.endDate = requireText(endDate, "End Date");
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }
        this.capacity = capacity;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = requireText(deliveryMode, "Delivery Mode");
    }

    // =========================
    // PRINT METHOD
    // =========================

    public void printSummary() {
        System.out.println("Offering ID: " + offeringId);
        System.out.println("Name: " + offeringName);
        System.out.println("Course: " + (course != null ? course.getTitle() : "N/A"));
        System.out.println("Instructor: " + (instructor != null ? instructor.getInstructorName() : "Not assigned yet"));
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Capacity: " + capacity);
        System.out.println("Delivery Mode: " + deliveryMode);
        System.out.println("----------------------------");
    }

    // =========================
    // VALIDATION HELPER
    // =========================

    private static String requireText(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " is required.");
        }
        return value.trim();
    }
}