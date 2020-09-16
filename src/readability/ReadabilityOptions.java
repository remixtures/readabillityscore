package readability;

public class ReadabilityOptions {

    public static void userOptions(String scoreIndexOptions, int numberOfCharacters, int numberOfSyllables,
                                          int numberOfPolysyllables, int numberOfWords, int numberOfSentences) {

        double ari = Indexes.automatedReadabilityIndex(numberOfCharacters, numberOfWords, numberOfSentences);
        double fk = Indexes.fleschKincaidIndex(numberOfSyllables, numberOfWords, numberOfSentences);
        double smog = Indexes.smogIndex(numberOfPolysyllables, numberOfSentences);
        double cl = Indexes.colemanLiauIndex(numberOfCharacters, numberOfWords, numberOfSentences);

        switch (scoreIndexOptions) {
            case "ARI":
                System.out.printf("Automated Readability Index: %.2f (about %s year olds).\n",
                        ari, AgeRange.getAgeRange((int) Math.ceil(ari)));
                break;
            case "FK":
                System.out.printf("Flesch–Kincaid readability tests: %.2f (about %s year olds).\n",
                        fk, AgeRange.getAgeRange((int) Math.ceil(fk)));
                break;
            case "SMOG":
                System.out.printf("Simple Measure of Gobbledygook: %.2f (about %s year olds).\n",
                        smog, AgeRange.getAgeRange((int) Math.ceil(smog)));
                break;
            case "CL":
                System.out.printf("Coleman–Liau index: %.2f (about %s year olds).\n",
                        cl, AgeRange.getAgeRange((int) Math.ceil(cl)));;
                break;
            case "all":
                System.out.printf("Automated Readability Index: %.2f (about %s year olds).\n",
                        ari, AgeRange.getAgeRange((int) Math.ceil(ari)));
                System.out.printf("Flesch–Kincaid readability tests: %.2f (about %s year olds).\n",
                        fk, AgeRange.getAgeRange((int) Math.ceil(fk)));
                System.out.printf("Simple Measure of Gobbledygook: %.2f (about %s year olds).\n",
                        smog, AgeRange.getAgeRange((int) Math.ceil(smog)));
                System.out.printf("Coleman–Liau index: %.2f (about %s year olds).\n",
                        cl, AgeRange.getAgeRange((int) Math.ceil(cl)));;
                break;
            default:
                System.out.println("invalid user option");
                break;
        }
    }
}
