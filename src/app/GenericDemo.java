package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenericDemo {

    public static void main(String[] args) {
        List<Human> humans = createStudentList()
                .stream()
                .map(student -> toHuman(student))
                .collect(Collectors.toList());

        List<Box<Human>> boxHumans = createStudentList()
                .stream()
                .map(student -> toBox(student))
                .collect(Collectors.toList());

        List<Box<? extends Human>> boundedBoxHumans = createStudentList()
                .stream()
                .map(student -> toBoundedBox(student))
                .collect(Collectors.toList());

        for(Box<? extends Human> b : boxHumans) {
            System.out.println(b.toString());
        }
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

    private static Box<?> toBoundedBox(Student student) {
        return new Box<>(student);
    }

    private static Box<Human> toBox(Student student) {
        return new Box<>(student);
    }
}
