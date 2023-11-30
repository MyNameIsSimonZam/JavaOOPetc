import data.Teacher;
import service.TeacherService;
import view.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();

        // Создаем и добавляем преподавателей
        teacherService.create("Иван", "Иванов", "Иванович", LocalDate.of(1980, 5, 15));
        teacherService.create("Мария", "Петрова", "Александровна", LocalDate.of(1975, 9, 20));
        teacherService.create("Петр", "Сидоров", "Васильевич", LocalDate.of(1990, 2, 10));


        List<Teacher> teachers = teacherService.getAll();
        teacherView.sendOnConsole(teachers);
    }
}
