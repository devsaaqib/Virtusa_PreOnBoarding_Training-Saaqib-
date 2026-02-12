import java.util.Scanner;


public class textReplacment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence=sc.nextLine();

        System.out.println("Enter the word to be replaced: ");
        String oldword=sc.nextLine();

        System.out.println("New Word : ");
        String newword=sc.nextLine();

        String[] words= sentence.trim().split("\\s+");
        int wordCount=words.length;


        String upperCaseSentence=sentence.toUpperCase();

        StringBuilder sb=new StringBuilder(sentence);
        String reversedSentence=sb.reverse().toString();

        StringBuffer buffer=new StringBuffer(sentence);
        int startIndex =  buffer.indexOf(oldword);

        if (startIndex!= -1){
            buffer.replace( startIndex, startIndex+oldword.length(),newword);
        }

        String updatedSentence=buffer.toString();

        System.out.println("\nWord Count = " + wordCount);
        System.out.println("Uppercase Sentence = " + upperCaseSentence);
        System.out.println("Reversed Sentence = " + reversedSentence);
        System.out.println("Updated Sentence = " + updatedSentence);

        sc.close();
    }
}
