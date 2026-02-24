import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    private String name;

    private int age;
    private Grade grade;

    public Student(String name, int age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}