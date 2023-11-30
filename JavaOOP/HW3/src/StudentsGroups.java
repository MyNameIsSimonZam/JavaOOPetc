import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroups implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;

    public StudentsGroups() {
        groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }
    public int getGroupCount() {
        return groups.size();
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}