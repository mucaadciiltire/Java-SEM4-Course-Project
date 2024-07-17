public class Subject {
    private String name;
    private int creditHours;

    public Subject(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
    }

    public String getName() {
        return name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public char determineGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }
}
