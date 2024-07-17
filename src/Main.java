
public class Main {
    public static void main(String[] args) {
        // Create subjects
        Subject math = new Subject("Math", 3);
        Subject science = new Subject("Science", 4);
        Subject history = new Subject("History", 2);

        // Create an array of subjects
        Subject[] subjects = {math, science, history};

        // Create student marks
        int[] std1Marks = {85, 92, 78};
        int[] std2Marks = {90, 88, 70};

        // Create students
        Student student1 = new Student(1, "Filsan", 20, subjects, std1Marks);
        Student student2 = new Student(2, "Calas", 21, subjects, std2Marks);

        // Create an array of students
        Student[] students = {student1, student2};

        // Create a Fasal
        Fasal myFasal = new Fasal("CS101", subjects, students);

        // Display Fasal details
        myFasal.displayFasalDetails();

        // Find and display a specific student by ID
        int searchId = 2;
        Student foundStudent = myFasal.findStudentById(searchId);
        if (foundStudent != null) {
            System.out.println("Found Student: " + foundStudent.getName() + " (ID: " + foundStudent.getId() + ")");
            System.out.println("Total Credit Hours: " + foundStudent.calculateTotalCreditHours());
            System.out.println("GPA: " + foundStudent.calculateGPA());
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        // Calculate and display average GPA of the Fasal
        double averageGPA = myFasal.calculateAverageGPA();
        System.out.println("Average GPA of the Fasal: " + averageGPA);
    }
}