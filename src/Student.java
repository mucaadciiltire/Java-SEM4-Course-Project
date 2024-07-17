
public class Student {

    private int id;
    private String name;
    private int age;
    private Subject[] subjects;
    private int[] marks;

    public Student(int id, String name, int age, Subject[] subjects, int[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int calculateTotalCreditHours() {
        int totalCreditHours = 0;
        for (Subject subject : subjects) {
            totalCreditHours += subject.getCreditHours();
        }
        return totalCreditHours;
    }

    public double calculateGPA() {
        int totalCreditHours = calculateTotalCreditHours();
        int totalQualityPoints = 0;

        for (int i = 0; i < subjects.length; i++) {
            int gradePoints;
            char grade = subjects[i].determineGrade(marks[i]);
            switch (grade) {
                case 'A':
                    gradePoints = 4;
                    break;
                case 'B':
                    gradePoints = 3;
                    break;
                case 'C':
                    gradePoints = 2;
                    break;
                case 'D':
                    gradePoints = 1;
                    break;
                case 'F':
                    gradePoints = 0;
                    break;
                default:
                    gradePoints = 0;
                    break;
            }
            totalQualityPoints += gradePoints * subjects[i].getCreditHours();
        }
        return (double) totalQualityPoints / totalCreditHours;
    }
}
