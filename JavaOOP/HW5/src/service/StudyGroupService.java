package service;

import data.StudyGroup;
import data.Teacher;
import data.Student;
import java.util.ArrayList;
import java.time.LocalDate;



import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Long teacherId, List<Long> studentIds) {
        List<Student> students = new ArrayList<>();

        for (Long studentId : studentIds) {
            Student student = new Student("Имя студента", "Фамилия студента", "Отчество студента", LocalDate.now(), studentId);
            students.add(student);
        }

        Teacher teacher = new Teacher("Имя преподавателя", "Фамилия преподавателя", "Отчество преподавателя", LocalDate.now(), teacherId);
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}
