import java.util.Comparator;
public class StudentsGroupsComparator implements Comparator<StudentsGroups> {
    @Override
    public int compare(StudentsGroups groups1, StudentsGroups groups2) {
        int count1 = groups1.getGroupCount();
        int count2 = groups2.getGroupCount();

        return Integer.compare(count1, count2);
    }
}