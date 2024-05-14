import java.util.Comparator;

class Student {
    private String name;
    private int subjectMarks;

    public Student(String name, int subjectMarks) {
        this.name = name;
        this.subjectMarks = subjectMarks;
    }

    public String getName() {
        return name;
    }

    public int getSubjectMarks() {
        return subjectMarks;
    }
}

class StudentMarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getSubjectMarks(), s2.getSubjectMarks());
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anshul ", 85);
        Student student2 = new Student("Dvya", 90);

        StudentMarksComparator comparator = new StudentMarksComparator();
        int result = comparator.compare(student1, student2);

        if (result > 0) {
            System.out.println("Higher");
        } else if (result < 0) {
            System.out.println("Less");
        } else {
            System.out.println("Equal");
        }
    }
}
