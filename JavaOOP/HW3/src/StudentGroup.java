import java.util.List;
import java.util.ArrayList;

public class StudentGroup {
    private String groupName;
    private List<Student> students;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudents() {
        return students;
    }
}