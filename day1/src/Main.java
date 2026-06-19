package src;

public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("I001", "Alice Johnson", "Java Development");
        Instructor instructor2 = new Instructor("I002", "Bob Smith", "React Development");

        Course course1 = new Course("C001", "Java Fundamentals", 14, "Beginner", "Programming", true);
        Course course2 = new Course("C002", "React Frontend Development", 21, "Intermediate", "Frontend", false);

        Student student1 = new Student("S001", "Charlie Brown", "cFq0l@example.com");
        Student student2 = new Student("S002", "Daisy Duck", "d4oQG@example.com");

        course1.assignInstructor(instructor1);
        course2.assignInstructor(instructor2);

        // 2 Course Offerings added
        CourseOffering offering1 = new CourseOffering("OFF001", "Java Fundamentals - June 2026 Intake", "2026-06-19",
                "2026-06-20", 25, "Physical");

        CourseOffering offering2 = new CourseOffering("OFF002", "React Frontend - July 2026 Intake", "2026-07-01",
                "2026-07-02", 30, "Online");

        // assign course + instructor for offering course
        offering1.assignInstructor(instructor1);
        offering2.assignInstructor(instructor2);

        offering1.setCourse(course1);
        offering2.setCourse(course2);

        System.out.println("");

        System.out.println("Instructor Profiles:");
        System.out.println("");
        instructor1.printProfile();
        System.out.println("");
        instructor2.printProfile();
        System.out.println("");

        System.out.println("Course Summaries:");
        System.out.println("");
        course1.printSummary();
        System.out.println("");
        course2.printSummary();
        System.out.println("");

        // print course offering
        System.out.println("Course Offering Summaries:");
        System.out.println("");
        offering1.printOfferingSummary();
        System.out.println("");
        offering2.printOfferingSummary();
        System.out.println("");

        System.out.println("Student Profiles:");
        System.out.println("");
        student1.printProfile();
        System.out.println("");
        student2.printProfile();
    }
}