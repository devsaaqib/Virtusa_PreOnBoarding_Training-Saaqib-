import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static final String FILE_NAME = "students.ser";

    // Save list of students (Serialization)
    public static void saveStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Students saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load students
    public static List<Student> loadStudents() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Student>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Simple file handling (text file write)
    public static void writeToTextFile(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student s : students) {
                writer.write(s.toString());
                writer.newLine();
            }
            System.out.println("Data written to text file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}