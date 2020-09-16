package readability;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadabilityScore {

    public void readability(File file) throws IOException {
        String textToAnalyze = readFileAsString(file);
        Scanner input = new Scanner(System.in);
        int numberOfCharacters = textToAnalyze.replaceAll("\\s","").split("").length;
        int numberOfWords = textToAnalyze.split("\\s").length;
        int numberOfSentences = textToAnalyze.split("(?:[!.?])").length;
        Pattern syllable = Pattern.compile("[aeiouy]+[^$e(,.:;!?)]");
        String[] result = syllable.split(textToAnalyze);
        int numberOfSyllables = result.length;
        Pattern polysyllable = Pattern.compile("[aeiouy]+[^$e(,.:;!?)][aeiouy]+[^$e(,.:;!?)][aeiouy]+[^$e(,.:;!?)]");
        String[] newResult = polysyllable.split(textToAnalyze);
        int numberOfPolysyllables = newResult.length;
        System.out.printf("The text is:%n%s%n%nWords: %d%nSentences: %d%nCharacters: %d%n" +
                        "Syllables: %d%nPolysyllables: %d%n",
                textToAnalyze, numberOfWords, numberOfSentences,
                numberOfCharacters, numberOfSyllables, numberOfPolysyllables);
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        String scoreIndexOption = input.next();
        System.out.println();
        ReadabilityOptions.userOptions(scoreIndexOption, numberOfCharacters, numberOfSyllables, numberOfPolysyllables, numberOfWords, numberOfSentences);
    }

    public static String readFileAsString(File file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(String.valueOf(file))));
    }
}
