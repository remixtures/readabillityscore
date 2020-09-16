package readability;

public class Averages {

    public static double averageCharsPerWord(int numberOfCharacters, int numberOfWords) {
        return (double) numberOfCharacters / (double) numberOfWords;
    }

    public static double averageWordsPerSentence(int numberOfWords, int numberOfSentences) {
        return (double) numberOfWords / (double) numberOfSentences;
    }

    public static double averageSyllablesPerWord(int numberOfSyllables, int numberOfWords) {
        return (double) numberOfSyllables / (double) numberOfWords;

    }

    public static double averageNumberOfCharactersPer100Words(int numberOfCharacters, int numberOfWords) {
        return (double) numberOfCharacters / (double) numberOfWords * 100;
    }

    public static double averageNumberOfSentencesPer100Words(int numberOfSentences, int numberOfWords) {
        return (double) numberOfSentences / (double) numberOfWords * 100;
    }
}