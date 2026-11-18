import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentCollectionDemo {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("S001", "Rina",
                "Computer Science", "Bandung"));

        students.add(new Student("S002", "Andi",
                10, "Cimahi"));

        students.add(new Student("S003", "Dewi",
                "Information Systems", "Garut"));

        students.add(new Student("S004", "Budi",
                "Computer Science", "Bandung"));

        students.add(new Student("S005", "Citra",
                20, "Sumedang"));

        System.out.println("Sebelum sort:");

        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(
            students,
            Comparator.comparing(Student::getName)
        );

        System.out.println("\nSetelah sort by name:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}