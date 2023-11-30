import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Alice", "Smith");
        Student student3 = new Student("Bob", "Johnson");

        StudentGroup group1 = new StudentGroup("Group 1");
        group1.addStudent(student1);
        group1.addStudent(student2);

        StudentGroup group2 = new StudentGroup("Group 2");
        group2.addStudent(student3);

        StudentsGroups allGroups1 = new StudentsGroups();
        allGroups1.addGroup(group1);
        allGroups1.addGroup(group2);

        StudentsGroups allGroups2 = new StudentsGroups();
        allGroups2.addGroup(group1);

        StudentsGroupsComparator comparator = new StudentsGroupsComparator();

        int result = comparator.compare(allGroups1, allGroups2);
        if (result < 0) {
            System.out.println("allGroups1 содержит меньше групп.");
        } else if (result > 0) {
            System.out.println("allGroups1 содержит больше групп.");
        } else {
            System.out.println("Количество групп в allGroups1 и allGroups2 одинаково.");
        }
    }
}