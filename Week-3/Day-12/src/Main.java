import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> students = FileManager.loadStudents();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Save & Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter grade (A/B/C/D/F): ");
                        String g = sc.next().toUpperCase();

                        Grade grade = Grade.valueOf(g);

                        Student s = new Student(name, age, grade);

                        // Validate using custom annotation
                        Validator.validate(s);

                        students.add(s);
                        System.out.println("Student added successfully!");

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    FileManager.saveStudents(students);
                    FileManager.writeToTextFile(students);
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}