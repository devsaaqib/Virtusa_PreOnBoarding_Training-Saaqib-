import java.util.*;
import java.util.stream.*;

// ----------------------------------------
// Custom Exception Class
// ----------------------------------------
class InvalidResourceException extends Exception {
    public InvalidResourceException(String message) {
        super(message);
    }
}

// ----------------------------------------
// Resource Class
// ----------------------------------------
class Resource {

    String title;
    String type;
    int duration;

    // Constructor with validation
    public Resource(String title, String type, int duration) throws InvalidResourceException {

        if (title == null || title.isEmpty()) {
            throw new InvalidResourceException("Title cannot be empty");
        }

        if (duration <= 0) {
            throw new InvalidResourceException("Duration must be positive");
        }

        this.title = title;
        this.type = type;
        this.duration = duration;
    }

    // Getter methods
    public String getTitle() { return title; }
    public String getType() { return type; }
    public int getDuration() { return duration; }

    // toString method for display
    public String toString() {
        return title + " (" + type + ", " + duration + " mins)";
    }

    // Override equals() to avoid duplicates in Set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resource)) return false;
        Resource r = (Resource) o;
        return title.equals(r.title) && type.equals(r.type);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(title, type);
    }
}

// ----------------------------------------
// Generic Manager Class
// ----------------------------------------
class Manager<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }
}

// ----------------------------------------
// StudyPlanner Class (Core Logic)
// ----------------------------------------
class StudyPlanner {

    // Map → Subject → Set of Resources
    private Map<String, Set<Resource>> subjectResources = new HashMap<>();

    // Add resource
    public void addResource(String subject, Resource resource) {

        if (subject == null || subject.isEmpty()) {
            throw new RuntimeException("Subject cannot be empty");
        }

        subjectResources
            .computeIfAbsent(subject, k -> new HashSet<>())
            .add(resource);
    }

    // Get all resources
    public Set<Resource> getResources(String subject) {

        if (!subjectResources.containsKey(subject)) {
            throw new RuntimeException("Subject not found: " + subject);
        }

        return subjectResources.get(subject);
    }

    // ----------------------------------------
    // STREAM OPERATIONS
    // ----------------------------------------

    // Filter resources < 30 mins
    public List<Resource> getQuickResources(String subject) {

        return subjectResources.getOrDefault(subject, new HashSet<>())
                .stream()
                .filter(r -> r.getDuration() < 30)
                .collect(Collectors.toList());
    }

    // Sort resources by duration
    public List<Resource> getSortedResources(String subject) {

        return subjectResources.getOrDefault(subject, new HashSet<>())
                .stream()
                .sorted(Comparator.comparing(Resource::getDuration))
                .collect(Collectors.toList());
    }

    // Get only video resources
    public List<Resource> getVideos(String subject) {

        return subjectResources.getOrDefault(subject, new HashSet<>())
                .stream()
                .filter(r -> r.getType().equalsIgnoreCase("video"))
                .collect(Collectors.toList());
    }
}

// ----------------------------------------
// Main Class (Execution)
// ----------------------------------------
public class Main {

    public static void main(String[] args) {

        StudyPlanner planner = new StudyPlanner();

        try {
            // Adding resources
            planner.addResource("Java", new Resource("Streams Tutorial", "video", 25));
            planner.addResource("Java", new Resource("Collections Guide", "article", 40));
            planner.addResource("Java", new Resource("Lambda Basics", "video", 15));

            // Invalid input (for exception demo)
            planner.addResource("Java", new Resource("", "video", -10));

        } catch (InvalidResourceException e) {
            System.out.println("Invalid Resource Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime Error: " + e.getMessage());
        }

        // Display outputs
        try {
            System.out.println("\nAll Resources:");
            planner.getResources("Java").forEach(System.out::println);

            System.out.println("\nQuick Resources (<30 mins):");
            planner.getQuickResources("Java").forEach(System.out::println);

            System.out.println("\nSorted Resources:");
            planner.getSortedResources("Java").forEach(System.out::println);

            System.out.println("\nVideo Resources:");
            planner.getVideos("Java").forEach(System.out::println);

            // Trigger subject not found exception
            planner.getResources("Python");

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}