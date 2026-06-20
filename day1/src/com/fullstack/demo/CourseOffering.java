package src;

public class CourseOffering {

    private String offeringId;
    private String offeringName;
    private Course course;
    private Instructor instructor;
    private String startDate;
    private String endDate;
    private int capacity;

    private String deliveryMode; // extra field added

    // Constructor 
    public CourseOffering(String offeringId, String offeringName,
                          String startDate, String endDate,
                          int capacity, String deliveryMode) {

        this.offeringId = offeringId;
        this.offeringName = offeringName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.capacity = capacity;
        this.deliveryMode = deliveryMode;
    }

    // Getters
    public String getOfferingId() {
        return offeringId;
    }

    public String getOfferingName() {
        return offeringName;
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

    
    // Getters & Setters for Course and Instructor
    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }


    public Instructor getInstructor() {
        return instructor;
    }

    public void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Output
    public void printOfferingSummary() {
        System.out.println("Offering ID: " + offeringId);
        System.out.println("Offering Name: " + offeringName);

        if (course != null) {
            System.out.println("Course: " + course.getTitle());
        } else {
            System.out.println("Course: Not assigned");
        }

        if (instructor != null) {
            System.out.println("Instructor: " + instructor.getInstructorName());
        } else {
            System.out.println("Instructor: Not assigned");
        }

        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Capacity: " + capacity);
        System.out.println("Delivery Mode: " + deliveryMode);
        System.out.println("----------------------------");
    }
}