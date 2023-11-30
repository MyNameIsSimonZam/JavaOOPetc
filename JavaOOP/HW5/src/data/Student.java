package data;

import java.time.LocalDate;

public class Student {
    private long studentId;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public Student(String firstName, String lastName, String patronymic, LocalDate dateOfBirth, long studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
