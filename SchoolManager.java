import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(int id) {
        Student s = findStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
