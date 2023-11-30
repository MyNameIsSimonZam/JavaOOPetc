package data;

import java.time.LocalDate;

public class Teacher {
    private long teacherId;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public Teacher(String firstName, String lastName, String patronymic, LocalDate dateOfBirth, long teacherId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.teacherId = teacherId;
    }

    public long getTeacherId() {
        return teacherId;
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
