package controllers;

import data.Teacher;
import data.Student;
import data.StudyGroup;
import service.StudyGroupService;

import java.util.List;
import java.util.ArrayList;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        studyGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroupWithTeacherAndStudents(Teacher teacher, List<Student> students) {
        // Получить id студентов (их id)
        List<Long> studentIds = getStudentIds(students);

        // Получить id преподавателя (его id)
        Long teacherId = teacher.getTeacherId();

        // Формировать учебную группу путем вызова метода из сервиса
        StudyGroup studyGroup = studyGroupService.createStudyGroup(teacherId, studentIds);

        return studyGroup;
    }

    private List<Long> getStudentIds(List<Student> students) {
        List<Long> studentIds = new ArrayList<>();
        for (Student student : students) {
            studentIds.add(student.getStudentId());
        }
        return studentIds;
    }
}
