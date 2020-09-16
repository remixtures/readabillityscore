package readability;

public class Indexes {

    public static double automatedReadabilityIndex (int numberOfCharacters, int numberOfWords, int numberOfSentences) {
        return 4.71 * Averages.averageCharsPerWord(numberOfCharacters, numberOfWords)
                + 0.5 * Averages.averageWordsPerSentence(numberOfWords, numberOfSentences) - 21.43;
    }

    public static double fleschKincaidIndex(int numberOfSyllables, int numberOfWords, int numberOfSentences) {
        return 0.39 * Averages.averageWordsPerSentence(numberOfWords, numberOfSentences) +
                11.8 * Averages.averageSyllablesPerWord(numberOfSyllables, numberOfWords) - 15.59;
    }

    public static double smogIndex(int numberOfPolysyllables, int numberOfSentences) {
        return 1.043 * Math.sqrt(numberOfPolysyllables * 30 / numberOfSentences) + 3.1291;
    }

    public static double colemanLiauIndex(int numberOfCharacters, int numberOfWords, int numberOfSentences) {
        return 0.0588 * Averages.averageNumberOfCharactersPer100Words(numberOfCharacters, numberOfWords)
                - 0.296 * Averages.averageNumberOfSentencesPer100Words(numberOfSentences, numberOfWords) - 15.8;
    }
}