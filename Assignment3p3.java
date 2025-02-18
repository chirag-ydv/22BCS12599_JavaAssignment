import java.util.Scanner;

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

class Assignment3p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String course = "Advanced Java";
        String prerequisite = "Core Java";
        boolean prerequisiteCompleted = false;
        boolean courseFull = false;

        try {
            System.out.print("Enroll in Course: ");
            String selectedCourse = scanner.nextLine();

            if (!selectedCourse.equals(course)) {
                System.out.println("Course not available.");
                return;
            }

            System.out.print("Prerequisite: ");
            String selectedPrerequisite = scanner.nextLine();

            if (!selectedPrerequisite.equals(prerequisite)) {
                throw new PrerequisiteNotMetException("Error: PrerequisiteNotMetException - Complete Core Java before enrolling in Advanced Java.");
            }

            if (courseFull) {
                throw new CourseFullException("Error: CourseFullException - The course is full.");
            }

            System.out.println("Enrollment Successful for " + course);

        } catch (PrerequisiteNotMetException | CourseFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using the university enrollment system.");
            scanner.close();
        }
    }
}