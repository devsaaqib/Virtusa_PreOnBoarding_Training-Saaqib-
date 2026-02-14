import java.util.*;
import java.util.stream.Collectors;

public class UniqueEmailValidator {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "a@gmail.com",
                "b@gmail.com",
                "c@gmail.com",
                "a@gmail.com",
                "d@gmail.com",
                "b@gmail.com"
        );

        Set<String> uniqueEmails = new HashSet<>();
        Set<String> duplicateEmails = emails.stream()
                .filter(email -> !uniqueEmails.add(email))
                .collect(Collectors.toSet());

        System.out.println("Total Unique Emails: " + uniqueEmails.size());
        System.out.println("Duplicate Emails: " + duplicateEmails);
    }
}