
public class Fasal {

    private String name;
    private Subject[] subjects;
    private Student[] students;

    public Fasal(String name, Subject[] subjects, Student[] students) {
        this.name = name;
        this.subjects = subjects;
        this.students = students;
    }

    public void displayFasalDetails() {
        System.out.println("Fasal Name: " + name);
        System.out.println("Subjects:");
        for (Subject subject : subjects) {
            System.out.println("- " + subject.getName() + " (" + subject.getCreditHours() + " credit hours)");
        }
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName() + " (ID: " + student.getId() + ", Age: " + student.getAge() + ")");
        }
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public double calculateAverageGPA() {
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.calculateGPA();
        }
        return totalGPA / students.length;
    }
}
