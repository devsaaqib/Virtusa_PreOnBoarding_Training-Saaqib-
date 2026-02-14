import java.util.*;
import java.util.stream.Collectors;

public class TopScoringStudents {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rayan",85),
                new Student("Shyam",90),
                new Student("Gopal",78),
                new Student("Dhivyan",93),
                new Student("Sara",68)
        );

        List<String> top3Names= students.stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .limit(3)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Top 3 Name: "+top3Names);

    }

}
