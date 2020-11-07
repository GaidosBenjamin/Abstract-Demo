package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenericDemo {

    public static void main(String[] args) {
        List<Human> humans = createStudentList()
                .stream()
                .map(GenericDemo::toHuman)
                .collect(Collectors.toList());
    }

    private static List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 22, "Yale"));
        students.add(new Student("George", 31, "Princeton"));
        students.add(new Student("Hilary", 27, "Harvard"));
        return students;
    }

    private static Human toHuman(Student student) {
        return student;
    }
}
